public class test {
    /*
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        long num = 0;
        while(n!=0){
            num +=zeros(n);
            n--;
        }
        return num;
    }
    
    long zeros(long n){
        if(n<5) return 0;
        String str = n+"";
        char[] nums = str.toCharArray();
        long count = 0;
        int i = 0;
        for(i = nums.length; i>= 5; i--){
            if(nums[i]==0) count++;
            else break;
        }
        if(nums[i]==5) count++;
        return count;
    }
    
    public static void main(String[] args) {
    	long n =11;
    	test a = new test();
    	long nums = a.trailingZeros(n);
    	System.out.println(nums);
    }
}