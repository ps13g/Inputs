import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name );
    }
}
