package vetores;

public class vetores {

	public static void main(String[] args) {
		
	// Criacao de um vetor/array
	double[] notas = {7.8, 8.4, 6.5, 9.2};
	String [] alunos = {
			"Maria",
			"Pedro",
			"Ana",
			"Fabiana",
			"Fernanda",
			"Willian"
	};
	
	System.out.println("Notas: " + notas.length);
	System.out.println("Alunos: " + alunos.length);
	System.out.println("A nota do 3 bim foi: " + notas[2]);
	
	double soma = 0;
	for(int i= 0; i < 4; i++) {
		soma += notas[i];
	}
	
	double media = soma/4;
	
	// Looping for/while/Do-Until
	
	System.out.println("Média: " + media);
//	int x = 3;
	
// notas[]	
	}

}
