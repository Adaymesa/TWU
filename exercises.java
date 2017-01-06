/**
 * Created by adaymoises on 04/01/2017.
 */
public class exercises {
    public static void main(String[] args) {
        printOneAsterisk();
        printHorizontalLine(8);
        printOneAsteriskPerLine(3);
        printTriangle(3);
        printIsoscelesTriangle();
        printDiamond();
    }
    private static void printOneAsterisk() {
        System.out.println("*");
    }

    private static void printHorizontalLine(int asterisks) {
        for (int i = 0; i <= asterisks; i++) {
            System.out.print("*");
        }
    }

    private static void printOneAsteriskPerLine(int asterisks) {
        for (int i = 0; i <= asterisks; i++) {
            System.out.println("*");
        }
    }

    private static void printTriangle(int asterisks) {
        String asteriskLine = "";
        for (int i = 0; i <= asterisks; i++) {
            System.out.println(asteriskLine);
            asteriskLine = asteriskLine.concat("*");
        }
    }

      private static void printIsoscelesTriangle() {
        int i,j,k;
        for(i=1; i<=3; i++)
        {
            for(j=2; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(k=1; k<=(2*i-1); k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void printDiamond() {
        int i,j,k;
        for(i=1; i<=3; i++)
        {
            for(j=2; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(k=1; k<=(2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(i=2; i>=0; i--)
        {
            for(j=2; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(k=1; k<=(2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}


