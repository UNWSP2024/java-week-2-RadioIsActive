import java.util.Scanner;
public class EnAPP {
        static Scanner userinput = new Scanner(System.in);

		public static void main(String[] args) {
			String a;
			String b;
			String c;

			System.out.print("Enter your first name: ");
			a = userinput.nextLine();
			System.out.print("Enter your middle name: ");
			b = userinput.nextLine();
			System.out.print("Enter your last name: ");
			c = userinput.nextLine();
			System.out.println("\n" + a + ", you are AMAZING!! ❤️✨ Some call you by your SECOND most amazing name: " + b + ". You represent the " + c + " family!");
		} 
}
