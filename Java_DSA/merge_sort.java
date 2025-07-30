import java.util.Scanner;

public class merge_sort {

    public static void conquer(int[] m, int sidx, int mid, int eidx) {
        int merged[] = new int[eidx - sidx + 1];

        int idx1 = sidx;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= eidx) {
            if (m[idx1] <= m[idx2]) {
                merged[x] = m[idx1];
                x++; idx1++;
            } else {
                merged[x] = m[idx2];
                x++; idx2++;
            }
        }

        while (idx1 <= mid) {
            merged[x] = m[idx1];
            x++; idx1++;
        }

        while (idx2 <= eidx) {
            merged[x] = m[idx2];
            x++; idx2++;
        }

        for (int i = 0, j = sidx; i < merged.length; i++, j++) {
            m[j] = merged[i];
        }
    }

    public static void divide(int[] m, int sidx, int eidx) {
        if (sidx < eidx) {
            int mid = sidx + (eidx - sidx) / 2;
            divide(m, sidx, mid);
            divide(m, mid + 1, eidx);
            conquer(m, sidx, mid, eidx);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        int n = sc.nextInt();
        int m[] = new int[n];
        System.out.println("Enter the Elements of Array");
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        System.out.println("Array Elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();

        divide(m, 0, n - 1);

        System.out.println("Sorted Array Elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();
    }
}