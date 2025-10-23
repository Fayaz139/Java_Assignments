import java.util.*;

class SpriarMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the row");
		int r = sc.nextInt();
		System.out.println("Enter the size of the column");
		int c = sc.nextInt();

		int[][] a = new int[r][c];

		for(int i = 0; i <= r-1; i++) {
			for (int j = 0; j <= c-1; j++) {
				a[i][j] = sc.nextInt();
			}
		}

        int r_start = 0;
        int r_end = r-1; 
        int c_start = 0;
        int c_end = c-1;

        while (r_start <= r_end && c_start <= c_end) {

            for(int i = c_start; i <= c_end; i++) {
                System.out.print(a[r_start][i] + " ");
            }
            r_start++;

            for(int i = r_start; i <= r_end; i++) {
                System.out.print(a[c_end][i] + " ");
            }
            c_end--;

            for(int i = c_end; i >= c_start; i--) {
                System.out.print(a[r_end][i] + " ");
            }
            r_end--;

            for(int i = r_end; i >= r_start; i++) {
                System.out.print(a[c_start][i] + " ");
            }
            c_start++;
        }
    }
}