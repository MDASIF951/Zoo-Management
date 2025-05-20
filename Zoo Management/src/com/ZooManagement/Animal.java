package com.ZooManagement;

public abstract class Animal implements Eat {

    private String nameOfAnimal;
    private int weight;
    private int height;
    private int age;

    // Zero-parameterized constructor
    public Animal() {
        this.nameOfAnimal = "Unknown Animal";
    }

    // Parameterized constructor
    public Animal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
        this.weight = 200;
        this.height = 2;
        this.age = 5;
    }

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void eatingFood() {
        System.out.println("The animal: " + nameOfAnimal + " is eating.");
    }

    @Override
    public abstract void eatingCompleted();
}
