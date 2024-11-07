package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class PokemonTest {
    PokemonTeam team = new PokemonTeam();
    Iterator iterator = team.createIterator();
    boolean[] results = new boolean[6];
    int resultCounter = 0;
    String necesaryHM;

    /**
     * Set up the team for the tests
     */
    @BeforeEach
    void setTeam(){
        team.addPokemon(new Pokemon("Swampert", List.of("Surf", "Dive")));
        team.addPokemon(new Pokemon("Zigzagoon", List.of("Cut", "Strength")));
        team.addPokemon(new Pokemon("Wingull", List.of("Fly")));
        team.addPokemon(new Pokemon("Tropius", List.of("Fly", "Cut")));
    }

    /**
     * Check if in the team the pokemons that have the HM waterfall
     */
    @Test
    void checkWaterfallInTeam(){
        necesaryHM = "Waterfall";
        boolean[] expectedResults = {false, false, false, false, false, false};

        while (iterator.hasNext()){
            Pokemon pokemon = (Pokemon) iterator.next();
            results[resultCounter] = pokemon.canUse(necesaryHM);
            resultCounter++;
        }

        assertArrayEquals(expectedResults, results);


    }

    /**
     * Check if in the team the pokemons that have the HM cut
     */
    @Test
    void checkCutInTeam(){
        necesaryHM = "Cut";
        boolean[] expectedResults = {false, true, false, true, false, false};

        while (iterator.hasNext()){
            Pokemon pokemon = (Pokemon) iterator.next();
            results[resultCounter] = pokemon.canUse(necesaryHM);
            resultCounter++;
        }

        assertArrayEquals(expectedResults, results);
    }

    /**
     * Check if in the team the pokemons that have the HM fly
     */
    @Test
    void checkFlyInTeam(){
        necesaryHM = "Fly";
        boolean[] expectedResults = {false, false, true, true, false, false};

        while (iterator.hasNext()){
            Pokemon pokemon = (Pokemon) iterator.next();
            results[resultCounter] = pokemon.canUse(necesaryHM);
            resultCounter++;
        }

        assertArrayEquals(expectedResults, results);
    }

    /**
     * Check if in the team the pokemons that have the HM surf
     */
    @Test
    void checkSurfInTeam(){
        necesaryHM = "Surf";
        boolean[] expectedResults = {true, false, false, false, false, false};

        while (iterator.hasNext()){
            Pokemon pokemon = (Pokemon) iterator.next();
            results[resultCounter] = pokemon.canUse(necesaryHM);
            resultCounter++;
        }

        assertArrayEquals(expectedResults, results);
    }
}