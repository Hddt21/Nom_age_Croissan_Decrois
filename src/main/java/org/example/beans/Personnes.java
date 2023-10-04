package org.example.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class Personnes {
    private String prenom;
    private Integer age;

    public Personnes(String prenom, String age){
        this.prenom = prenom;
        this.age = Integer.valueOf(age);}
        @Override
        public String toString(){
            return "Personne " + prenom + " age " +age+":";
        }
    }

