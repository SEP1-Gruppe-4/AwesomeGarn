package awesomegarn.presentation.core;

/** Dansk talformatering (komma som decimaltegn, punktum som tusindtalsseparator). */
public final class NumberText {

    private NumberText() { }

    /** Fx 4,5 eller 100 (højst to decimaler, ingen tusindtalsseparator). Bruges i formularer og søgning. */
    public static String plain(double value) {
        // TODO: DecimalFormat("0.##") med dansk DecimalFormatSymbols
        throw new UnsupportedOperationException("TODO");
    }

    /** Fx 18.250 eller 1.175,5. Bruges til visning af vægt. */
    public static String grouped(double value) {
        // TODO: DecimalFormat("#,##0.##") med dansk DecimalFormatSymbols
        throw new UnsupportedOperationException("TODO");
    }
}
