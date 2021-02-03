import java.util.Arrays;
class TrappingRain{
	/*Returns maximum number within a subarray*/
	static int max(int a[],int firstIndex,int lastIndex){	
		return Arrays.stream(arr,firstIndex,lastIndex).max().getAsInt();//converting array into stream within a range finding max out of it and returning it as an Integer
	}
	/*Calculates and returns total Rainwater trapped between the walls*/
	static int calcTrappedRain(int arr[]){
	int total_trapped_water=0,trapped_water,leftMax,rightMax;
	int n=arr.length;//Array length
	for(int i=1;i<n-1;i++)
	{
	leftMax=max(arr,0,i);//Finding the left maximum boundary for ith wall
	rightMax=max(arr,i+1,n);//Finding the right maximum boundary for ith wall
	trapped_water=Math.min(leftMax,rightMax)-arr[i];
	if(trapped_water<0) 
		trapped_water=0;
	total_trapped_water+=trapped_water;
	}
	return total_trapped_water;
	}
	/*Driver Code*/
	public static void main(String args[]){
	int a[]={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
	System.out.println(calcTrappedRain(a));
}
}
