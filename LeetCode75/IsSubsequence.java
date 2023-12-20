class IsSubsequence {

	public boolean isSubsequence(String s,String t){
        if(s.length() == 0) return true;
		int originalArrIdx = 0;

		for(int i = 0;i<t.length();i++){
			if(originalArrIdx < s.length() && t.charAt(i) == s.charAt(originalArrIdx)){
				originalArrIdx++;
			}
		}
		return originalArrIdx  == s.length() ;
	}

	public static void main(String[] args){
	     IsSubsequence object = new IsSubsequence();
	     System.out.println(object.isSubsequence("abc","ahbgdc"));
	}
}