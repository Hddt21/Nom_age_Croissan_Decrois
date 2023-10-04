package fr.ill.fp.darryl;

import org.junit.jupiter.api.Test;
//importation des bibliotheques utilisées pour la suite proviennent de Assertions
import static org.junit.jupiter.api.Assertions.*;

class EleveGeneratorTest {
    @Test
    public void canGeneratedEleve (){
        EleveGenerator e = new EleveGenerator();
        Eleve result = e.get(); // retourne un éleve
        assertEquals("Darryl",result.getNom());// verifie l'égalité entre deux valeurs
        assertTrue(result.getNote()>=0.0 && result.getNote()<=19.0 );//vérifie une condition
    }

}