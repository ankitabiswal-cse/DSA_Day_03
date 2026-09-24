public class FindMaximum {
    public static void main(String[] args){
        int[] arr ={34,78,90,67,54,134,987,678,546,3,78,90,87};
        int maximum = arr[0];

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum = arr[i];
            }
        }
        System.out.println(maximum);
    }
}
