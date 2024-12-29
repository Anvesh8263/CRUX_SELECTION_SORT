public class Selection_Sort1{
    public static void main(String[] args) {
        int arr [] = {4,-1,5,3,1,2,};
        // System.out.println(Minimum_Index(arr,2));
        sort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int idx=Minimum_Index(arr, i);
            int temp = arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
    }
    public static int Minimum_Index(int[] arr , int idx) {
        int mini = idx;
        for(int i =idx+1;i<arr.length;i++){
            if(arr[i]<arr[mini]){
                mini = i;
            }
        }
        return mini;
        
    }
}
