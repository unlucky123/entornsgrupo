package act1_entorns;

public class act1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sumArray = { 4, 36, 4, 23, 867 };
		int[] subArray = { 785675, 56, 5675, 56544, 234 };
		int[] prodArray = { 6, 8, 20, 23, 12 };
		
		// User 1 fer la suma dels elements de sumArray

		// User 2 fer la resta dels elements de subArray

		// User 3 fer la multiplicació dels elements de prodArray
		int resprod = 1;
		for (int i = 0; i < prodArray.length; i++) {
			resprod*= prodArray[i];
			
		}
		System.out.println("Multiplicacion del array= "+resprod);
	}
}
