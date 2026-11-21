package awesomegarn.presentation.core;

import java.util.List;

/** Resultatet af en validering: en liste af fejl (felt + besked). */
public class ValidationResult {

    public enum Field { COLOR, MATERIAL, WEIGHT, SKEINS, NEEDLE }

    public static class FieldError {
        public FieldError(Field field, String message) {
            // TODO
        }

        public Field getField() { throw new UnsupportedOperationException("TODO"); }
        public String getMessage() { throw new UnsupportedOperationException("TODO"); }
    }

    public void add(Field field, String message) {
        // TODO
    }

    public boolean isValid() { throw new UnsupportedOperationException("TODO"); }

    public List<FieldError> getErrors() { throw new UnsupportedOperationException("TODO"); }
}
