public class revString {
    public static void rev(String str){
        if(str.length()==0){
            
            return ;
        }
        rev(str.substring(1));
        System.out.println(str.charAt(0));
        /*
         * Certainly! Let's dive into points 3 and 4 of the code in more detail:

3. Recursive Call with Substring:
   ```java
   printReverseRecursive(string.substring(1));
   ```
   In this step, the `printReverseRecursive` method is called recursively with a substring of the original string. The `substring(1)` method is used to obtain a new string starting from index 1 of the original string. By passing this substring as an argument to the recursive call, we effectively reduce the size of the problem in each recursive step. The substring contains all characters of the original string except the first character.

   For example, let's say the original string is `"Hello, World!"`. In the first recursive call, the substring passed will be `"ello, World!"`. In the subsequent recursive calls, the substring will keep reducing until it becomes an empty string.

   The purpose of this recursive call is to handle the characters of the string in reverse order. By calling `printReverseRecursive` with the substring, we ensure that the subsequent recursive calls will process the remaining characters in reverse order.

4. Printing the First Character:
   ```java
   System.out.print(string.charAt(0));
   ```
   After the recursive call, we use `System.out.print()` to print the first character of the original string. The `charAt(0)` method is used to retrieve the character at index 0 of the string. Since the recursive calls are made with substrings starting from the second character, this line ensures that the first character is printed last.

   By printing the first character after the recursive call, we effectively print the characters of the string in reverse order. Each recursive call prints the next character from the end of the string until we reach the first character.

   Continuing with the previous example, when the recursive calls start returning, the first character printed will be `'!'`. As we backtrack through the recursive calls, the subsequent characters are printed in reverse order until we reach the last character `'H'`, resulting in the output `!dlroW ,olleH`.

These steps together allow the recursive function to print the reverse of a string by dividing the problem into smaller subproblems and solving them in reverse order using recursive calls and backtracking.
         */
    }
    public static void main(String[] args) {
        // print string in reverse "abcd"
        String str = "abcd";
        rev(str);

    }
}
