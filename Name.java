package src.JavaWeek2Programs;

import java.util.Scanner;
public class Name {
        static Scanner userinput = new Scanner(System.in);

		public static void main(String[] args) {
			String a;
			String b;
			String c;
            double n;

			System.out.print("Enter your first name: ");
			a = userinput.nextLine();
			System.out.print("Enter your last name: ");
			b = userinput.nextLine();
			System.out.print("Enter your age: ");
			c = userinput.nextLine();
            System.out.print("Enter your average amount of sleep (as a decimal): ");
            n = userinput.nextDouble();

            n = Math.round(n * 10) / 10.0;

            System.out.format("\nName: %s %s\n",a,b);
            System.out.format("Age: %s\n",c);
            System.out.format("Average Sleep: %s hours\n\n",n);
		} 
}
