package awesomegarn.domain;

/** Vaskeanvisninger svarende til ikonerne i mockuppen. */
public enum WashingInstruction {
    HAND_WASH("Håndvask", "wash_hand"),
    WASH_20("20 °C", "wash_20"),
    WASH_30("30 °C", "wash_30"),
    WASH_40("40 °C", "wash_40"),
    WASH_50("50 °C", "wash_50"),
    WASH_60("60 °C", "wash_60"),
    WASH_90("90 °C", "wash_90");

    private final String label;
    private final String iconName;   // filnavn i resources/images (uden .png)

    WashingInstruction(String label, String iconName) {
        this.label = label;
        this.iconName = iconName;
    }

    public String getLabel() { return label; }
    public String getIconName() { return iconName; }

    @Override
    public String toString() { return label; }
}
