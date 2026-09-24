public class SecondLargest {
    public static void main(String[] args){
        int[] arr = {10,40,35,56,78,98,89,789,789,99};

        int largest = arr[0];
        int secondLargest = arr[0];

        for(int i = 0;i<arr.length;i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest ="+largest);
        System.out.println("Second Largest ="+secondLargest);
    }
}
