
/*
 * Author: Scott Giles
 * I read about the 8-Queens problem in the CSC242 book and wanted
 * to try it out myself
 * (All text-based)
 */

import java.util.*;

public class Board {

	protected int size;
	protected int b[][];
	protected ArrayList<int[]> locals;

	public Board() {
		this.size = 8;
		this.b = new int[size][size];
		fillarr();
		locals = new ArrayList<int[]>();
	}

	// NOT RANDOM YET
	public void generate() {

	}

	public void addQueens(LinkedList<int[]> queens) {
		for (int i = 0; i < queens.size(); i++) {
			int[] index = queens.get(i);
			int x = index[0];
			int y = index[1];
			b[x][y] = 8;
		}
	}

	public boolean check() {
		getLocals();
		for (int i = 0; i < locals.size(); i++) {
			int[] index = locals.get(i);
			int x = index[0];
			int y = index[1];
			if (!checkIndex(x, y)) {
				System.out.println("FAIL: Queen at (" + x + "," + y + ") has a bad position.");
				return false;
			}
		}
		return true;
	}

	// Checks a specific index
	private boolean checkIndex(int x, int y) {
		// Check i's
		for (int i = 0; i < b.length; i++) {
			if (i != x) {
				if (b[i][y] == 8) {
					return false;
				}
			}
		}
		// Check j's
		for (int j = 0; j < b.length; j++) {
			if (j != y) {
				if (b[x][j] == 8) {
					return false;
				}
			}
		}
		// Check diagonal
		int i = x;
		int j = y;
		while (i != 0 && j != 0) {
			i--;
			j--;
			if (b[i][j] == 8) {
				return false;
			}
		}

		i = x;
		j = y;
		while (i != 7 && j != 7) {
			i++;
			j++;
			if (b[i][j] == 8) {
				return false;
			}
		}
		return true;
	}

	// Fills Linked List with indices of Queens
	private void getLocals() {
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (b[i][j] == 8) {
					int index[] = new int[2];
					index[0] = i;
					index[1] = j;
					locals.add(index);
				}
			}
		}
	}

	private void fillarr() {
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				b[i][j] = 0;
			}
		}
	}

	// Prints board (with number indices)
	// Commented out lines add extra box borders but make the board very big
	public void print() {
		System.out.print(" ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(" " + i);
		}
		System.out.println();
		// for (int i = 0; i < b.length; i++) {
		// System.out.print(" _");
		// }
		// System.out.println();
		System.out.print(0);
		for (int i = 0; i < b.length; i++) {
			System.out.print("|" + b[i][0]);
		}
		System.out.println("|");
		System.out.print(1);
		// for (int i = 0; i < b.length; i++) {
		// System.out.print(" _");
		// }
		// System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print("|" + b[i][1]);
		}
		System.out.println("|");
		System.out.print(2);
		// for (int i = 0; i < b.length; i++) {
		// System.out.print(" _");
		// }
		// System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print("|" + b[i][2]);
		}
		System.out.println("|");
		System.out.print(3);
		// for (int i = 0; i < b.length; i++) {
		// System.out.print(" _");
		// }
		// System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print("|" + b[i][3]);
		}
		System.out.println("|");
		System.out.print(4);
		// for (int i = 0; i < b.length; i++) {
		// System.out.print(" _");
		// }
		// System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print("|" + b[i][4]);
		}
		System.out.println("|");
		System.out.print(5);
		// for (int i = 0; i < b.length; i++) {
		// System.out.print(" _");
		// }
		// System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print("|" + b[i][5]);
		}
		System.out.println("|");
		System.out.print(6);
		// for (int i = 0; i < b.length; i++) {
		// System.out.print(" _");
		// }
		// System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print("|" + b[i][6]);
		}
		System.out.println("|");
		System.out.print(7);
		// for (int i = 0; i < b.length; i++) {
		// System.out.print(" _");
		// }
		// System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print("|" + b[i][7]);
		}
		System.out.println("|");
		// for (int i = 0; i < b.length; i++) {
		// System.out.print(" _");
		// }
		// System.out.println();
	}
}
