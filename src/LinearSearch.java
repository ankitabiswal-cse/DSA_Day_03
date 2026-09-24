public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80,90,110,345,5,67,89};
        int target = 80;

        for(int i = 0; i<=arr.length;i++){
            if(arr[i] == target){
                System.out.println("Found at Index "+i);
                break;

            }
        }
    }
}
