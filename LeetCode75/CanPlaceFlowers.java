class CanPlaceFlowers {

	public boolean canPlaceFlowers(int[] flowerbed,int n){

		if (n == 0) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 
            	&& (i == 0 || flowerbed[i-1] == 0) 
            	&& (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
        }
        return false;
	}

	public static void main(String[] args){
		CanPlaceFlowers object = new CanPlaceFlowers();

		int[] flowerbed = {1,0,0,0,0,1};

		System.out.println(object.canPlaceFlowers(flowerbed,2));
	}
}