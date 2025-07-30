import java.util.Scanner;

public class insertion_sort {

    public static void insertionsort(int[] m, int n) {
        for(int i = 0; i < n; i++) {
            int key = m[i];
            int j = i - 1;

            while (j >= 0 && m[j] > key) {
                m[j + 1] = m[j];
                j = j - 1;
            }
            m[j + 1] = key;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        int n = sc.nextInt();
        int m[] = new int[n];
        System.out.println("Enter the Elements of Array");
        for(int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        System.out.println("Array Elements are: ");
        for(int i = 0; i < n; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();

        insertionsort(m, n);

        System.out.println("Sorted Array Elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();
    }
}
