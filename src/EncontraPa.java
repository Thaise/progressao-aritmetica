
public class EncontraPa {

	public static String calcula(int[] conjuntoNumeros, int n) {
	
	String resultado = "";	
	String conjuntos = "";
		
	int r =  conjuntoNumeros[1] - conjuntoNumeros[0];
	
	int rTeste = 0;
		
	for(int i = 1; i < conjuntoNumeros.length; i++){	
		conjuntos = conjuntos+","+conjuntoNumeros[i];
	}
	
	for(int i = 2; i < conjuntoNumeros.length; i++){
		rTeste = conjuntoNumeros[i] - conjuntoNumeros[i-1];
	}
		
	if(r != rTeste){
	
		resultado = "Não é uma P.A.";
	
	}else{
		
		int a1 = conjuntoNumeros[0];
		
		int an = a1 + ((n - 1)* r);
			
		resultado = "O "+n+" termo da P.A. é "+an+" -> "+a1+conjuntos+"..."+an;
		
	}
	
	
	return resultado;
	
	}

}
