package com.cbnoah.animal;

public class Animal {
    private final String name;
    private final String sound;
    private final int age;

    public Animal(String name, String sound, int age) {
        this.name = name;
        this.sound = sound;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public int getAge() {
        return age;
    }

    public static String commonRule() {
        return "All animals need food and water to survive.";
    }
}
