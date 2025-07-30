public class matrix_multiplication {

    public static int[][] multiply(int[][] A, int[][] B) {
        int n = A.length; 
        int[][] C = new int[n][n];
        if (n == 1) {
            C[0][0] = A[0][0] * B[0][0];
            return C;
        }
        int k = n / 2;
        int[][] A11 = new int[k][k];
        int[][] A12 = new int[k][k];
        int[][] A21 = new int[k][k];
        int[][] A22 = new int[k][k];
        int[][] B11 = new int[k][k];
        int[][] B12 = new int[k][k];
        int[][] B21 = new int[k][k];
        int[][] B22 = new int[k][k];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                A11[i][j] = A[i][j];
                A12[i][j] = A[i][j + k];
                A21[i][j] = A[i + k][j];
                A22[i][j] = A[i + k][j + k];
                
                B11[i][j] = B[i][j];
                B12[i][j] = B[i][j + k];
                B21[i][j] = B[i + k][j];
                B22[i][j] = B[i + k][j + k];
            }
        }
        int[][] C11 = add(multiply(A11, B11), multiply(A12, B21));
        int[][] C12 = add(multiply(A11, B12), multiply(A12, B22));
        int[][] C21 = add(multiply(A21, B11), multiply(A22, B21));
        int[][] C22 = add(multiply(A21, B12), multiply(A22, B22));

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                C[i][j] = C11[i][j];
                C[i][j + k] = C12[i][j];
                C[i + k][j] = C21[i][j];
                C[i + k][j + k] = C22[i][j];
            }
        }

        return C;
    }

    private static int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static void main(String[] args) {
        int[][] A = {
            {12, 32},
            {53, 54}
        };
        
        int[][] B = {
            {85, 56},
            {72, 82}
        };

        int[][] C = multiply(A, B);
        System.out.println("Multiplication of given Matrix:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
}
}
}