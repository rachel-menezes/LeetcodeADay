// https://leetcode.com/problems/number-of-islands/description/
class Solution {
    public int numIslands(char[][] grid) {
    int count = 0;
        for(int i = 0; i< grid.length; i++){
            for(int j =0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    iterate(grid, i, j);
                }
            }
        }
    return count;
    }
    
    public void iterate(char[][] grid, int i, int j){
        int n = grid.length;
        int m = grid[0].length;
        
        if(i <0 || j < 0 || i >=n || j >= m || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        iterate(grid, i+1, j);
        iterate(grid, i-1, j);
        iterate(grid, i, j+1);
        iterate(grid, i, j-1);
        
    }
}