import java.util.Scanner;

public class min_max {

    public static int min(int[] m, int n) {
        int result = m[0];
        for(int i = 0; i < n; i++) {
           result = Math.min(result, m[i]);
        }
        return result;
    }

    public static int max(int[] m, int n) {
        int result = m[0];
        for(int i = 0; i < n; i++) {
           result = Math.max(result, m[i]);
        }
        return result;
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

        int x = min(m, n);
        int y = max(m, n);

        System.out.println("Minimun Value In Array is: "+ x);
        System.out.println("Maximum Value in Array is: " + y);
        
    }
}
