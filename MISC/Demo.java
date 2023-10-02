
public class Demo{
	final int x = 1;
	final String str = "Hi There";

	public String toString(){
		return String.format("x %s, str %s",x,str);
	}

	public static void main(String[] args){
		Demo d = new Demo();
		System.out.println(d.toString());

		int[] numbers = {1,2,3,4,5};

		try{
			System.out.println(numbers[2]);
		} catch(Exception e){
			System.out.println("Something went wrong!");
		} finally{
			System.out.println("In the finally block");
		}
	}
}