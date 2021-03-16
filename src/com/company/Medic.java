package com.company;

public class Medic extends Hero implements HavingSuperAbility {
    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Heals - " + superAbilityType;
    }
}
