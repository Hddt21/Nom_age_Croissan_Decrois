package fr.ill.fp.darryl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;

import static org.junit.jupiter.api.Assertions.*;

class ConsumeEleveTest {
@Test
    public void shouldLogInfo() {
    //Instancier la classe ConsumeEleve
    ConsumeEleve consumeEleve = new ConsumeEleve();
    //Donner une valeur a la propriété Log en créant un Mock (créer une simulation)
    Logger mockLogger = Mockito.mock(Logger.class);
    consumeEleve.log = mockLogger;
    //Instancier un éleve
   Eleve eleve = new Eleve("Darryl Henke", 19.0);
    //Tester la methode Accept()
    consumeEleve.accept(eleve);
    //Vérifier que log.info("()", Eleve)
    Mockito.verify(mockLogger, Mockito.times(1)).info("{}",eleve);
    }


}