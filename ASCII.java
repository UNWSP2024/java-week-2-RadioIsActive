package src.JavaWeek2Programs;

import java.util.Scanner;

public class ASCII {
        static Scanner userinput = new Scanner(System.in);
		public static void main(String[] args) {

            int x;
            x = ((int) (Math.random() * 256));

            System.out.println("The selected decimal is " + x);
            System.out.println("Binary: "+ Integer.toBinaryString(x));
            System.out.println("Hexidecimal: "+ Integer.toHexString(x));
            System.out.println("ASCII: "+ (char) x);
}
}
