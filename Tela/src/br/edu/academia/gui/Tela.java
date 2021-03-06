package br.edu.academia.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.edu.academia.model.Pessoa;



public class Tela {

	public static void main(String[] args) {

		Color laranja = new Color (255,127,0);
		Color vinho = new Color (140,23,23);
		Color verdeEscuro = new Color (82,127,118);
		Color white = new Color(255, 255, 255);
		Color azul = new Color(95,159,159);
		Color verdeClaro = new Color(236, 112, 99);
		Font titulo = new Font ("Arial", Font.BOLD, 22);
		Font subTitulo = new Font ("Arial", Font.BOLD, 14);
		Font tituloResultado = new Font ("Arial", Font.BOLD, 20);
		
		JFrame tela = new JFrame();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(600, 560);
		tela.setLocationRelativeTo(null);
		tela.setTitle("Academia Boa Forma");
		tela.setLayout(null);
				
		// Titulo
		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("   Academia Boa Forma");
		labelTitulo.setBounds(0, 0, 700, 30);
		labelTitulo.setBackground(azul);
		labelTitulo.setForeground(white);
		labelTitulo.setFont(titulo);
		labelTitulo.setHorizontalAlignment(SwingConstants.LEFT);
		labelTitulo.setOpaque(true);
		
		// Titulo Nome
		JLabel labelNome = new JLabel();
		labelNome.setBounds(20, 50, 100, 20);
		labelNome.setText("Nome");
		labelNome.setFont(subTitulo);
				
		JTextField textoDoNome = new JTextField();
		textoDoNome.setBounds(20, 70, 200, 20);
		
		// Titulo Altura
		JLabel labelAltura = new JLabel();
		labelAltura.setBounds(20, 100, 100, 20);
		labelAltura.setText("Altura");
		labelAltura.setFont(subTitulo);
						
		JTextField textoDaAltura = new JTextField();
		textoDaAltura.setBounds(20, 120, 200, 20);
		
		// Titulo Peso
		JLabel labelPeso = new JLabel();
		labelPeso.setBounds(20, 150, 100, 20);
		labelPeso.setText("Peso");
		labelPeso.setFont(subTitulo);
		
		JTextField textoDoPeso = new JTextField();
		textoDoPeso.setBounds(20, 170, 200, 20);
		
		// Ano 
		JLabel labelAno = new JLabel();
		labelAno.setBounds(20, 220, 200, 20);
		labelAno.setText("Ano: ");
		labelAno.setFont(subTitulo);
		
		JTextField textoDoAno = new JTextField();
		textoDoAno.setBounds(20, 240, 40, 20);

		// Mes 
		JLabel labelMes = new JLabel();
		labelMes.setBounds(75, 220, 200, 20);
		labelMes.setText("M�s: ");
		labelMes.setFont(subTitulo);
		
		JTextField textoDoMes = new JTextField();
		textoDoMes.setBounds(75, 240, 40, 20); 
		
		// Dia 
		JLabel labelDia = new JLabel();
		labelDia.setBounds(130, 220, 200, 20);
		labelDia.setText("Dia: ");
		labelDia.setFont(subTitulo);
		
		JTextField textoDoDia = new JTextField();
		textoDoDia.setBounds(130, 240, 40, 20);
						
		// Titulo Data de Nascimento
		JLabel labelDataNascimento = new JLabel();
		labelDataNascimento.setBounds(20, 160, 200, 100);
		labelDataNascimento.setText("Data de Nascimento");
		labelDataNascimento.setFont(subTitulo);
										
		
		// Titulo Sexo
		JLabel labelSexo = new JLabel();
		labelSexo.setBounds(300, 40, 200, 100);
		labelSexo.setText("Sexo");
		labelSexo.setFont(subTitulo);
		
		// Radio do G�nero Feminino
		JRadioButton rdFeminino = new JRadioButton();
		rdFeminino.setText("Feminino");
		
		// Radio do G�nero Feminino
		JRadioButton rdMasculino = new JRadioButton();
		rdMasculino.setText("Masculino");
		
		// Bot�o Radio 
		ButtonGroup rdGroup = new ButtonGroup();
		rdGroup.add(rdFeminino);
		rdFeminino.setBounds(390, 100, 100, 30);
		
		rdGroup.add(rdMasculino);
		rdMasculino.setBounds(290, 100, 100, 30);

		// Combo do Nivel de Atividade
		String[] niveisAtividadeFisica = {
				"Nenhuma atividade",
				"Atividade Moderada",
				"Atividade Leve",
				"Atividade Intensa"};
		
		JLabel labelNivelAtividade = new JLabel();
		labelNivelAtividade.setText("N�vel de Atividade");
		labelNivelAtividade.setBounds(290, 170, 220, 20);
		labelNivelAtividade.setFont(subTitulo);
		
		JComboBox<String> comboNiveisAtividade = new JComboBox<String>(niveisAtividadeFisica);
		comboNiveisAtividade.setBounds(290, 200, 200, 30);
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(190, 460, 95, 40);
		buttonCalcular.setForeground(white);
		buttonCalcular.setBackground(laranja);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(290, 460, 95, 40);
		buttonLimpar.setForeground(white);
		buttonLimpar.setBackground(vinho);
		
		// Resultados
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultados");
		labelResultado.setFont(tituloResultado);
		labelResultado.setBounds(220, 270, 200, 30);
		
		JLabel labelTituloNome = new JLabel();
		labelTituloNome.setText("Nome: ");
		labelTituloNome.setFont(subTitulo);
		labelTituloNome.setBounds(20, 300, 200, 30);
		
		JLabel labelResultadoNome = new JLabel();
		labelResultadoNome.setText(null);
		labelResultadoNome.setFont(subTitulo);
		labelResultadoNome.setBounds(20, 300, 200, 30);
		
		JLabel labelTituloIdade = new JLabel();
		labelTituloIdade.setText("Idade");
		labelTituloIdade.setFont(subTitulo);
		labelTituloIdade.setBounds(20, 330, 200, 30);
		
		JLabel labelResultadoIdade = new JLabel();
		labelResultadoIdade.setText(null);
		labelResultadoIdade.setFont(subTitulo);
		labelResultadoIdade.setBounds(20, 330, 200, 30);
	
		JLabel labelTituloNcd = new JLabel();
		labelTituloNcd.setText("Ncd: ");
		labelTituloNcd.setFont(subTitulo);
		labelTituloNcd.setBounds(20, 390, 200, 30);
		
		JLabel labelResultadoNcd = new JLabel();
		labelResultadoNcd.setText(null);
		labelResultadoNcd.setFont(subTitulo);
		labelResultadoNcd.setBounds(20, 390, 200, 30);
		
		JLabel labelTituloImc = new JLabel();
		labelTituloImc.setText("Imc: ");
		labelTituloImc.setFont(subTitulo);
		labelTituloImc.setBounds(20, 360, 200, 30);
		
		JLabel labelResultadoImc = new JLabel();
		labelResultadoImc.setText(null);
		labelResultadoImc.setFont(subTitulo);
		labelResultadoImc.setBounds(20, 360, 200, 30);
		
		JLabel labelTituloStatusImc = new JLabel();
		labelTituloStatusImc.setText("Status Imc: ");
		labelTituloStatusImc.setFont(subTitulo);
		labelTituloStatusImc.setBounds(20, 420, 200, 30);
		
		JLabel labelResultadoImcStatus = new JLabel();
		labelResultadoImcStatus.setText(null);
		labelResultadoImcStatus.setFont(subTitulo);
		labelResultadoImcStatus.setBounds(20, 420, 400, 30);
		
		
		//Colocar o labelAltura dentro de painel de conteudo -> contentPane
		tela.setVisible(true);

		tela.getContentPane().add(labelTitulo);
		tela.getContentPane().add(labelNome);
		tela.getContentPane().add(textoDoNome);
		tela.getContentPane().add(labelAltura);
		tela.getContentPane().add(textoDaAltura);
		tela.getContentPane().add(labelPeso);
		tela.getContentPane().add(textoDoPeso);
		tela.getContentPane().add(labelDataNascimento);
		tela.getContentPane().add(labelAno);
		tela.getContentPane().add(textoDoAno);
		tela.getContentPane().add(labelMes);
		tela.getContentPane().add(textoDoMes);
		tela.getContentPane().add(labelDia);
		tela.getContentPane().add(textoDoDia);
		tela.getContentPane().add(labelSexo);
		tela.getContentPane().add(rdFeminino);
		tela.getContentPane().add(rdMasculino);
		tela.getContentPane().add(labelNivelAtividade);
		tela.getContentPane().add(comboNiveisAtividade);
		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(buttonLimpar);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelResultadoNome);
		tela.getContentPane().add(labelResultadoIdade);
		tela.getContentPane().add(labelResultadoNcd);
		tela.getContentPane().add(labelResultadoImc);
		tela.getContentPane().add(labelResultadoImcStatus);
		tela.getContentPane().add(labelTituloNome);
		tela.getContentPane().add(labelTituloIdade);
		tela.getContentPane().add(labelTituloNcd);
		tela.getContentPane().add(labelTituloImc);
		tela.getContentPane().add(labelTituloStatusImc);
		
		
		// COLOCANDO PARA FUNCIONAR O BOT�O CALCULAR
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(textoDoNome.getText());
				pessoa.setAltura(Double.parseDouble(textoDaAltura.getText()));
				pessoa.setPeso(Double.parseDouble(textoDoPeso.getText()));
				pessoa.setDataDeNascimento(LocalDate.of(Integer.parseInt(textoDoAno.getText()),Integer.parseInt(textoDoMes.getText()), Integer.parseInt(textoDoDia.getText())));
			
