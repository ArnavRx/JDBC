

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import java.nio.ByteBuffer;

import java.nio.channels.ReadableByteChannel;

import java.nio.channels.WritableByteChannel;

public class ChannelExample {

	@SuppressWarnings("resource")

	public static void main(String[] args) throws IOException {

		// Path Of The Input Text File
		long startTime = System.currentTimeMillis();

		FileInputStream input = new FileInputStream("D://copy/NPSWF32.dll");

		ReadableByteChannel source = input.getChannel();

		// Path Of The Output Text File

		FileOutputStream output = new FileOutputStream("D://Demo/song.txt");
		WritableByteChannel destination = output.getChannel();

		copyData(source, destination);

		System.out.println("! File Successfully Copied From Source To Desitnation !");
		System.out.println(System.currentTimeMillis()-startTime);

	}

	private static void copyData(ReadableByteChannel source, WritableByteChannel destination) throws IOException {

		ByteBuffer buffer = ByteBuffer.allocateDirect(1024);

		while (source.read(buffer) != -1) {

			// The Buffer Is Used To Be Drained

			buffer.flip();

			// Make Sure That The Buffer Was Fully Drained

			while (buffer.hasRemaining()) {

				destination.write(buffer);

			}

			// Now The Buffer Is Empty!

			buffer.clear();

		}
	}
}
