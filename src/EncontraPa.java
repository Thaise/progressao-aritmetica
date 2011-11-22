import java.util.Scanner;

public class EncontraPa {
	
	public static void main(String[]args) throws EncontraPAException {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite uma sequencia numérica separando os números por vírgula:");
		String conjuntos = entrada.nextLine();
		String conjuntos2 = conjuntos.trim();
		String numerosSeparados[] = conjuntos2.split(",");
			
		int[] numerosInteiros = new int[numerosSeparados.length];
		
			for(int i = 0; i < numerosSeparados.length; i++){
				numerosInteiros[i] = Integer.parseInt(numerosSeparados[i]);
		}
		
		try{
			verificaSeEUmaPa(numerosInteiros);
				
			System.out.print("Digite o enésimo termo que deseja descobrir:");
			int n = entrada.nextInt();
			
			System.out.println("O termo "+n+" dessa PA é "+calcula(numerosInteiros, n)+". " +
					"PA = "+conjuntos+"..."+calcula(numerosInteiros, n));
			
			continuar();
			
		}catch(EncontraPAException e){
			System.out.println("Não é uma P.A.!");
			continuar();
		}
	}

	private static void continuar() throws EncontraPAException {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite S para continuar e N para sair: ");
		String simOuNao = entrada.nextLine();
		if(simOuNao.equalsIgnoreCase("n")){
		System.out.print("Você parou por aqui. ");
		}else if(simOuNao.equalsIgnoreCase("s")){
			main(null);
		}else{
			while(!(simOuNao.equals("n"))&&(!(simOuNao.equals("s")))){
				System.out.print("Opção inválida! Digite S para continuar e N para sair: ");
				simOuNao = entrada.nextLine();
				if(simOuNao.equalsIgnoreCase("n")){
					System.out.print("Você escolheu parar por aqui. Até a próxima!");
				}else if(simOuNao.equalsIgnoreCase("s")){
				main(null);
				}	
			}
		}
		
	}

	private static void verificaSeEUmaPa(int[] numerosInteiros) throws EncontraPAException {
	
		int r =  numerosInteiros[1] - numerosInteiros[0];
		
		int rTeste = 0;
		
		for(int i = 2; i < numerosInteiros.length; i++){
			rTeste = numerosInteiros[i] - numerosInteiros[i-1];
		}
			
		if(r != rTeste || numerosInteiros.length <= 2){
			throw new EncontraPAException(null);	
		}
	}

	public static int calcula(int[] numerosInteiros, int n) {
		
	int a1 = numerosInteiros[0];
	int segundoNumero = numerosInteiros[1];
	
	int r = segundoNumero - a1;

	int an = a1 + ((n - 1)* r); 

		return an;
	}

}
