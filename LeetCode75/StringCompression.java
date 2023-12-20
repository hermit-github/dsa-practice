import java.util.HashMap;

class StringCompression {

	public int compress(char[] chars) {

		StringBuilder builder = new StringBuilder();

		char repeatingChar = chars[0];
		int repeatCount=1;

		builder.append(chars[0]);

		for(int i=1;i<chars.length;i++){
			if(chars[i] == repeatingChar){
				repeatCount++;
			} else {
				if(repeatCount > 1){
					builder.append(repeatCount);
				}

				repeatingChar = chars[i];
				builder.append(repeatingChar);
				repeatCount = 1;
			}
		}

		if(repeatCount > 1){
			builder.append(repeatCount);
		}
		
		char[] res = builder.toString().toCharArray();

		for(int i=0;i<res.length;i++){
			chars[i] = res[i];
		}

        return chars.length;
    }

	public static void main(String[] args){

		char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};

		StringCompression object = new StringCompression();
		System.out.println(object.compress(chars));
	        	
	}
}