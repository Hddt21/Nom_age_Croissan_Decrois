package fr.ill.fp.darryl;

import java.util.function.Function;

public class MapNoteEleve implements Function<Eleve, Double> {
    @Override
    public Double apply(Eleve eleve){
        return eleve.getNote();
    }

}
