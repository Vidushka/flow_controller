package com.hsenid.flow_controll;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * @author Vidushka
 *
 */
public class flowControll
{

    /**
     * This switch case use to run all methods.
     *
     * @param x
     */
    public static void switch_case(int x) {
        switch (x) {
            case (1):
                for_new();
                break;

            case (2):
                while_new();
                break;

            case (3):
                for_backward();
                break;

            case (4):
                for_piramid();
                break;

            case (5):
                for_diamond();
                break;
            case (6):
                for_arrow();
                break;
            case (7):
                for_watch();
                break;
            case (8):
                for_new_space();
                break;
            case (9):
                for_backward_space();
                break;
            case (10):
                for_double();
                break;
            case (11):
                for_box();
                break;
            case (12):
                for_Z();
                break;
            case (13):
                for_Zback();
                break;
            case (14):
                for_Zdouble();
                break;
            case (15):
                for_Xbox();
                break;
            case (16):
                multification_table();
                break;
            case (17):
                getFactorial();
                break;
            case (18):
                infianite();
                break;
            case (19):
                for_piramid_array();
                break;
            case (20):
                fibonacci(1000);
                break;
            case (21):
                array2d_print(for_piramid_array());
                break;
            default:
                System.out.println("No matching case");
                break;
        }
    }

        /**
         * Output of for loops are puting to a array called 'arr' and print it
         */
        public static String[][] for_piramid_array() {
            String[][] arr = new String[11][11];
            for (int s = 10; s > 0; s--) {
                for (int t = 0; t <= 10; t++) {
                    if (t < s) {
                        arr [s][t] = " ";
                        //System.out.print(arr[s][t]);
                    }
                    else {
                        arr [s][t] = "* ";
                        //System.out.print(arr[s][t]);
                    }
                }
                System.out.println();
            }
            return arr;
        }

    /**
     * Calculate the factorial of keyboard input integer
     * */
    public static void getFactorial() {
        Scanner sc = new Scanner(System.in);
        for (int x=0; ;x++) {
            System.out.println("Please input a Integer ");
            String input = sc.nextLine();
            //big integer used to resolve the int limitation problem
            BigInteger num = new BigInteger(input), ans = new BigInteger("1");
            while (true) {
                if (num.equals(BigInteger.valueOf(0))) {
                    break;
                }
                ans = ans.multiply(num);
                num = num.subtract(BigInteger.valueOf(1));
            }

            System.out.println("Factorial of " + input + " is " + ans.toString());
            Scanner endCommand = new Scanner(System.in);
            System.out.println("Do you want Continue ? (Y,N)");
            String command = endCommand.nextLine();
                if (command.equals("N")) {
                    break;
                }
                else if (command.equals("Y"))
                    continue;
                else
                    System.out.println("Not a valid command, please type Y or N." + command);
        }
    }

    /**
     *
     * @param number
     * Print the fibonacci of given number
     * this method prints only fibonacci sequence of input number
     * (starting from 0)
     */
    public static void fibonacci(int number) {
        Scanner input = new Scanner(System.in);
        int total;
        System.out.print("How many numbers would you like it to display?");
        total = input.nextInt();

        BigInteger[] series = new BigInteger[total];

        for (int x = 0; x < total; x++) {
            if(x <= 1){
                if(x == 1)
                    series[x] = BigInteger.valueOf(1L);
                if(x == 0)
                    series[x] = BigInteger.valueOf(0L);
            }
            else
                series[x] = series[x - 1].add(series[x - 2]);
        }
        for (int y = 0; y < total; y++) {
            System.out.print(series[y] + "\n");
        }
        input.close();
    }

    public static void multification_table() {
        for (int i = 0; i <= 12; i++) {
            for (int j = 0; j <= 12; j++) {
                if (i == 0) {
                    System.out.print(String.format("%4d", j));

                } else if (j == 0) {
                    System.out.print(String.format("%4d", i));
                    //System.out.println();
                } else
                    System.out.print(String.format("%4d", i * j));
            }
            System.out.println();
        }
    }

