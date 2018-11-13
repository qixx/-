package multiThreading;

public class singleThreading {
    public static void main(String[] args){
        int[][] matrix1 = new int[1000][1000];
        int[][] matrix2 = new int[1000][1000];
        int[][] matrixResult = new int[1000][1000];
        randomFill.fill(matrix1);
        randomFill.fill(matrix2);
        long begin = System.nanoTime();
        matrixMultiplication.Multiplication(matrix1, matrix2, matrixResult);
        long end = System.nanoTime();
        long cost = (end-begin) / 1000000;
        System.out.println("两个1000X1000矩阵做乘法单线程所耗时间："+ cost + "毫秒");
    }//两个1000X1000矩阵做乘法单线程所耗时间：5562毫秒
}