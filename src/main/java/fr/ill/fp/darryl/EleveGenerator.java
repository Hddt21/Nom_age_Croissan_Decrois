package fr.ill.fp.darryl;

import java.util.Random;
import java.util.function.Supplier;

public class EleveGenerator implements Supplier<Eleve> {
    @Override
    public Eleve get(){
        // classe random destiné a créer les taches aléatoires
        Random r = new Random();
        return new Eleve ("Darryl", r.nextDouble(0.0, 19.0));
    }
}
