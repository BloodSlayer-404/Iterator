package org.example;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class PokemonTeam implements PokemonColection{
    private List<Pokemon> pokemons = new ArrayList<>();

    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    /**
     * Returns a new Pokemon Team Iterator
     * @return A new Pokemon Team Iterator
     */
    @Override
    public Iterator createIterator() {
        return new IteratorPokemonTeam(pokemons);
    }
}
