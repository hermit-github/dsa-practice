import java.util.HashSet;

class ReverseVowelsString {

	public String reverseVowels(String s) {

		char[] chars = s.toCharArray();

		// vowels
		HashSet<Character> vowels = new HashSet<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');

		// taking two pointer approach
		int i = 0;
		int j = s.length() - 1;

		while(i<j) {
			char charAtI = chars[i];
			char charAtJ = chars[j];

			if(vowels.contains(charAtI) && vowels.contains(charAtJ)){
				chars[i] = charAtJ;
				chars[j] = charAtI;
				i++;
				j--;
			} else if (!vowels.contains(charAtI) && vowels.contains(charAtJ)){
				i++;
			} else if (vowels.contains(charAtI) && !vowels.contains(charAtJ)){
				j--;
			} else {
				i++;
				j--;
			}

		}

        return new String(chars);
    }

    public String reverseVowelsFaster(String s) {
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";
        
        while (start < end) {
            // Move start pointer until it points to a vowel
            while (start < end && vowels.indexOf(word[start]) == -1) {
                start++;
            }
            
            // Move end pointer until it points to a vowel
            while (start < end && vowels.indexOf(word[end]) == -1) {
                end--;
            }
            
            // Swap the vowels
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;
            
            // Move the pointers towards each other
            start++;
            end--;
        }
        
        String answer = new String(word);
        return answer;
    }

    public static void main(String[] args){

    	ReverseVowelsString object = new ReverseVowelsString();

    	System.out.println(object.reverseVowels("Euston saw I was not Sue."));
    }



}