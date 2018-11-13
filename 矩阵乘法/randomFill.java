package multiThreading;

public class randomFill {
    public static void fill(int matrix[][]){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random()*10);
            }
        }
    }
}