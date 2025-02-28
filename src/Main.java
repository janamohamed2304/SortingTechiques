import SortingAlgorithms.CountingSort;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int[] array;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Enter the path of the file containing the list of elements:");
        String filePath = scanner.nextLine();
        
        try {
            array = readArrayFromFile(filePath);
            System.out.println("Array loaded: " + Arrays.toString(array));
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        while (running) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Sort the list");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    sortMenu(scanner);
                    break;
                case 2:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }

    private static void sortMenu(Scanner scanner) {
        System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Counting Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Quick Sort");
        System.out.print("Enter choice: ");
        int algoChoice = scanner.nextInt();

        System.out.print("Show intermediate steps? (true/false): ");
        boolean showSteps = scanner.nextBoolean();
        
        List<int[]> steps = switch (algoChoice) {
            case 1 -> new CountingSort().Sort(array, showSteps);
            // case 2 -> new BubbleSort().Sort(array, showSteps);
            // case 3 -> new QuickSort().Sort(array, showSteps);
            default -> {
                System.out.println("Invalid choice");
                yield null;
            }
        };
        
        if (steps != null) {
            System.out.println("Sorted array: " + Arrays.toString(steps.get(steps.size() - 1)));
            if (showSteps) {
                System.out.println("Intermediate Steps:");
                for (int[] step : steps) {
                    System.out.println(Arrays.toString(step));
                }
            }
        }
    }
    
    private static int[] readArrayFromFile(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .flatMap(line -> Arrays.stream(line.split(",")))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}



