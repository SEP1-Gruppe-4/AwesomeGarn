package awesomegarn.domain;

public enum YarnColor {
    RED("Rød", "yarn_red"),
    YELLOW("Gul", "yarn_yellow"),
    GREEN("Grøn", "yarn_green"),
    BLUE("Blå", "yarn_blue"),
    ORANGE("Orange", "yarn_orange"),
    PURPLE("Lilla", "yarn_purple");

    private final String label;
    private final String iconName;

    YarnColor(String label, String iconName) {
        this.label = label;
        this.iconName = iconName;
    }

    public String getLabel() { return label; }
    public String getIconName() { return iconName; }

    @Override
    public String toString() { return label; }
}
