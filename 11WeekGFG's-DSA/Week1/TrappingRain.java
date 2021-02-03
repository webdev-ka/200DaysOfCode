import java.util.Arrays;
class TrappingRain{
	static int max(int a[],int firstIndex,int lastIndex){
		
		Arrays.sort(a,firstIndex,lastIndex);//sort subarray from firstIndex to lastIndex-1
		return a[lastIndex-1];
	}
	static int calcTrappedRain(int arr[]){
	int total_trapped_water=0,trapped_water,leftMax,rightMax;
	int n=arr.length;//Array length
	for(int i=1;i<n-1;i++)
	{
	int[] backup = Arrays.copyOf(arr,n);
	leftMax=max(backup,0,i);//Finding the left maximum boundary for ith wall
	rightMax=max(backup,i+1,n);//Finding the right maximum boundary for ith wall
	trapped_water=Math.min(leftMax,rightMax)-arr[i];
	if(trapped_water<0)
		trapped_water=0;
	System.out.println("index"+i+"value"+arr[i]+"trapped_water"+trapped_water);
	total_trapped_water+=trapped_water;
	}
	return total_trapped_water;
	}
public static void main(String args[]){
	int a[]={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
	System.out.println(calcTrappedRain(a));
}
}