package fr.ill.fp.darryl;

import java.util.function.Function;

public class MapAge implements Function <Integer,String> {

    @Override
    public String apply(Integer age) {
        return "j'ai"+age+ " ans";
    }
}
