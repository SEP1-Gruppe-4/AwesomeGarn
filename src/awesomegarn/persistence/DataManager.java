package awesomegarn.persistence;

import awesomegarn.domain.Yarn;

import java.util.List;

/**
 * Eneste indgang til beholdningen. Controllerne kender kun dette interface (ikke FileDataManager).
 * Alle ændringer gemmes straks (IFK-5). Kan dataene ikke læses eller gemmes, kastes DataStorageException,
 * og beholdningen skal da stå uændret.
 */
public interface DataManager {

    /** Read: hele beholdningen i indtastningsrækkefølge. */
    List<Yarn> getAllYarns();

    /** Create: tilføjer garnet til slutningen af beholdningen. */
    void addYarn(Yarn yarn);

    /** Update: erstatter original med updated på samme position. */
    void updateYarn(Yarn original, Yarn updated);

    /** Delete: fjerner garnet permanent (FK-08). */
    void deleteYarn(Yarn yarn);
}
