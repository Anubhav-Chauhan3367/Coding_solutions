class Solution {
    public String intToRoman(int num) {
        
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        
        hm.put(1, "I");
        hm.put(4, "IV");
        hm.put(5, "V");
        hm.put(9, "IX");
        hm.put(10, "X");
        hm.put(40, "XL");
        hm.put(50, "L");
        hm.put(90, "XC");
        hm.put(100, "C");
        hm.put(400, "CD");
        hm.put(500, "D");
        hm.put(900, "CM");
        hm.put(1000, "M");
        
        int arr[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String res = "";
        
        while(num > 0){
            int i=0;
            for(i=0; i<arr.length; i++){
                if(arr[i] <= num){
                    break;
                }
            }
            res = res + hm.get(arr[i]);
            num = num - arr[i];
            
        }
        
        return res;
    }
}