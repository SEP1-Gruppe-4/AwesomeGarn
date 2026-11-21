package awesomegarn.domain;

import java.io.Serializable;

/**
 * Én registreret garnpost. Tænkt som UFORANDERLIG: en redigering opretter et nyt Yarn,
 * som erstatter det gamle via DataManager.updateYarn (ingen setters).
 * Implementerer Serializable, så beholdningen kan gemmes i en .bin-fil.
 */
public class Yarn implements Serializable {
    private static final long serialVersionUID = 1L;

    // Obligatoriske felter
    private YarnColor color;
    private Material material;
    private double weight;
    private int numberOfSkeins;

    // Valgfrie felter. null = ikke udfyldt
    private String fiberComposition;
    private String manufacturer;
    private String dyeLotNumber;         // String, så "007" ikke mister nuller
    private Double recommendedNeedleThickness;
    private WashingInstruction washingInstruction;

    // TODO: gør felterne final, når konstruktøren er lavet
    public Yarn(YarnColor color, Material material, double weight, int numberOfSkeins,
                String fiberComposition, String manufacturer, String dyeLotNumber,
                Double recommendedNeedleThickness, WashingInstruction washingInstruction) {
        // TODO: gem parametrene i felterne
    }

    // TODO: implementer getters
    public YarnColor getColor() { throw new UnsupportedOperationException("TODO"); }
    public Material getMaterial() { throw new UnsupportedOperationException("TODO"); }
    public double getWeight() { throw new UnsupportedOperationException("TODO"); }
    public int getNumberOfSkeins() { throw new UnsupportedOperationException("TODO"); }
    public String getFiberComposition() { throw new UnsupportedOperationException("TODO"); }
    public String getManufacturer() { throw new UnsupportedOperationException("TODO"); }
    public String getDyeLotNumber() { throw new UnsupportedOperationException("TODO"); }
    public Double getRecommendedNeedleThickness() { throw new UnsupportedOperationException("TODO"); }
    public WashingInstruction getWashingInstruction() { throw new UnsupportedOperationException("TODO"); }
}
