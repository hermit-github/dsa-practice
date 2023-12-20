class IncreasingTripletSubsequence {

	public boolean increasingTriplet(int[] nums) {
		boolean tripletExists = false;
		int arrayLength = nums.length - 1;
		int[] leftMin = new int[nums.length];
		int[] rightMax = new int[nums.length];

		leftMin[0] = nums[0];
		rightMax[arrayLength] = nums[arrayLength];
		int idx = 1;
		int j = arrayLength - 1;

		while(idx<=arrayLength && j>=0){
			leftMin[idx] = Math.min(nums[idx],leftMin[idx-1]);
			rightMax[j] = Math.max(nums[j],rightMax[j+1]);
			idx++;
			j--;
		}

		for(int i = 0;i<=arrayLength;i++){
			if(nums[i]>leftMin[i] && nums[i]<rightMax[i]){
				tripletExists = true;
				break;
			}
		}

		return tripletExists;
    }

	public static void main(String[] args){

		int[] nums = {5,4,3,2,1};
	 	IncreasingTripletSubsequence object = new IncreasingTripletSubsequence();

	 	System.out.println(object.increasingTriplet(nums));       	
	}
}