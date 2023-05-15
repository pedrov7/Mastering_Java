package Format;

import javax.swing.plaf.SeparatorUI;

public class Format {
    private static final String PREFIX = "\033[";
    private static final String SUFFIX = "m";
    protected static final String RESET = PREFIX + "0" + SUFFIX;
    private Color color;
    private Decorate decorate;
    private Emphasis emphasis;

    public Format(Color color, Decorate decorate, Emphasis emphasis) {
        this.color = color;
        this.decorate = decorate;
        this.emphasis = emphasis;
    }

    @Override
    public String toString() {
        return PREFIX + decorate +";" + emphasis +color + SUFFIX;
    }
}
