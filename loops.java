// CODE TO PRINT  ALL THE PATTERN ACCORDING TO THE USER NEED 

import java.util.Scanner;

public class ProgramOfLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the choice:");
        System.out.println("1: Right-Angled Triangle");
        System.out.println("2: Rectangle");
        System.out.println("3: Pyramid");
        System.out.println("4: Diamond");

        int choice = sc.nextInt();
        System.out.println("Enter the size of the pattern:");
        int size = sc.nextInt();

        
        int cols = size;  // Default value

        if (choice == 2) {
            System.out.println("Enter the number of columns for the rectangle:");
            cols = sc.nextInt();  // Prompt for columns if choice is 2
        }

        System.out.println("Enter the character for the pattern:");
        char patternChar = sc.next().charAt(0);

        switch (choice) {
            case 1:
                printRightAngledTriangle(size, patternChar);
                break;
            case 2:
                printRectangle(size, cols, patternChar); 
                break;
            case 3:
                printPyramid(size, patternChar);
                break;
            case 4:
                printDiamond(size, patternChar);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        sc.close();
    }

    public static void printRightAngledTriangle(int size, char patternChar) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(patternChar);
            }
            System.out.println();
        }
    }

    public static void printRectangle(int rows, int cols, char patternChar) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(patternChar);
            }
            System.out.println();
        }
    }

    public static void printPyramid(int size, char patternChar) {
        for (int i = 1; i <= size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(patternChar);
            }
            System.out.println();
        }
    }

    public static void printDiamond(int size, char patternChar) {
        
        for (int i = 1; i <= size; i++) {
          
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(patternChar);
            }
            System.out.println(); 
        }

        
        for (int i = size - 1; i >= 1; i--) {
          
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
           
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(patternChar);
            }
            System.out.println(); 
        }
    }
}
