package numPractice;

/**
 * Created by ashah on 8/25/180
 */
public class ValidSudoku {

    public static void main(String[] args){
        int[][] sudoku = new int[][]{
                        {5,3,0,0,7,0,0,0,0},
                        {6,0,0,1,9,5,0,0,0},
                        {0,9,8,0,0,0,0,6,0},
                        {8,0,0,0,6,0,0,0,3},
                        {4,0,0,8,0,3,0,0,1},
                        {7,0,0,0,2,0,0,0,6},
                        {0,6,0,0,0,0,2,8,0},
                        {0,0,0,4,1,9,0,0,5},
                        {0,0,0,0,8,0,0,7,9}};
        boolean isValid = ifValidSudoku(sudoku);
        System.out.print("Is sudoku valid ? "+ isValid);
    }

    private static boolean ifValidSudoku(int[][] sudoku) {
        boolean[] numbersArray ;
        for(int i=0,j=0;i<9;i++) {
            j=0;
            numbersArray = new boolean[10];
            while(j<9) {
                if(sudoku[i][j] !=0 && numbersArray[sudoku[i][j]]){
                    return false;
                }else{
                    numbersArray[sudoku[i][j++]]=true;
                }
            }
        }
        for(int i=0,j=0;j<9;j++) {
            i=0;
            numbersArray = new boolean[10];
            while(i<9) {
                if(sudoku[i][j] !=0 && numbersArray[sudoku[i][j]]){
                    return false;
                }else{
                    numbersArray[sudoku[i++][j]]=true;
                }
            }
        }
        return true;

    }

}
