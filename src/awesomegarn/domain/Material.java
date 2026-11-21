package awesomegarn.domain;

/** Primært materiale (FK-03). chartColor bruges til statistik-diagrammet. */
public enum Material {
    WOOL("Uld", "#57ADD5"),
    POLYESTER("Polyester", "#8FA179"),
    ACRYLIC("Akryl", "#F48C8A"),
    COTTON("Bomuld", "#BB94D0");

    private final String label;
    private final String chartColor;

    Material(String label, String chartColor) {
        this.label = label;
        this.chartColor = chartColor;
    }

    public String getLabel() { return label; }
    public String getChartColor() { return chartColor; }

    @Override
    public String toString() { return label; }
}
