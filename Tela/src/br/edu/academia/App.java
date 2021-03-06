package br.edu.academia;

 import java.time.LocalDate;

 import br.edu.academia.model.AtividadesFisicasNiveis;
 import br.edu.academia.model.Pessoa;


 public class App {

	 public static void main(String[] args) {
		
		Pessoa dadosRafa = new Pessoa();
		
		dadosRafa.setNome("Rafaela");
		dadosRafa.setSexo("F");
		dadosRafa.setPeso(120);
		dadosRafa.setAltura(1.68);
		dadosRafa.setDataDeNascimento(LocalDate.of(2004, 2, 18));
		dadosRafa.setNivelAtividade(AtividadesFisicasNiveis.MODERADO);
		System.out.println("** " + dadosRafa.getNome() + " **");
		System.out.println("IMC: " + dadosRafa.getImc());
		System.out.println("Situa��o: " + dadosRafa.getStatusImc());
		System.out.println("Idade: " + dadosRafa.getIdade());
		System.out.println("NCD: " + dadosRafa.getNcd());
		System.out.println("***********************************");
		
Pessoa dadosPedro = new Pessoa();
		
		dadosPedro.setNome("Pedro");
		dadosPedro.setSexo("M");
		dadosPedro.setPeso(75);
		dadosPedro.setAltura(1.75);
		dadosPedro.setDataDeNascimento(LocalDate.of(2003, 2, 18));
		dadosPedro.setNivelAtividade(AtividadesFisicasNiveis.MODERADO);
		System.out.println("** " + dadosPedro.getNome() + " **");
		System.out.println("IMC: " + dadosPedro.getImc());
		System.out.println("Situa��o: " + dadosPedro.getStatusImc());
		System.out.println("Idade: " + dadosPedro.getIdade());
		System.out.println("NCD: " + dadosPedro.getNcd());
		System.out.println("***********************************");
		
Pessoa dadosMaria = new Pessoa();
		
		dadosMaria.setNome("Maria");
		dadosMaria.setSexo("F");
		dadosMaria.setPeso(55);
		dadosMaria.setAltura(1.70);
		dadosMaria.setDataDeNascimento(LocalDate.of(2003, 2, 18));
		dadosMaria.setNivelAtividade(AtividadesFisicasNiveis.MODERADO);
		System.out.println("** " + dadosMaria.getNome() + " **");
		System.out.println("IMC: " + dadosMaria.getImc());
		System.out.println("Situa��o: " + dadosMaria.getStatusImc());
		System.out.println("Idade: " + dadosMaria.getIdade());
		System.out.println("NCD: " + dadosMaria.getNcd());
		System.out.println("***********************************");
	
		
Pessoa dadosMarco = new Pessoa();
		
		dadosMarco.setNome("Marco");
		dadosMarco.setSexo("M");
		dadosMarco.setPeso(80);
		dadosMarco.setAltura(1.80);
		dadosMarco.setDataDeNascimento(LocalDate.of(2003, 2, 18));
		dadosMarco.setNivelAtividade(AtividadesFisicasNiveis.MODERADO);
		System.out.println("** " + dadosMarco.getNome() + " **");
		System.out.println("IMC: " + dadosMarco.getImc());
		System.out.println("Situa��o: " + dadosMarco.getStatusImc());
		System.out.println("Idade: " + dadosMarco.getIdade());
		System.out.println("NCD: " + dadosMarco.getNcd());
		System.out.println("***********************************");
	}
} 
