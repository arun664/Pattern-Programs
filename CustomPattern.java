import java.util.Scanner;

class Pattern {
    
    public static void FirstLastLine(int x) {
        System.out.print("+");
        for (int i=0; i<x; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void MiddleSection(int y, int z) {
        System.out.print("|");
        System.out.print("<");
        for (int i=0; i<y; i++) {
            if( z%2 == 0) {
                System.out.print("-");
            }
            else {
                System.out.print("=");
            }
        }
        System.out.print(">");
        System.out.println("|");
    }

    public static void MiddleUp(int a, int b) {
        for (int i=0; i<a; i++) {
            System.out.print("|");
            for (int j=i; j<a; j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int k=1; k<=i*2; k+=2) {
                if(i%2 == 0) {
                    System.out.print("==");
                }
                else {
                    System.out.print("--");
                }
            }
            System.out.print("\\");
            for (int l=i; l<a; l++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void MiddleDown(int a, int b) {
        for (int i=a-1; i>=0; i--) {
            System.out.print("|");
            for (int j=i; j<a; j++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int k=1; k<=i*2; k+=2) {
                if(i%2 == 0) {
                    System.out.print("==");
                }
                else {
                    System.out.print("--");
                }
            }
            System.out.print("/");
            for (int l=i; l<a; l++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void main(String[] args) {
        
        Scanner sizeObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Size");

        int Size = sizeObj.nextInt();  // Read user input\

        if(Size > 0) {
            int stars = Size*2;
            int dash = (Size*2)-2;

            FirstLastLine(stars);
            MiddleUp(Size-1, stars);
            MiddleSection(dash, Size);
            MiddleDown(Size-1, stars);
            FirstLastLine(stars);
        }
    }
}