				if (rdFeminino.isSelected() ) { 
					String generoSelecionado = "F"; 
					pessoa.setSexo(generoSelecionado);
					}
				else if ( rdMasculino.isSelected() ) { 
					String generoSelecionado = "M"; 
					pessoa.setSexo(generoSelecionado);
				}
				
				pessoa.setNivelAtividade(comboNiveisAtividade.getSelectedItem().toString());
				labelResultadoNome.setText("Nome: " + textoDoNome.getText());
				labelResultadoIdade.setText("Idade: " + pessoa.getIdade());
				labelResultadoNcd.setText("Ncd: " + String.format("%.2f", pessoa.getNcd()));
				labelResultadoImc.setText("Imc: " + String.format("%.2f", pessoa.getImc()));
				labelResultadoImcStatus.setText("Status Imc: " + pessoa.getStatusImc());
				
			}
			
		});
		
		// COLOCANDO PARA FUNCIONAR O BOT�O LIMPAR
		buttonLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textoDoNome.setText("");
				textoDaAltura.setText("");
				textoDoPeso.setText("");
				textoDoAno.setText("");
				textoDoMes.setText("");
				textoDoDia.setText("");
				labelResultadoNome.setText("");
				labelResultadoIdade.setText("");
				labelResultadoNcd.setText("");
				labelResultadoImc.setText("");
				labelResultadoImcStatus.setText("");
				rdGroup.clearSelection();
				comboNiveisAtividade.setSelectedItem("Nenhuma atividade");
				
			}
		});	
	}		
}
	





