public class firstOcc {
     public static int firstLast(String str, char ch, int idx){
        if(idx>=str.length()){
            return -1;
        }
        if(str.charAt(idx)==ch){// if x is at index
            return idx;
        }
        return firstLast(str, ch, idx+1);
    }
    public static void main(String[] args) {
        String str = "bghdatauara";
        System.out.println(firstLast(str, 'a', 0));
        
    }
}
