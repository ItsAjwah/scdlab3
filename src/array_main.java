import java.util.ArrayList;
import java.util.Scanner;

public class array_main{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nArrayList Operations:");
            System.out.println("1. Add an element");
            System.out.println("2. Remove an element by index");
            System.out.println("3. Check if an element exists");
            System.out.println("4. Retrieve the size of the ArrayList");
            System.out.println("5. Iterate and print elements");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Add.execute(arrayList, scanner);
                    break;
                case 2:
                    Remove.execute(arrayList, scanner);
                    break;
                case 3:
                    Check.execute(arrayList, scanner);
                    break;
                case 4:
                    GetSize.execute(arrayList);
                    break;
                case 5:
                    display.execute(arrayList);
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}
