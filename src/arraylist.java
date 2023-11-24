import java.util.ArrayList;
import java.util.Scanner;

class Add {
    public static void execute(ArrayList<String> arrayList, Scanner scanner) {
        System.out.print("Enter element to add in list: ");
        String elementToAdd = scanner.next();
        arrayList.add(elementToAdd);
        System.out.println("Element added successfully.");
    }
}

class Remove {
    public static void execute(ArrayList<String> arrayList, Scanner s) {
        System.out.print("Enter index to remove: ");
        int rem_ind = s.nextInt();
        if (rem_ind  >= 0 && rem_ind < arrayList.size()) {
            arrayList.remove(rem_ind );
            System.out.println("Element removed successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }
}

class Check{
    public static void execute(ArrayList<String> arrayList, Scanner scanner) {
        System.out.print("Enter element to check in list: ");
        String elementToCheck = scanner.next();
        boolean present = arrayList.contains(elementToCheck);
        if (present) {
            System.out.println("Element exists in the ArrayList.");
        } else {
            System.out.println("Element does not exist in the ArrayList.");
        }
    }
}

class GetSize {
    public static void execute(ArrayList<String> arrayList) {
        int size = arrayList.size();
        System.out.println("Size of the ArrayList: " + size);
    }
}

class display {
    public static void execute(ArrayList<String> arrayList) {
        System.out.println("Elements in the ArrayList:");
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}
