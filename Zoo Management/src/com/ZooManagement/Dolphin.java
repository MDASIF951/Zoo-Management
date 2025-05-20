package com.ZooManagement;

public class Dolphin extends Animal implements Swim, Eat {
    private String color;
    private int swimmingSpeed;

    public Dolphin() {
        super("Dolphin");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
    	this.swimmingSpeed = swimmingSpeed;
    }
    
    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    @Override
    public void eatingFood() {
    	System.out.println("Dolphin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
    	System.out.println("Dolphin: I have eaten fish.");
    }
    
    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed " + swimmingSpeed);
    }
}
