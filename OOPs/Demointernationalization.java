import java.util.Locale;
import java.util.ResourceBundle;

public class Demointernationalization {

	public static void main(String[] args) {
		Locale loc = new Locale("hi" ,  "in");
		// i18n demo
		ResourceBundle bundle= ResourceBundle.getBundle("greeting",loc);
		System.out.println(bundle.getString("message"));
	}

}
