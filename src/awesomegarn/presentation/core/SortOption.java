package awesomegarn.presentation.core;

import awesomegarn.domain.Yarn;

import java.util.Comparator;

/**
 * Hvilket felt der sorteres på, og i hvilken retning (FK-06). field == null betyder ingen sortering
 * (så vises garn i indtastningsrækkefølge).
 * Navnene i SortField bruges som id på kolonneoverskrifterne i YarnOverview.fxml.
 */
public class SortOption {

    public enum SortField {
        COLOR, WEIGHT, SKEINS, MATERIAL, MANUFACTURER, NEEDLE, WASHING, DYE_LOT, FIBER
    }

    public static final SortOption NONE = new SortOption(null, true);

    public SortOption(SortField field, boolean ascending) {
        // TODO
    }

    public SortField getField() { throw new UnsupportedOperationException("TODO"); }

    public boolean isAscending() { throw new UnsupportedOperationException("TODO"); }

    /**
     * Comparator for det valgte felt. Tekst sorteres alfabetisk (dansk, Collator), tal efter talværdi.
     * Tomme (null) værdier havner altid til sidst, uanset retning.
     */
    public Comparator<Yarn> comparator() {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
