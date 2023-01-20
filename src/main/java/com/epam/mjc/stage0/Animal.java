package com.epam.mjc.stage0;

public class Animal {
    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        return String.format("This animal is mostly %s. It has %s and %s fur.", color, numberOfPaws == 1 ? "1 paw" : numberOfPaws + " paws", hasFur ? "a" : "no");
    }
}