    /**
     * Create a box with two dioganals
     */
    public static void for_Xbox() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i == 10 + 1 - j || i == 1 || i == 10)
                    System.out.print("# ");
                else if (i == j || j == 1 || j == 10)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    /**
     *Print Z with a diaganal
     */
    public static void for_Zdouble() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i == 10 + 1 - j || i == 1 || i == 10)
                    System.out.print("# ");
                else if (i == j)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    /**
     * Print Z backwards
     */
    public static void for_Zback() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i == 10 + 1 - j || i == 1 || i == 10)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    /**
     * Print Z
     */
    public static void for_Z() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i == j || i == 1 || i == 10)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    /**
     * Print a box
     */
    public static void for_box() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 || i == 9 || j == 0 || j == 9)
                    System.out.print("# ");
                else if (j != 9)
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    /**
     *Print 2nd half of triangle
     */
    public static void for_double() {
        for (int i = 1; i <= 20; i++) {
            int x = i;
            if (i > 10)
                i = x - 10;
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            i = x;
            System.out.println();
        }
    }

    /**
     *Print 1st half of triangle with space at front
     */
    public static void for_backward_space() {
        for (int p = 1; p < 10; p++) {
            System.out.print("           ");
            for (int q = 0; q < 10; q++) {
                if (q < (10 - p))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     *Print 2nd half of triangle with space at front
     */
    public static void for_new_space() {
        for (int i = 1; i < 10; i++) {
            System.out.print("          ");
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Print upside down triangle with triangle
     */
    public static void for_watch() {
        for (int i = -5; i <= 5; i++) {
            int k;
            if (i < 0)
                k = -i;
            else
                k = i;
            int l = 5 - k;
            for (int j = -5; j <= 5 + k; j++) {
                if (j < l)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Print a arrow head
     */
    public static void for_arrow() {
        for (int i = -5; i <= 5; i++) {
            int k;
            if (i < 0)
                k = -i;
            else
                k = i;
            int l = 5 - k;
            for (int j = -5; j <= 5 + l; j++) {
                if (j < l)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * print a diomend
     */
    public static void for_diamond() {
        for (int i = -5; i <= 5; i++) {
            int k;
            if (i < 0)
                k = -i;
            else
                k = i;
            int l = 5 - k;
            for (int j = -5; j <= 5 + l; j++) {
                if (j < k)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Print a piramid
     */
    public static void for_piramid() {
        for (int s = 10; s > 0; s--) {
            for (int t = 0; t <= 10; t++) {
                if (t < s)
                    System.out.print("@");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Print piramid upside down
     */
    public static void for_piramid_err() {
        for (int s = 0; s < 10; s++) {
            int x = 0;

            for (int t = 0; t < 10; t++) {
                if ((t < (10 - s) / 2) || (10 + s) / 2 < t)
                    System.out.print(" ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Print 1st half of triangle
     */
    public static void for_backward() {
        for (int p = 1; p < 10; p++) {
            for (int q = 0; q < 10; q++) {
                if (q < (10 - p))
                    System.out.print("");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Print 2nd part of triangle WHILE
     */
    public static void while_new() {
        int x = 0;
        while (x < 10) {
            int z = 0;
            while (z < x) {
                System.out.print("*");
                z++;
            }
            System.out.println();
            x++;
        }
    }

    /**
     * Print 2nd part of triangle using FOR loop
     */
    public static void for_new() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void infianite(){
        Scanner input = new Scanner(System.in);
        System.out.println("Press R to start and Q to quite running");
        String command = input.nextLine();
        top:
        for (; ;){

            if (command.equals("R"))
                System.out.println("###");

        }
    }
    public static void array2d_print(String[][] arr2d){
        for (int i=0; i<=arr2d.length;i++){
            for (int j=0; j<=arr2d.length; j++){
                System.out.println(arr2d[j][i]);
            }
        }
    }
}
