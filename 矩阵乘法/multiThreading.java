package multiThreading;

public class multiThreading implements Runnable{
    private int threadsNumber = 8;
    int[][]matrixA;
    int[][]matrixB;
    int[][]matrixC;
    public multiThreading(int[][] a,int[][] b,int[][]c){
        matrixA = a;
        matrixB = b;
        matrixC = c;
    }
    public void run(){
        matrixMultiplication.Multiplication(matrixA, matrixB, matrixC);
    }
    public static void main(String[] args){
        int threadsNumber = 8; //线程数
        int[][] matrix1 = new int[1000][1000];
        int[][] matrix2 = new int[1000][1000];
        int[][][] matrixResult = new int[threadsNumber][1000/threadsNumber][1000];
        randomFill.fill(matrix1);
        randomFill.fill(matrix2);
        //分割矩阵1用于多线程
        int[][][] matrixTemp = new int[threadsNumber][1000/threadsNumber][1000];
        for(int i = 0; i < threadsNumber; i++){
            for(int j = i * (1000/threadsNumber); j < (i + 1) * (1000/threadsNumber); j++){
                matrixTemp[i][j-(i * (1000/threadsNumber))] = matrix1[j];
            }
        }
        Thread[] workers=new Thread[threadsNumber];
        for(int i = 0; i < threadsNumber; i++){
            workers[i]=new Thread(new multiThreading(matrixTemp[i], matrix2, matrixResult[i]));
        }
        long begin = System.nanoTime();
        for(int i = 0;i < threadsNumber;i++){
            workers[i].start();//启动工作线程
        }
        for(int i = 0;i < threadsNumber;i++){
            try{
                workers[i].join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        long end = System.nanoTime();
        long cost = (end-begin) / 1000000;
        System.out.println("两个1000X1000矩阵做乘法" + threadsNumber + "线程所耗时间："+ cost + "毫秒");
    }//两个1000X1000矩阵做乘法8线程所耗时间：4179毫秒


}