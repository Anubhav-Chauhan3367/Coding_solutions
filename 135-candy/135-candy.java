class Solution {
    public int candy(int[] ratings) {
        
        int candies = 0;
        int[] child = new int[ratings.length];
        Arrays.fill(child, 1);
        
        for(int i=1; i<ratings.length; i++){
            if(ratings[i] > ratings[i-1]){
                child[i] = child[i-1]+1;
            }
        }
        for(int i=ratings.length-2; i>=0; i--){
            if(ratings[i] > ratings[i+1]){
                child[i] = Math.max(child[i], child[i+1]+1);
            }
        }
        for(int a: child){
            candies += a;
        }
        
        return candies;
        
    }
}