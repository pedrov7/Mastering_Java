package format;

public enum Emphasis {

    NORMAL("3"),
    BRILLANTE("9"),
    FONDO("4"),
    FONDO_BRILLANTE("10");
    private final String code;

    Emphasis(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
