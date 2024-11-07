package org.example;

import java.util.List;


public class IteratorPokemonTeam implements Iterator{

    private List<Pokemon> pokemons;
    private int actualPos;

    public IteratorPokemonTeam(List<Pokemon> pokemons){
        this.pokemons = pokemons;
        actualPos = 0;
    }

    @Override
    public boolean hasNext() {
        return actualPos < pokemons.size();
    }

    /**
     * Returns the next Pokemon in the Pokemon Team
     * @return The next Pokemon in the Pokemon Team
     */
    @Override
    public Pokemon next() {
        if (hasNext()){
            return pokemons.get(actualPos++);
        }
        return null;
    }
}
