class ProductArrayExceptSelf {

	public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int pre = 1;
        for(int i=0;i<nums.length;i++){
        	result[i]=pre;
            pre*=nums[i];
        }


        pre =1;
        for(int i=nums.length-1; i>=0; i--){
            result[i]*=pre;
            pre*=nums[i];
        }

        return result;
    }

	public static void main(String[] args){
		int[] nums = {1,2,3,4};
		ProductArrayExceptSelf object = new ProductArrayExceptSelf();

		int[] result = object.productExceptSelf(nums);

		for(int e:result)
			System.out.print(e+" ");
	        	
	}
}