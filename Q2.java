public class Q2 {
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void Q2(int ip){
        if(ip==0){
            return;
        }
        int ld = ip%10; // if 1234, returns = 4
        int rem = ip/10;// returns = 123
        Q2(rem);
        System.out.println(digits[ld]);
    }
    public static void main(String[] args) {
/*
You are given a number (eg - 2019), convert it into a String of english like
“two zero one nine”. Use a recursive function to solve this problem.
NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
can’t be 0.
Sample Input : 1947
Sample Output : “one nine four seven”

 */
        Q2(1234);
    }
}
