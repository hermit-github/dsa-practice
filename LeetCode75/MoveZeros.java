import java.util.Collections;

class MoveZeros {

	public void moveZeroes(int[] nums) {

		if(nums.length == 1){
			return;
		}
        
        int nzi = 0;

        for(int i = 0;i<nums.length;i++){
        	if(nums[i] != 0){
        		nums[nzi] = nums[i];
        		nzi++;
        	}
        }

        while(nzi<nums.length){
        	nums[nzi] = 0;
        	nzi++;
        }

    }

	public static void main(String[] args){
		int[] nums = {0,1,0,3,12};
		MoveZeros obj = new MoveZeros();

		obj.moveZeroes(nums);

		for(int n:nums) System.out.print(n+" ");
	}
}