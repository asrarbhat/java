class LeetProblemOne {
	public static void main(String[] args){
	int[] arr={1,2,3,6,7,9,10};
	System.out.println(searchInsert(arr,1));
	}
    public static int searchInsert(int[] nums, int target) {
        
        int left=0;
        int right=nums.length-1;
        int mid=right/2;
        
        while (left<=right){
            if (nums[mid]==target) return mid;
            else if (nums[mid]>target){
                right=mid-1;
                mid=(left+right)/2;
                
            }
            else{
                left=mid+1;
                mid=(left+right)/2;
            }
        }
        return mid;
    }
}
