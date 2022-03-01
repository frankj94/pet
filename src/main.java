import java.util.Scanner;
public class main {
    public static void main(String args[]) {
        Scanner pet_name = new Scanner(System.in);
        String name;
        System.out.println("What is the name of your pet?");
        name = pet_name.next();

        String age;
        System.out.println("What is the age of Logi?");
        Scanner pet_age = new Scanner(System.in);
        age = pet_age.next();

        String full;
        System.out.println("What is your full name?");
        Scanner full_name = new Scanner(System.in);
        full = full_name.next();

        System.out.print(full + " has a pet named " + name + " that is " + age + " years old.");
    }
}
