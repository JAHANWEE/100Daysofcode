import java.util.Scanner;
public class pattern12 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n / 2 + 2;
		// work
		while (row <= n) {
			// space 
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			// star 
			int cst = 1;
			while (cst <= nst) {
				if (cst % 2 == 0) {
					System.out.print("! ");
				} else {
					System.out.print("* ");
				}
				
				cst++;
			}
			// space 
			int ccsp = 1;
			while (ccsp <= nsp) {
				System.out.print(" ");
				ccsp++;
			}
			// preparation
			System.out.println();
			nst += 2;
			nsp--;
			row++;

		}
    }
}
