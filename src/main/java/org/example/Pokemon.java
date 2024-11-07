package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class Pokemon {

    @Getter
    private String name;
    private List<String> attacks;

    /**
     * Checks if the Pokemon can use the specified attack
     * @param attack: The attack to check if the Pokemon has
     * @return True if the Pokemon has the specified attack, else returns false
     */
    public boolean canUse(String attack) {
        return attacks.contains(attack);
    }
}
