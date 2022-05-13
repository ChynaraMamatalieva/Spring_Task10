package org.example;

public class Cat implements Animal{

    private String name;
    private String color;
    private String breed;

    public Cat() {
    }

    public Cat(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void animalPlus() {
        System.out.println("init method");

    }

    @Override
    public void animalMinus() {
        System.out.println("destroy method");

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
