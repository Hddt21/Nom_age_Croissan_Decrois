package fr.ill.fp.darryl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
//@AllArgsConstructor
@Getter
@ToString
public class Eleve {
    private String nom;
    @Setter
    private Double note;

    public Eleve(String nom, Double note){
        this.nom=nom;
        this.note=note;
    }
}


