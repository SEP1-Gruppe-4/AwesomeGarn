package awesomegarn.persistence;

import java.io.Serializable;

/**
 * Den "kasse", der gemmes i .bin-filen: indeholder alle data, programmet skal huske.
 * Lige nu er det kun beholdningen af garn (en List<Yarn>). Yarn skal derfor være Serializable.
 */
public class DataContainer implements Serializable {
    private static final long serialVersionUID = 1L;

    // TODO: private List<Yarn> yarns;  + konstruktør og getter
}
