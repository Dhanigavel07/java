public class palindrome{
    public static void main(String args[]){
        String str="madam";
        String str2="Aa";
        String str3="@abc*ba";
        String str4=" abcba";
        String str5="dhanush";
        System.out.println(checkPalindrome(str.toLowerCase()));
        System.out.println(checkPalindrome(str2.toLowerCase()));
          System.out.println(checkPalindrome(str3.toLowerCase()));
            System.out.println(checkPalindrome(str4.toLowerCase()));
              System.out.println(checkPalindrome(str5.toLowerCase()));
    }
    private static boolean checkPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(!Character.isAlphabetic(str.charAt(left))){
                left++;
            }
            else if(!Character.isAlphabetic(str.charAt(right))){
                right--;
            }
             else if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
        
        else{
            left++;
            right--;
        }
        }
        return true;
    }
}
