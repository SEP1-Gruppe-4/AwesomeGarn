package awesomegarn.persistence;

/**
 * Kastes af DataManager, når beholdningen ikke kan indlæses fra eller gemmes i datafilen.
 * Er unchecked (RuntimeException), så metoderne i DataManager ikke skal deklarere den.
 * Controllerne fanger den og viser beskeden via ViewManager.showStorageError(...).
 */
public class DataStorageException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DataStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
