public class Q3 {
    public static int len(String str){
        if(str.isEmpty()){
            return 0;
        }
        return 1 + len(str.substring(1));

    }    
    public static void main(String[] args) {
    //Write a program to find Length of a String using Recursion.
    String str = "niemfk";
    System.out.println(len(str));
    
    }
}
