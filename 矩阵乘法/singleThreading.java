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
        System.out.println("����1000X1000�������˷����߳�����ʱ�䣺"+ cost + "����");
    }//����1000X1000�������˷����߳�����ʱ�䣺5562����
}