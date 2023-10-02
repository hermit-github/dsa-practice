import java.util.*;


public class IteratorsDemo {

	public static void main(String[] args){

		ArrayList<Integer> arr = new ArrayList<Integer>(
			Arrays.asList(1,2,4,6,8)
		);

		Iterator it = arr.iterator();


		while(it.hasNext()){
			System.out.println(it.next());
		}

		
	}
}