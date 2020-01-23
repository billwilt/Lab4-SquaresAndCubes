import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		
		/*
		 * @author Bill Wilt
		 */
		
		
		Scanner keyboard = new Scanner(System.in);

		boolean wantToContinue;
		int usersNumber;
		
		System.out.println("Learn your squares and cubes!");
		System.out.println();
		
		do {
			System.out.print("Enter an integer: ");
			usersNumber = keyboard.nextInt();
			
				System.out.println("Number" + "\t\t" + "Squared" + "\t\t" + "Cubed");
				System.out.println("=======" + "\t\t" + "=======" + "\t\t" + "=======");
				
				for (int i = 0; i <= usersNumber; i++) {
				System.out.println(i + "\t" + "\t" + (i * i) + "\t" + "\t" + (i * i * i));
			}
			System.out.println("Would you like to continue (y/n)?");
			wantToContinue = keyboard.next().startsWith("y");
		} while (wantToContinue);
		
		keyboard.close();
	}

}
