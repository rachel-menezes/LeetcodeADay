//https://leetcode.com/problems/surrounded-regions/solutions/
class Solution {
    public void solve(char[][] board) {
      int visited[][] = new int[board.length][board[0].length];
      for(int  j = 0,  i = 0 ; i < board.length; i++){
          if(board[i][j] == 'O'){
              board[i][j] ='Y';
            //   visited[i][j] = 1;
          }
      }

      for(int i = 0, j = board[0].length-1 ; i < board.length; i++){
          if(board[i][j] == 'O'){
              board[i][j] ='Y';
            //   visited[i][j] = 1;
          }
            
      }   

      for(int i = 0, j = 0 ; j < board[0].length; j++){
          if(board[i][j] == 'O'){
              board[i][j] ='Y';
          }
      }   

      for(int i = board.length-1, j = 0 ; j < board[0].length; j++){
          if(board[i][j] == 'O'){
            board[i][j] ='Y';  
          }
      }

      for(int i =0 ; i < board.length; i++){
          for(int j =0; j < board[0].length; j++){
              if ( board[i][j] =='Y')
                markotherzeros(board, visited, i ,j);
          }
      }

      for(int i =0 ; i < board.length; i++){
          for(int j =0; j < board[0].length; j++){
              if ( board[i][j] =='O')
                board[i][j] = 'X';
              if ( board[i][j] =='Y')
                board[i][j] = 'O';
          }
      }            
    }

    public void markotherzeros(char[][] board, int[][] visited, int i, int j)
    {
        if(i < 0 || j < 0 || i>= board.length || j >= board[0].length || board[i][j] == 'X' || visited[i][j]==1)
            return;
        
        board[i][j] ='Y';
        visited[i][j] = 1;
        markotherzeros(board, visited, i+1, j);
        markotherzeros(board, visited, i-1, j);
        markotherzeros(board, visited, i, j+1);
        markotherzeros(board, visited, i, j-1);
    }
}