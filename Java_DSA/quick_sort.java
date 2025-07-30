import java.util.Scanner;

public class quick_sort {

    public static int partition(int[] m, int low, int high) {

        int pivot = m[high];
        int i = low - 1;

        for(int j = low; j < high; j++) {
            if (m[j] < pivot) {
                i++;
                int temp = m[i];
                m[i] = m[j];
                m[j] = temp;
            }
        }
        i++;
        int temp = m[i];
        m[i] = pivot;
        m[high] = temp;
        return i;
    }

    public static void quicksort(int[] m, int low, int high) {
        if (low < high) {
            int pivot = partition(m, low, high);

            quicksort(m, low, pivot-1);
            quicksort(m, pivot+1, high);
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

        quicksort(m, 0, m.length-1);

        System.out.println("Sorted Array Elements are: ");
        for(int i = 0; i < n; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();
    }
}