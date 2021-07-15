import java.util.Scanner;
import java.util.ArrayList;

public class AnimapApp {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Cat> userInputCat = new ArrayList<>();
        ArrayList<Dog> userInputDog = new ArrayList<>();
        ArrayList<Bird> userInputBird = new ArrayList<>();
        String control1 = "yes";
        String control2 = "yes";
        String control3 = "yes";
        Cat cat;
        Dog dog;
        Bird bird;

        while (control1.equals("yes")) {
            cat = new Cat();
            System.out.print("Enter cat name: ");
            cat.setName(keyboard.nextLine());
            System.out.print("Enter cat type: ");
            cat.setType(keyboard.nextLine());
            System.out.print("Enter cat description: ");
            cat.setDescription(keyboard.nextLine());
            System.out.print("Enter cat price: ");
            cat.setPrice(keyboard.nextDouble());
            System.out.print("Enter is cat in stock (true/false): ");
            cat.setIsInStock(keyboard.nextBoolean());

            System.out.print("Would you like to enter another cat (yes/no)?: ");
            control1 = keyboard.next();
            keyboard.nextLine();
            userInputCat.add(cat);
        }

        while (control2.equals("yes")) {
            dog = new Dog();
            System.out.print("Enter dog name: ");
            dog.setName(keyboard.nextLine());
            System.out.print("Enter dog type: ");
            dog.setType(keyboard.nextLine());
            System.out.print("Enter dog description: ");
            dog.setDescription(keyboard.nextLine());
            System.out.print("Enter dog price: ");
            dog.setPrice(keyboard.nextDouble());
            System.out.print("Enter is dog in stock (true/false): ");
            dog.setIsInStock(keyboard.nextBoolean());

            System.out.print("Would you like to enter another dog (yes/no)?: ");
            control2 = keyboard.next();
            keyboard.nextLine();
            userInputDog.add(dog);
        }

        while (control3.equals("yes")) {
            bird = new Bird();
            System.out.print("Enter bird name: ");
            bird.setName(keyboard.nextLine());
            System.out.print("Enter bird type: ");
            bird.setType(keyboard.nextLine());
            System.out.print("Enter bird description: ");
            bird.setDescription(keyboard.nextLine());
            System.out.print("Enter bird price: ");
            bird.setPrice(keyboard.nextDouble());
            System.out.print("Enter is bird in stock (true/false): ");
            bird.setIsInStock(keyboard.nextBoolean());

            System.out.print("Would you like to enter another bird (yes/no)?: ");
            control3 = keyboard.next();
            keyboard.nextLine();
            userInputBird.add(bird);
        }

        for (int index = 0; index < userInputCat.size(); index++){
            System.out.println(userInputCat.get(index).getPet() + "\n");
        }

        for (int index = 0; index < userInputDog.size(); index++){
            System.out.println(userInputDog.get(index).getPet() + "\n");
        }

        for (int index = 0; index < userInputBird.size(); index++){
            System.out.println(userInputBird.get(index).getPet() + "\n");
        }
    }
}
