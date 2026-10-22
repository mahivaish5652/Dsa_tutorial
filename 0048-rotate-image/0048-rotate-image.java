class Solution {
    public void rotate(int[][] matrix) {
        // sbse pehle matix ko transpose krenge 
        // uske bd puri array ko reverse krenge
        int n=matrix.length;
        // matrix ko transpose kr rhe h....
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
            // ek nayi matrix mil gyi 
            // uske bd reverse krenge...
            for(int row=0; row<n; row++){
              int startcol=0;
              int endcol=n-1;
              while(startcol<=endcol){
                int temp=matrix[row][startcol];
                matrix[row][startcol]=matrix[row][endcol];
                matrix[row][endcol]=temp;
                startcol++;
                endcol--;
              }
            }
        }
    }