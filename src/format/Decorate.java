package format;

public enum Decorate {
    NORMAL("0"),
    NEGRITA("1"),
    CURSIVA("3"),
    SUBRAYADO("4");

    private final String code;

    Decorate(String code){
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
