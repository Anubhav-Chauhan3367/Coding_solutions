class Solution {
    public int candy(int[] ratings) {
        
        int candies = 0;
        int up=0, down=0;
        int prevSlope = 0;
        
        for(int i=1; i<ratings.length; i++){
            
            int currSlope = (ratings[i]>ratings[i-1])?1:((ratings[i]<ratings[i-1])?-1:0);
            
            if((prevSlope<0 && currSlope>=0) || (prevSlope>0 && currSlope==0)){
                candies += (sum(up)+sum(down)+Math.max(up, down));
                up = 0;
                down = 0;
            }
            
            if(currSlope > 0) up++;
            else if(currSlope < 0) down++;
            else candies++;
            
            prevSlope = currSlope; 
            
        }
        
        candies += (sum(up)+sum(down)+Math.max(up, down)+1);
        
        
        
        return candies;
        
    }
    
    private int sum(int a){
        return (a*(a+1))/2;
    }
}