package fr.ill.fp.darryl;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.ConstantBootstraps;
import java.util.function.Consumer;
//@Slf4j
public class ConsumeEleve implements Consumer<Eleve> {
    public Logger log = LoggerFactory.getLogger(ConsumeEleve.class);
    @Override
    public void accept(Eleve eleve){
        log.info("{}", eleve);
    }
}
