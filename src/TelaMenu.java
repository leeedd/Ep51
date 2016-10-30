import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TelaMenu {

	
	static JFrame menu;
	static JPanel tela;
	static JLabel lbcidade;
	static JTextField textTexto;
	static JButton btpesquisa;
	static JTable jttabela;
	static DefaultTableModel dftabela;
	static JScrollPane barraRolagem;
	
	
	static String [] tabela = new String[]{};
	
	
	public static void main(String[] args){
		
		TelaPrincipal();
		
	}
	
	public static void TelaPrincipal(){
		
		
		menu = new JFrame("Menu");
		menu.setLayout(null);
		menu.setSize(800, 600);
		menu.setLocationRelativeTo(null);
		menu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		menu.setVisible(true);
		
		tela= new JPanel();
		tela.setSize(800, 600);
		tela.setLayout(null);
		tela.setBackground(Color.white);
		menu.setResizable(false);
		tela.setVisible(true);
		menu.add(tela);
		
		lbcidade = new JLabel("Cidade:");
		lbcidade.setSize(200, 300);
		lbcidade.setLocation(50, -30);
		lbcidade.setVisible(true);
		tela.add(lbcidade);
		
		textTexto = new JTextField ();
		textTexto.setSize(200,20);
		textTexto.setLocation(100, 106);
		textTexto.setVisible(true);
		tela.add(textTexto);
		
		btpesquisa = new JButton("Pesquisar");
		btpesquisa.setSize(100, 20);
		btpesquisa.setLocation(500, 106);
		btpesquisa.setVisible(true);
		tela.add(btpesquisa);		
		
		dftabela = new DefaultTableModel(tabela, 0);
		
		jttabela = new JTable();
		jttabela.setBounds(10, 10, 575, 300);
		jttabela.setModel(dftabela);
		tela.add(jttabela);
		tela.setVisible(true);
		
		barraRolagem = new JScrollPane(jttabela);
		barraRolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		barraRolagem.setBounds(50, 200, 600, 300);
		barraRolagem.setViewportView(jttabela);
		menu.add(barraRolagem);
		
		
	}
	
	
	
}
