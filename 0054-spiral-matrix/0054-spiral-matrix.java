class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int m=matrix.length;
        int startingRow=0;
        int endingRow=m-1;
        int n=matrix[0].length;
        int startingCol=0;
        int endingCol=n-1;
        while(startingRow<=endingRow && startingCol<=endingCol){
        // row wise print left to right-> startingRow print krni h, from startingCol to endingCol....
        for(int col=startingCol; col<=endingCol; col++){
            result.add(matrix[startingRow][col]);
         }
          startingRow++;
        // col wise print top to bottom-> endingCol print krni h, from startingRow to endingRow......
        for(int row=startingRow; row<=endingRow; row++){
            result.add(matrix[row][endingCol]);
        }
        endingCol--;
        // row wise print right to left-> endingRow print krni h, from endingCol to startingCol....
        if(startingRow<=endingRow){
        for(int col=endingCol; col>=startingCol; col--){
            result.add(matrix[endingRow][col]);
        }
        endingRow--;
        }
        // col wise print bottom to top-> startingCol print krni h, from endingRow to startingRow....
        if(startingCol<=endingCol){
        for(int row=endingRow; row>=startingRow; row--){
            result.add(matrix[row][startingCol]);
        }
        startingCol++;
        }
        }
        return result;
    }
}