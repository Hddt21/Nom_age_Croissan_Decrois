package org.example.beans;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        // Charger le fichier CSV depuis le dossier resources
       String csvFilePath = ("src/main/resources/personne.csv");
        try {
            System.out.println("Afficher par ordre croissant");
            List<Personnes> personnes = Files.lines(Paths.get(csvFilePath))
                    .skip(0) // Ignorer la première ligne
                    .map(line -> line.split(","))
                    .map(data -> new Personnes(data[0].trim(), Integer.valueOf(data[1].trim())))
                    //trier par age croissant et afficher
                    .sorted((personne1, personne2) -> Integer.compare(personne1.getAge(), personne2.getAge()))
                    .collect(Collectors.toList());
            // Afficher toutes les personnes du fichier CSV
            personnes.forEach(System.out::println);
            System.out.println("======================");
            System.out.println("Afficher par ordre croissant avec le comparateur");
            //8.3 Trier les Personnes BIS avec Comparator
            Comparator<Personnes> comparator = Comparator.comparing(Personnes::getAge); // Créer un comparateur par âge
            List<Personnes> personne = Files.lines(Paths.get(csvFilePath))
                    .skip(1) // Ignorer la première ligne
                    .map(line -> line.split(","))
                    .map(data -> new Personnes(data[0].trim(), Integer.valueOf(data[1].trim())))
                    // âge croissant en utilisant le comparateur
                    .sorted(comparator)
                    .collect(Collectors.toList());
            // Afficher les personnes triées par âge croissant
            personnes.forEach(System.out::println);

            System.out.println("======================");
            System.out.println("Afficher par ordre décroissant");
            // 8.4 Trier par age décroissant puis par prénom decroissant
            List<Personnes> personnes1 = Files.lines(Paths.get(csvFilePath))
                    .skip(0) // Ignorer la première ligne
                    .map(line -> line.split(","))
                    .map(data -> new Personnes(data[0].trim(), Integer.valueOf(data[1].trim())))
                    .sorted(Comparator.comparingInt(Personnes::getAge).reversed()
                            .thenComparing(Comparator.comparing(Personnes::getPrenom))) // Tri par âge décroissant, puis par nom croissant
                    .collect(Collectors.toList());
            personnes.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
