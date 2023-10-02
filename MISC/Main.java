
enum LEVEL {
	EXTREAM,
	HIGH,
	MEDIUM,
	LOW
}

public class Main{
	public static void main(String[] args) {
		String[] arr = {"Hi","Hello","What's up"};
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		final int i = 9;
		System.out.println(arr[0].charAt(1));


		switch(12){
			case 12:
				System.out.println("Actual Case");
				break;
			case 13:
				System.out.println("Testing switch case");
				break;
			default:
				System.out.println("Default");
				break;
		}

		// for each loop
		for(String str:arr){
			System.out.println(str);
		}

		for(LEVEL myVar:LEVEL.values()){
			System.out.println(myVar);
		}
	}
}