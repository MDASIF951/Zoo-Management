package com.ZooManagement;
	
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;

        Tiger tiger = new Tiger();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();
        
        do {
            int animalChoice = animalChoiceMenu(scanner);

            switch (animalChoice) {
                case 1: // Tiger
                    do {
                        System.out.println("The animal which is chosen is: " + tiger.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(scanner, tiger);

                        switch (menuChoice) {
                            case 1: // Set properties
                                System.out.println("Enter age:");
                                tiger.setAge(scanner.nextInt());

                                System.out.println("Enter height:");
                                tiger.setHeight(scanner.nextInt());

                                System.out.println("Enter weight:");
                                tiger.setWeight(scanner.nextInt());

                                System.out.println("Enter number of stripes:");
                                tiger.setNumberOfStripes(scanner.nextInt());

                                System.out.println("Enter speed:");
                                tiger.setSpeed(scanner.nextInt());

                                System.out.println("Enter roar sound level:");
                                tiger.setSoundLevel(scanner.nextInt());
                                break;

                            case 2: // Display properties
                                System.out.println("Age: " + tiger.getAge());
                                System.out.println("Height: " + tiger.getHeight());
                                System.out.println("Weight: " + tiger.getWeight());
                                System.out.println("Stripes: " + tiger.getNumberOfStripes());
                                System.out.println("Speed: " + tiger.getSpeed());
                                System.out.println("Roar Level: " + tiger.getSoundLevel());
                                break;

                            case 3: // Movement
                                tiger.walking();
                                break;

                            case 4: // Eating
                                tiger.eatingFood();
                                tiger.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid option");
                        }

                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = scanner.nextInt();

                    } while (continueInnerLoop == 1);
                    break;

                case 2: // Dolphin
                    do {
                        System.out.println("The animal which is chosen is: " + dolphin.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(scanner, dolphin);

                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter age:");
                                dolphin.setAge(scanner.nextInt());

                                System.out.println("Enter height:");
                                dolphin.setHeight(scanner.nextInt());

                                System.out.println("Enter weight:");
                                dolphin.setWeight(scanner.nextInt());

                                System.out.println("Enter color:");
                                dolphin.setColor(scanner.next());

                                System.out.println("Enter swimming speed:");
                                dolphin.setSwimmingSpeed(scanner.nextInt());
                                break;

                            case 2:
                                System.out.println("Age: " + dolphin.getAge());
                                System.out.println("Height: " + dolphin.getHeight());
                                System.out.println("Weight: " + dolphin.getWeight());
                                System.out.println("Color: " + dolphin.getColor());
                                System.out.println("Swimming Speed: " + dolphin.getSwimmingSpeed());
                                break;

                            case 3:
                                dolphin.swimming();
                                break;

                            case 4:
                                dolphin.eatingFood();
                                dolphin.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid option");
                        }

                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = scanner.nextInt();

                    } while (continueInnerLoop == 1);
                    break;

                case 3:
                    do{
                        System.out.println("The animal which is chosen is : " + penguin.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(scanner, penguin);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Is the penguin swimming (true/false):");
                                penguin.setIsSwimming(scanner.nextBoolean());

                                System.out.println("Enter the walk speed of the penguin:");
                                penguin.setWalkSpeed(scanner.nextInt());

                                System.out.println("Enter the swim speed of the penguin:");
                                penguin.setSwimSpeed(scanner.nextInt());
                                break;

                            case 2:
                                System.out.println("The characteristics of the " + penguin.getNameOfAnimal() + ":");
                                System.out.println("Age: " + penguin.getAge());
                                System.out.println("Height: " + penguin.getHeight());
                                System.out.println("Weight: " + penguin.getWeight());
                                System.out.println("Walking Speed:" + penguin.getWalkSpeed());
                                System.out.println("Swimming Speed:" + penguin.getSwimSpeed());
                                break;
                            case 3:
                                if (penguin.getIsSwimming()) {
                                    penguin.swimming();
                                } else {
                                    penguin.walking();
                                }
                                break;
                            case 4:
                                penguin.eatingFood();
                                penguin.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = scanner.nextInt();
                    } while(continueInnerLoop == 1);
                    break;
                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = scanner.nextInt();

        } while (continueOuterLoop == 1);

    }

    private static int animalChoiceMenu(Scanner scanner) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");


        System.out.println("Enter choice of animal:");
        
        choiceGivenByUser = scanner.nextInt();
        
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner scanner, Animal animal) {
    	
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        
        choiceGivenByUser = scanner.nextInt();
        
        return choiceGivenByUser;

    }
}

