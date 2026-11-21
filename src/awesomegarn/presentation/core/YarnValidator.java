package awesomegarn.presentation.core;

/**
 * Validerer formularinput efter FK-01 og FK-02. Fejlbeskeder skal sige, hvad der er galt og hvordan det rettes (IFK-2).
 *
 * Regler (kun fra materialet):
 *  - Farve og materiale skal være valgt.
 *  - Vægt: tal større end 0 (komma eller punktum som decimaltegn).
 *  - Antal nøgler: helt tal på mindst 1.
 *  - Pindetykkelse: hvis udfyldt, et tal større end 0.
 */
public class YarnValidator {

    public ValidationResult validate(YarnData data) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /** Læser et tal med komma eller punktum. Returnerer null, hvis teksten ikke er et tal (afvis fx "abc", "NaN", "5d"). */
    public static Double parseNumber(String text) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /** Læser et helt tal. Returnerer null, hvis teksten ikke er et helt tal. */
    public static Integer parseSkeins(String text) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
