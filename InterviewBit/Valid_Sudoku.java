/* Link - https://www.interviewbit.com/problems/valid-sudoku/ */

bool isValid(int row, int col, const vector<string> &A){
    for(int i=0;i<9;i++){
        if(i!=col){
            if(A[row][i]==A[row][col]){
                return false;
            }
        }
       
        if(i!=row){
            if(A[i][col]==A[row][col]){
                return false;
            }
        }
       
        if((3*(row/3)+i/3)!=row && (3*(col/3)+i%3)!=col){
            if(A[3*(row/3)+i/3][3*(col/3)+i%3]==A[row][col]){
                return false;
            }
        }
    }
    return true;
}

int Solution::isValidSudoku(const vector<string> &A) {
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            if(A[i][j]!='.'){
                if(!isValid(i,j,A)) return false;
            }
        }
    }
    return true;
}
