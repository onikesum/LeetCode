class Solution {
    public int countNegatives(int[][] grid) {
       int n = 0;
        for(int i=0; i< grid.length; i++){
            int left = 0, right = grid[i].length - 1; 
            while(left<=right){
                int mid = (left + right) / 2;
                if(grid[i][mid] >= 0)
                    left = mid + 1;
                else
                    right = mid - 1;
               
        }
            
            n += (grid[i].length-1) - right;
            
    }
        return n;        
    }
}