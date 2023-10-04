package fr.ill.fp.darryl;

import static org.junit.jupiter.api.Assertions.*;

class MapNoteEleveTest {
    public void shouldGetEleve () {
        MapNoteEleve m = new MapNoteEleve();
        Eleve e = new Eleve("Darryl", 19.0);
        Double result = m.apply(e);
        // assertEquals(result.doubleValue() && result.doubleValue()=19.0);

    }
}