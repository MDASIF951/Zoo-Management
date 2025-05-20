package com.ZooManagement;

public class Penguin extends Animal implements Walk, Swim, Eat {
	
    private int walkSpeed;
    private int swimSpeed;
    private boolean isSwimming;

    public Penguin() {
        super("Penguin");
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public boolean getIsSwimming() {
        return isSwimming;
    }

    public void setIsSwimming(boolean isSwimming) {
        this.isSwimming = isSwimming;
    }

    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish.");
    }

    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed " + swimSpeed + " nautical miles per hour");
    }

    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed " + walkSpeed + " mph");
    }
}
