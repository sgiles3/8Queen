
/*
 * Author: Scott Giles
 * I read about the 8-Queens problem in the CSC242 book and wanted
 * to try it out myself
 * (All text-based)
 */

import java.util.*;

public class Driver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		LinkedList<int[]> queens = new LinkedList<int[]>();

		int action = -1;

		while (action != 0) {
			System.out.println("8-Queens Problem Solver:");
			System.out.println("   1. Generate New Solution (Random)");
			System.out.println("   2. Check Solution");
			System.out.println("   0. Quit");
			try {
				action = scan.nextInt();
			} catch (Exception e) {
				System.out.println("Error: " + e);
				System.out.println("Please enter an integer!");
				action = -1;
				break;
			}

			if (action == 1) {
				System.out.println("Not added yet");
				Board b = new Board();
				b.print();
			}

			if (action == 2) {
				Board b = new Board();

				// Set Queen indices
				System.out.println("How many queens would you like to input?");
				System.out.println("(Max 8)");
				int size = scan.nextInt();
				for (int i = 0; i < size; i++) {
					System.out.println("Enter the index of Queen #" + i);
					System.out.print("x:");
					int x = 0;
					try {
						x = scan.nextInt();
					} catch (Exception e) {
						System.out.println("Error: " + e);
						System.out.println("Please enter an integer!");
						System.exit(0);
					}
					System.out.print("y:");
					int y = 0;
					try {
						y = scan.nextInt();
					} catch (Exception e) {
						System.out.println("Error: " + e);
						System.out.println("Please enter an integer!");
						System.exit(0);
					}
					int index[] = new int[2];
					index[0] = x;
					index[1] = y;
					queens.add(index);
				}
				// Add Queens to board
				b.addQueens(queens);
				b.print();
				// Check
				if (b.check()) {
					System.out.println("This solution works");
				} else {
					System.out.println("This is not a solution!");
				}
			}
		}

		scan.close();

	}

}
