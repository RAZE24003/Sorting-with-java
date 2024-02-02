public class selection_sort {
    
    public static void printarr(int arr[]) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr={7,8,3,1,0};
        for(int i=0;i<arr.length-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<arr.length;j++)
            {
                
                if(arr[smallest]>arr[j])
                {
                    smallest=j;
                }
                int temp;
                temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;
            }
        }
        printarr(arr);
        
    }
}
