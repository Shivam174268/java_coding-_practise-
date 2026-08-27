import java.util.Scanner;

public class ArrayInsertDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[100]; // Large size to allow insertion

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Menu
        System.out.println("\n1. Insert\n2. Delete");
        System.out.print("Choose operation: ");
        int choice = sc.nextInt();

        switch (choice) {

            // INSERTION
            case 1 -> {
                System.out.print("Enter position to insert (0 to " + n + "): ");
                int pos = sc.nextInt();

                System.out.print("Enter value to insert: ");
                int val = sc.nextInt();

                // Shift elements to right
                for (int i = n; i > pos; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[pos] = val;
                n++; // Increase array size

                System.out.println("Array after insertion:");
                for (int i = 0; i < n; i++)
                    System.out.print(arr[i] + " ");
            }

            // DELETION
            case 2 -> {
                System.out.print("Enter position to delete (0 to " + (n - 1) + "): ");
                int pos = sc.nextInt();

                // Shift elements to left
                for (int i = pos; i < n - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                n--; // Reduce size

                System.out.println("Array after deletion:");
                for (int i = 0; i < n; i++)
                    System.out.print(arr[i] + " ");
            }

            default -> System.out.println("Invalid choice!");
        }
    }
}

    

