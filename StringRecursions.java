public class StringRecursions {
    public String reverseString(String input) {
        if (input.length() == 1)
            return input;
            // base case, when the length of input is 1, we dont need to reverse the string anymore.
        else {
            return reverseString(input.substring(1)) + input.charAt(0);
            // recursion case, we constantly shrink the length of the input.
        }
    }
    public Boolean isPalindrome(String input) {
        if (input.length() == 0 || input.length() == 1)
            return true;
            // two base cases, when the length of the word is 0 or 1, we all say that it is a palindrome.
        else if (input.charAt(0) == input.charAt(input.length()-1)){
            return isPalindrome(input.substring(1, input.length()-1));
        }
            //we only do the recursion case when the chars at the beginning and at the end matchs, again, we shrink the input size in the recursion case
            //One note is that charAt dont accept -1 as the last char and substring's indexing rule is the same as string slicing in python
        else 
            return false;
    }
}
