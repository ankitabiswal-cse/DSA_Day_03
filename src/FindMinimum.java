public class FindMinimum {
    public static void main(String[] args){
        int[] arr = {34,78,90,78,67,45,34,90,67,45,23,4512,29};

        int minimum = arr[0];

        for(int i = 0;i<arr.length;i++){
            if (arr[i]<minimum) {
                minimum = arr[i];

            }

        }
        System.out.println(minimum);
    }
}
