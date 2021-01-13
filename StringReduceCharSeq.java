public class StringReduceCharSeq {
    class Solution {
        public String solution(String s) {
            // write your code in Java SE 8
                // traverse in the string 
            int l = s.length();
            for (int i = 1; i < l-1; i++) 
            { 
                // if adjacent characters are AB, BA or CD ,DC
                
                if ((s.charAt(i) == 'A' && s.charAt(i+1) == 'B') ||
                   (s.charAt(i) == 'B' && s.charAt(i+1) == 'A') ||
                   (s.charAt(i) == 'C' && s.charAt(i+1) == 'D') ||
                   (s.charAt(i) == 'D' && s.charAt(i+1) == 'C') )
                   {
                       //remove chars by found index from string s
                   }
    
            }
            return s;
        }
    }
    
    public static void main(String[] args) {
        String str = "CABCACD";
        
        StringReduceCharSeq obj = new StringReduceCharSeq();
        StringReduceCharSeq.Solution sol = obj.new Solution();
        String result = sol.solution(str);

        System.out.println(result);

    }
}
