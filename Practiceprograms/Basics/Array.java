package javaprograms;

public class Array {
    int addarr(int arr[]) {
    	int sum=0;
    	for(int i=0;i<arr.length;i++) {
    		sum=sum+arr[i];
    	}
    	return sum;
    }
    
	
	public static void main(String[] args) {
	 int[] nums= {1,2,3,4,5};
	 Array obj=new Array();
	 int result=obj.addarr(nums);
	 System.out.println(result);
 }
}
