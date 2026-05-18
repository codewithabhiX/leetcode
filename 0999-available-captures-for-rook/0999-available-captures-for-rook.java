class Solution {
    public int numRookCaptures(char[][] board) {
     
     int row=-1;
     int col=-1;
     int ans=0;
       for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            if(board[i][j]=='R'){
                row=i;
                col=j;
                break;
            }
        }
       } 

       for(int j=col-1;j>=0;j--){
          if(board[row][j]=='p'){
            ans++;
            break;
          }else if(board[row][j]=='B'){
            break;
          }
       }

       for(int j=col+1;j<board[0].length;j++){
          if(board[row][j]=='p'){
            ans++;
            break;
          }else if(board[row][j]=='B'){
            break;
          }
       }

       for(int i=row-1;i>=0;i--){
          if(board[i][col]=='p'){
            ans++;
            break;
          }else if(board[i][col]=='B'){
            break;
          }
       }

        for(int i=row+1;i<board.length;i++){
          if(board[i][col]=='p'){
            ans++;
            break;
          }else if(board[i][col]=='B'){
            break;
          }
       }

       return ans;
    }
}