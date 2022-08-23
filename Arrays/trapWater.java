public class trapWater {

    //method to find that the bars can store maximum water
    static int getWater(int arr[]){
        int n=arr.length;
        int res=0;
        for(int i=1;i<n;i++){
            int leftMax=arr[i];
            for(int j=0;j<i;j++){
                leftMax=Math.max(leftMax, arr[j]);
            }
            int rightMax=arr[i];
            for(int j=i+1;j<n;j++){
                rightMax=Math.max(rightMax, arr[j]);
            }
            res=res+(Math.min(leftMax, rightMax)-arr[i]);
        }
        return res;
    }
    //efficient approach(we will first compute all lmax and rmax for every element in the array)
    /**
     * @param arr
     * @return
     */
    static int getWater2(int arr[]){
        int res=0;
        int n=arr.length;
        int rmax[]=new int[n];
        int lmax[]=new int[n];
       
        for(int i=1;i<n;i++){
            lmax[i]=Math.max(arr[i],(new int[n])[i-1]);
        }

        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(arr[i],rmax[i+1]);
        }
        for(int i=1;i<n-1;i++){
            res=res+(Math.min(lmax[i],rmax[i])-arr[i]);
        }
        return res;



    }
    public static void main(String[] args) {
        //int arr[]={3,0,1,2,5};
        int arr[]={2,0,2};
        System.out.println(getWater2(arr));
    }
}
