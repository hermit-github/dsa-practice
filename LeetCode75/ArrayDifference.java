import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;


class ArrayDifference {

	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		int maxIterations = Math.max(nums1.length,nums2.length);

		for(int i=0;i<maxIterations;i++){
			if(i<nums1.length) set1.add(nums1[i]);
			if(i<nums2.length) set2.add(nums2[i]);
		}

		List<Integer> list1 = new ArrayList<>(set1);
		List<Integer> list2 = new ArrayList<>(set2);

		list1.removeAll(set2);
		list2.removeAll(set1);
		
		List<List<Integer>> result = new ArrayList<>();
		result.add(list1);
		result.add(list2);

		return result;        
    }


	public static void main(String[] args){

		int[] nums1 = {1,2,3};
		int[] nums2 = {2,4,6};

		ArrayDifference object = new ArrayDifference();

		System.out.println(object.findDifference(nums1,nums2));
	}	
}
