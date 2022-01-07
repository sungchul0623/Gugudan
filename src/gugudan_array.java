import javax.print.CancelablePrintJob;

public class gugudan_array {

	public static void main(String[] args) {
		
		System.out.println("----2단----");
		
		int[] result = new int[9];
		for(int i=0; i < result.length; i++) {
			result[i] = 2 * (i +1);
		}
		
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		System.out.println("----3단----");
		
		int[] result1 = new int[9];
		for(int i=0; i < result1.length; i++) {
			result1[i] = 3 * (i +1);
		}
		
		for(int i=0; i < result1.length; i++) {
			System.out.println(result1[i]);
		}
		
		System.out.println("----4단----");
		
		int[] result2 = new int[9];
		for(int i=0; i < result2.length; i++) {
			result2[i] = 4 * (i +1);
		}
		
		for(int i=0; i < result2.length; i++) {
			System.out.println(result2[i]);
		
		}
		
	}

}
