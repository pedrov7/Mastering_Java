package format;

public class Painting {
    private static final Format ROJO = new Format(Color.ROJO, Decorate.NEGRITA, Emphasis.BRILLANTE);
    private static final Format VERDE = new Format(Color.VERDE, Decorate.SUBRAYADO, Emphasis.FONDO_BRILLANTE);

    public static void main(String[] args) {
        System.out.println(ROJO + "en rojo" + Format.RESET);

        System.out.println(VERDE + "test"+ Format.RESET);
    }
}
