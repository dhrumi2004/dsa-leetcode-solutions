class Solution {
    public String reverseWords(String s) {
        String reversed = "";
        String word = "";
     

        for(int a=0; a<s.length(); a++)
        {
            while(a < s.length() && s.charAt(a)!=' ')
            {
                word = word + s.charAt(a);
                a++;
            } 
            for(int i = word.length() - 1; i>=0; i--)
            {
                reversed = reversed + word.charAt(i);
            }   
            word = "";
            if(a < s.length()){reversed = reversed + " ";}
  
        }
        return reversed; 
    }
}