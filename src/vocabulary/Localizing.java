package vocabulary;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Localizing {

    private static final ResourceBundle RESOURCES =
            ResourceBundle.getBundle("vocabulary.vocabulary");
//            ResourceBundle.getBundle("vocabulary.vocabulary", Locale.UK);

    private static String buildSubject(String name, String adjetive) {
        return MessageFormat.format(RESOURCES.getString("subject"), name, adjetive);
    }

    private static String buildSubject2(String name, String adjetive, String tamano) {
        return MessageFormat.format(RESOURCES.getString("subject2"), name, adjetive, tamano);
    }

    public static void main(String[] args) {
        System.out.println(
                buildSubject(
                        RESOURCES.getString("manzana"),
                        RESOURCES.getString("verde")));

        System.out.println(
                buildSubject(
                        RESOURCES.getString("manzana"),
                        RESOURCES.getString("roja")));

        System.out.println(
                buildSubject(
                        RESOURCES.getString("pelota1"),
                        RESOURCES.getString("verde")));

        System.out.println(
                buildSubject(
                        RESOURCES.getString("pelota1"),
                        RESOURCES.getString("verde")));

        System.out.println(MessageFormat.format(
                RESOURCES.getString("phrase"),
                buildSubject2(RESOURCES.getString("pelota1"),
                        RESOURCES.getString("roja"), RESOURCES.getString("tamano"))));
    }
}
