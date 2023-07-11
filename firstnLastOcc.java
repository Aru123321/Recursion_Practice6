public class firstnLastOcc {
    public static int firstOcc(String str, char ch, int idx){
        if(idx>=str.length()){
            return -1;
        }
        if(str.charAt(idx)==ch){
            return idx;
        }
        return firstOcc(str, ch, idx+1);
    }
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
        System.out.println("First Occ: "+firstOcc(str, 'a', 0) + " Last Occ: " + lastOcc(str, 'a', str.length()-1));
        
    }
}
