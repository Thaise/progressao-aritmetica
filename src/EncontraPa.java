import java.util.Scanner;

public class EncontraPa {
	
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma sequencia numérica separando os números por vírgula:");
		String conjuntos = entrada.nextLine();
		String numerosSeparados[] = conjuntos.split(",");	
	
		System.out.println("Digite o enésimo termo que deseja descobrir:");
		int n = entrada.nextInt();

		calcula(numerosSeparados, n);
		
		desejaContinuar();
			
	}

	private static void desejaContinuar() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Deseja continuar? Se sim digite Ok, se não digite N.");
		String simOuNao = entrada.nextLine();
		
		if("Ok".equalsIgnoreCase(simOuNao)){
			main(null);
		}else if("N".equalsIgnoreCase(simOuNao)){
			System.out.println("Você escolheu parar por aqui!");
		}else{
			System.out.println("Opção inválida! Digite Ok para continuar e N para sair");
			simOuNao = entrada.nextLine();
			main(null);
		}
		
	}

	public static String calcula(String[]numerosSeparados, int n) {
	
	String resultado = "";
	String conjuntos = ""; 
	
	int segundoNumero =  Integer.parseInt(numerosSeparados[1]);
	int a1 = Integer.parseInt(numerosSeparados[0]);
	
	int r = segundoNumero - a1;
	
	int rTeste = 0;
		
	for(int i = 1; i < numerosSeparados.length; i++){	
		conjuntos = conjuntos+","+numerosSeparados[i];
	}
	
	for(int i = 2; i < numerosSeparados.length; i++){
		int numeroQualquer = Integer.parseInt(numerosSeparados[i]);
		int numeroQualquerMenosUm = Integer.parseInt(numerosSeparados[i-1]);
		rTeste = numeroQualquer - numeroQualquerMenosUm;
	}
		
	if(r != rTeste || numerosSeparados.length <= 2){
	
		resultado = "Não é uma P.A.!";
	
	
	}else{
		 	
		int an = a1 + ((n - 1)* r);
			
		resultado = "O "+n+" termo da P.A. é "+an+" -> "+a1+conjuntos+"..."+an;
	
	}
	
	System.out.println(resultado);
	
	
	return resultado;
	
	}

}
