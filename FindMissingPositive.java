import java.util.HashSet;

public class FindMissingPositive{
    class Solution {
        public int solution(int[] A) {
            // write your code in Java SE 8

            // Store values in set which are greater than variable m 
            HashSet<Integer> hSet = new HashSet<>();
            int result=1; //default smallest positive integer

            for(int x : A){
                if(result < x){
                    hSet.add(x);
                } else if (result == x){
                    result += 1;
                    while(hSet.contains(result)){
                        // hSet.remove(result)
                        
                        result += 1;

                    }
                }
                
            }


            return result;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = { 2, 3, -7, 6, 8, 1, -10, 15, 4 };
        
        FindMissingPositive obj = new FindMissingPositive();
        FindMissingPositive.Solution sol = obj.new Solution();
        int result = sol.solution(nums);

        System.out.println(result);

    }

}

