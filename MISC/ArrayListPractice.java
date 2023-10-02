import java.util.*;
// import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice  {

	public static void main(String[] args){
		System.out.println("ArrayList Class ====>");

		ArrayList<String> arr = new ArrayList<String>();

		arr.add("Hi");
		arr.add("How");
		arr.add("are");
		arr.add("you");
		Collections.sort(arr);
		System.out.println(arr.toString());
		for(String str:arr){
			System.out.print(str+" ");
		}

		System.out.println("\nNormal For Loop!");
		for(int i=0;i<arr.size();i++){
			System.out.print(arr.get(i)+" ");
		}

		System.out.println("Integer ArrayList");

		ArrayList<Integer> list = new ArrayList<Integer>(
			Arrays.asList(1,3,6,8,4,2,6)
		);

		Collections.sort(list);

		System.out.println(list);


	}
}