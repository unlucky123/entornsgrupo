package act1_entorns;

public class act1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sumArray = { 4, 36, 4, 23, 867 };
		int[] subArray = { 785675, 56, 5675, 56544, 234 };
		int[] prodArray = { 6, 8, 20, 23, 12 };
		
		// User 1 fer la suma dels elements de sumArray
		System.out.println("Suma de valors de sumArray");
		int suma =0;
		for(int i = 0; i< sumArray.length; i++) {
			suma= suma+sumArray[i];
			
		}
		System.out.println(suma);
		

		// User 2 fer la resta dels elements de subArray
		int resultatResta = subArray[0];  
	     for (int i = 1; i < subArray.length; i++) {
	         resultatResta -= subArray[i];  
	     }
	     System.out.println(resultatResta);

		// User 3 fer la multiplicació dels elements de prodArray
		int resprod = 1;
		for (int i = 0; i < prodArray.length; i++) {
			resprod*= prodArray[i];
			
		}
		System.out.println("Multiplicacion del array= "+resprod);
	}
}
