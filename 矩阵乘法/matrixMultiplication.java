package multiThreading;

public class matrixMultiplication {

    public static int[][] Multiplication(int[][] a,int[][] b,int[][] c){
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c.length; j++){
                c[i][j] = 0;
            }
        }
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b[0].length; j++){
                for(int k = 0; k < b.length; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}