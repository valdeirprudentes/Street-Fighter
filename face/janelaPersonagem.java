package face;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.EventQueue;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


import controle.ControleJanelaPersonagem;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.ImageIcon;

public class janelaPersonagem extends JFrame {
	private JPanel contentPane;
	private JTextField textSoco;
	private JTextField textChute;
	private JTextField textEspecial;
	private JTextField textDefesa;

	private ControleJanelaPersonagem cjp = new ControleJanelaPersonagem();
	private JTextField textNome;
	private JTextField textForca;
	private JTextField textVida;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
					janelaPersonagem frame = new janelaPersonagem();
						frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
		}
	public janelaPersonagem() {
		setTitle("Personagens");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 251, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblCadastroDePersonagens = new JLabel("CADASTRO DE PERSONAGENS");
		lblCadastroDePersonagens.setForeground(Color.BLACK);

		lblCadastroDePersonagens.setFont(new Font("Tahoma", Font.BOLD, 11));

		lblCadastroDePersonagens.setBounds(39, 11, 186, 14);
		contentPane.add(lblCadastroDePersonagens);
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNome.setBounds(10, 52, 77, 14);
		contentPane.add(lblNome);
		JLabel lblSoco = new JLabel("SOCO:");
		lblSoco.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSoco.setBounds(10, 77, 77, 14);
		contentPane.add(lblSoco);
		JLabel lblChute = new JLabel("CHUTE:");
		lblChute.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChute.setBounds(10, 103, 56, 14);
		contentPane.add(lblChute);
		JLabel lblEspecial = new JLabel("ESPECIAL:");
		lblEspecial.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEspecial.setBounds(10, 128, 93, 14);
		contentPane.add(lblEspecial);
		JLabel lblDefesa = new JLabel("DEFESA:");
		lblDefesa.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDefesa.setBounds(10, 156, 58, 14);
		contentPane.add(lblDefesa);
		JLabel lblForça = new JLabel("FOR\u00C7A:");
		lblForça.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblForça.setBounds(10, 183, 46, 14);
		contentPane.add(lblForça);
		JLabel lblVida = new JLabel("VIDA:");
		lblVida.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblVida.setBounds(10, 209, 77, 14);
		contentPane.add(lblVida);
		textSoco = new JTextField();
		textSoco.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
	}
});
		textNome = new JTextField();
		textNome.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
	}
});
		textNome.setBounds(97, 49, 128, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		textSoco.setBounds(97, 74, 47, 20);
		contentPane.add(textSoco);
		textSoco.setColumns(10);
		textChute = new JTextField();
		textChute.setBounds(97, 99, 47, 20);
		contentPane.add(textChute);
		textChute.setColumns(10);
		textEspecial = new JTextField();
		textEspecial.setBounds(97, 125, 47, 20);
		contentPane.add(textEspecial);
		textEspecial.setColumns(10);
		textDefesa = new JTextField();
		textDefesa.setBounds(97, 153, 47, 20);
		contentPane.add(textDefesa);
		textDefesa.setColumns(10);
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCadastrar.addActionListener(new ActionListener() {
			
			private AbstractButton textForca2;

			public void actionPerformed(ActionEvent e) {
				String nome = textSoco.getText();
				int soco =
						Integer.parseInt(textChute.getText());
				int chute =
						Integer.parseInt(textEspecial.getText());
				int especial =
						Integer.parseInt(textEspecial.getText());
				int defesa =
						Integer.parseInt(textDefesa.getText());
				int forca =
						Integer.parseInt(textForca.getText());
				int vida =
						Integer.parseInt(textDefesa.getText());

				cjp.cadastrarPersonagem(nome, soco, chute, especial, defesa, forca, vida);
				JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso!");

				textSoco.setText("");
				textChute.setText("");
				textEspecial.setText("");
				textEspecial.setText("");
				textDefesa.setText("");
				textForca.setText("");
				textDefesa.setText("");
				}
			});
		textForca = new JTextField();
		textForca.setBounds(97, 180, 47, 20);
		contentPane.add(textForca);
		textForca.setColumns(10);
		textVida = new JTextField();
		textVida.setBounds(97, 206, 47, 20);
		contentPane.add(textVida);
		textVida.setColumns(10);
		btnCadastrar.setBounds(67, 237, 101, 23);
		contentPane.add(btnCadastrar);
		}
}