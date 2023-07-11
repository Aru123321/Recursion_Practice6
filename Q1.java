public class Q1{
    public static void occ(int arr[], int idx, int key){
        if(idx>=arr.length){
            
            return ;
        }
        if(arr[idx]==key){// key is at 0
              System.out.print(idx + " ");
        }
        //if key not at 0
         occ(arr, idx+1, key);

    }
    public static void main(String[] args) {
/*
Question 1 : For a given integer array of size N. You have to find all the occurrences
(indices) of a given element (Key) and print them. Use a recursive function to solve this
problem.
Sample Input : arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
Sample Output : 1 5 7 8
 */    
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        occ(arr, 0, key);
    }
}