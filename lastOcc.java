public class lastOcc {
    public static int lastOcc(String str, char ch, int idx){
        if(idx<=0){
            return -1;
        }
        if(str.charAt(idx-1)==ch){
            return idx-1;
        }
        return lastOcc(str, ch, idx-1);
    }
    public static void main(String[] args) {
        String str = "bghdatauaramkh";
        ;
        System.out.println(lastOcc(str, 'a', str.length()));
    }
}
