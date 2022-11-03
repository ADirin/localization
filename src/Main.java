import java.text.DateFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {


    public static String lan;
    public static String country;
    public static boolean test = true;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the prefered Langues");
        lan = scan.nextLine();
        System.out.println("Enter the country");
        country = scan.nextLine();
        country.toUpperCase();

        if (lan != "su" ) {

            System.out.println(lan+ ""+country);
           Locale l = new Locale(lan, country);
            ResourceBundle r = ResourceBundle.getBundle("Bundle", l);
            String str = r.getString("wish");
            System.out.println(str);

        } if (lan =="en" | country =="UK") {
            System.out.println(lan);
            Locale l = new Locale(lan, country);
            ResourceBundle r = ResourceBundle.getBundle("Bundle", l);
            String str = r.getString("wish");
            System.out.println(str);
        }

    }

}
