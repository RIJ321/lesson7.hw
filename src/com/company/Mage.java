package com.company;

public class Mage extends Hero implements HavingSuperAbility {
    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Magic hit - " + superAbilityType;
    }
}
