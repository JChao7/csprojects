
public class Exercise05_02 {

	public static void main(String[] args) {
		int i = 100;
		int counter = 0;
		
		while (i <= 1000) {
				if (((i % 4) == 0) && ((i % 6) == 0)) {
					System.out.printf("%4s" , i);
					i++;
					counter ++;
					}
			
					else {
						i++;
					}
				
				if (counter == 8) {
					System.out.printf("\n");
					counter = 0;
				}
						
		}
	}
}

