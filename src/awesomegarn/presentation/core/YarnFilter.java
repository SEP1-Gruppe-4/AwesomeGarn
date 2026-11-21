package awesomegarn.presentation.core;

import awesomegarn.domain.Material;
import awesomegarn.domain.Yarn;
import awesomegarn.domain.YarnColor;

/**
 * De fire filtre fra mockuppen (farve, materiale, producent, pind) plus søgetekst (FK-09, FK-10).
 * Alle aktive betingelser skal være opfyldt (AND). null = "Alle".
 */
public class YarnFilter {

    // TODO: felter: color, material, manufacturer, needleThickness, searchText (start som tom tekst)

    public YarnColor getColor() { throw new UnsupportedOperationException("TODO"); }
    public void setColor(YarnColor color) { /* TODO */ }
    public Material getMaterial() { throw new UnsupportedOperationException("TODO"); }
    public void setMaterial(Material material) { /* TODO */ }
    public String getManufacturer() { throw new UnsupportedOperationException("TODO"); }
    public void setManufacturer(String manufacturer) { /* TODO */ }
    public Double getNeedleThickness() { throw new UnsupportedOperationException("TODO"); }
    public void setNeedleThickness(Double needleThickness) { /* TODO */ }
    public String getSearchText() { throw new UnsupportedOperationException("TODO"); }
    public void setSearchText(String searchText) { /* TODO */ }

    /** Nulstiller de fire filtre. Søgeteksten røres IKKE. */
    public void reset() {
        // TODO
    }

    /** True, hvis mindst ét af de fire filtre er aktivt. */
    public boolean hasActiveFilters() { throw new UnsupportedOperationException("TODO"); }

    /** True, hvis et filter eller en søgning er aktiv (bruges til "Viser X af Y garn"). */
    public boolean isNarrowing() { throw new UnsupportedOperationException("TODO"); }

    /**
     * True, hvis garnet opfylder alle filtre og søgningen.
     * Søgning: ikke case-sensitiv, delstreng i alle tekstfelter (farve, materiale, vægt, nøgler,
     * fibersammensætning, producent, indfarvningsnr., pindetykkelse, vaskeanvisning).
     */
    public boolean matches(Yarn yarn) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
