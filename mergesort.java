public class mergesort {
    public static void conquer(int arr[],int a,int mid,int c ) {
      int merge[]=new int[c-a+1];
      int i1=a;
      int i2=mid+1;
      int x=0;
      while(i1<=mid && i2<=c)
      {
        if(arr[i1]<=arr[i2])
        {
            merge[x++]=arr[i1++];
        }
        else{
            merge[x++]=arr[i2++];
        }
      }
      while(i1<=mid )
      {
          merge[x++]=arr[i1++];
      }
      while(i2<=c)
      {
          merge[x++]=arr[i2++];
      }
      for(int i=0,j=a;i<merge.length;i++,j++)
      {
        arr[j]=merge[i];
      }

    }
    public static void divide(int arr[],int i,int j) {
        if(i>=j)
        {
            return;
        }
    int mid=i+(j-i)/2; 
    divide(arr, i,mid);
    divide(arr, mid+1, j);
    conquer(arr, i, mid, j);
    }
    
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        divide(arr, 0, n-1);

        for(int i=0;i<=n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
