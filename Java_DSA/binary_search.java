import java.util.Scanner;

public class binary_search {

    public static int searching(int m[], int n, int key) {
        int high, mid, low;
        low = 0;
        high = n-1;
        
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (m[mid] == key) {
                return mid;
            } else if (m[mid] < key) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Element: ");
        int n = sc.nextInt();
        int m[] = new int[n];
        System.out.println("Enter the Number of Element");
        for(int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < m.length; i++) {
            res.append(m[i]);
            if (i < m.length - 1) {
                res.append(", "); 
            }
        }
        System.out.println("Array Elements are: " + res.toString());

        System.out.println("Enter the value of key to be find:");
        int key = sc.nextInt();
        int result = searching(m, n, key);

        if(result == -1) {
            System.out.println("Element is not found in Array");
        } else {
            System.out.println("Element Found At "+result);
        }
    }
}
