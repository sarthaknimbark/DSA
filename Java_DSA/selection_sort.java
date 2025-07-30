import java.util.Scanner;

public class selection_sort {

    public static void selectionsort(int[] m, int n) {
        for(int i = 0; i < n; i++) {
            int min_element = i;
            for(int j = i+1; j < n; j++)
                if (m[j] < m[min_element])
                    min_element = j;

            int temp = m[min_element];
            m[min_element] = m[i];
            m[i] = temp;
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

        selectionsort(m, n);
       
        System.out.println("Sorted Array Elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();
    }
}