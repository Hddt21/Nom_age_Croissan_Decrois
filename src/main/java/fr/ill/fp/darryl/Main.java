package fr.ill.fp.darryl;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@ToString
@Slf4j
public class Main {
    public static void main(String[] args) {
      Function<Integer,String> donneAge = (Integer age) -> " J'ai " +age+ " ans";
        System.out.println(donneAge.apply(20));
        Consumer<Integer> donneAge2 = (Integer nmbre) -> {
            System.out.println(" J'ai " +nmbre+ " ans");
        };
        donneAge2.accept(23);
        Supplier<LocalDate> maDate = () -> {
            return LocalDate.now();
        };
//    MapAge age = Integer age
    }

}