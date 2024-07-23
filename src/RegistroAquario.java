import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Atxy2k.CustomTextField.RestrictedTextField;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class RegistroAquario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox comboBoxPh;
	private JComboBox comboBoxAmonia;
	private JComboBox comboBoxNitrito;
	
	
	//Configuração do banco de dados
	private static final String URL = "jdbc:postgresql://localhost:5432/aquarium_db";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroAquario frame = new RegistroAquario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistroAquario() {
		setBackground(SystemColor.activeCaption);
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistroAquario.class.getResource("/img/clown-fish.png")));
		setTitle("Registo Aquario");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 206, 209));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblph = new JLabel("PH");
		lblph.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblph.setBounds(23, 81, 46, 14);
		contentPane.add(lblph);
		
		JLabel lblAmonia = new JLabel("Amonia");
		lblAmonia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAmonia.setBounds(23, 117, 86, 25);
		contentPane.add(lblAmonia);
		
		JLabel lblNitrito = new JLabel("Nitrito");
		lblNitrito.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNitrito.setBounds(23, 159, 86, 25);
		contentPane.add(lblNitrito);
		
		JLabel lblInsiraOsDados = new JLabel("Insira os dados abaixo:");
		lblInsiraOsDados.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblInsiraOsDados.setBounds(103, 24, 224, 25);
		contentPane.add(lblInsiraOsDados);
		
		
		
		 comboBoxPh = new JComboBox();
		comboBoxPh.setModel(new DefaultComboBoxModel(new String[] {"", "6.0", "6.2", "6.4", "6.6", "6.8", "7.0", "7.2", "7.4", "7.6", "7.8"}));
		comboBoxPh.setBounds(57, 81, 75, 22);
		contentPane.add(comboBoxPh);
		
		 comboBoxAmonia = new JComboBox();
		comboBoxAmonia.setModel(new DefaultComboBoxModel(new String[] {"", "0", "0.25", "0.50", "1.00", "2.00", "3.50", "6.50"}));
		comboBoxAmonia.setBounds(103, 122, 75, 22);
		contentPane.add(comboBoxAmonia);
		
		 comboBoxNitrito = new JComboBox();
		comboBoxNitrito.setModel(new DefaultComboBoxModel(new String[] {"", "0.0", "0.25", "0.5", "1.0", "1.75", "2.8"}));
		comboBoxNitrito.setBounds(103, 164, 75, 22);
		contentPane.add(comboBoxNitrito);
		
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				
				if("".equals(comboBoxPh.getSelectedItem()) || "".equals(comboBoxAmonia.getSelectedItem()) || "".equals(comboBoxNitrito.getSelectedItem())) {
					
					JOptionPane.showMessageDialog(null, "Preencha os campos vazios!");

				}
				
				
					
					
			}	
				
		});
	
		
		btnNewButton.setBackground(new Color(255, 255, 240));
		btnNewButton.setBounds(103, 208, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
