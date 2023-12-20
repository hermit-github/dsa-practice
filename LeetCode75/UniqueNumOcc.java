import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

class UniqueNumOcc{

	public boolean uniqueOccurrences(int[] arr) {

		boolean result = true;

		Map<Integer,Integer> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();

		// create a map of elements mapped with their occ
		for(int ele:arr){
			if(!map.containsKey(ele)){
				map.put(ele,1);
			} else {
				int oldValue = map.get(ele);
				map.replace(ele,oldValue,oldValue+1);
			}
		}

		// check if occ is repeated
		for(Map.Entry<Integer,Integer> entry:map.entrySet()){
			if(set.contains(entry.getValue())){
				result = false;
				break;
			} else {
				set.add(entry.getValue());
			}	
		}
		
        return result;
    }


	public static void main(String[] args){
		int[] arr = {1,2};
		UniqueNumOcc object = new UniqueNumOcc();
		System.out.println(object.uniqueOccurrences(arr));
	}
}