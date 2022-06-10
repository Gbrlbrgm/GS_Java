package View;

import java.awt.EventQueue;
import Model.*;
import Model.Enums.*;
import Controller.*;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Home {

public JFrame home;
private RegisterController registerController;
private static DBRepositoryController repository;
private JTextField txtNome;
private JTextField txtRua;
private JTextField txtBairro;
private JTextField txtCidade;
private JTextField txtEstado;
private JTextField txtAvaliacao;
private JTextField txtPrecoKWH;
private JLabel lblTipoPlug;

private JCheckBox cbxTipo1 = new JCheckBox("Tipo 1");;
private boolean cbxTipo1IsChecked = false;

private JCheckBox cbxTipo2 = new JCheckBox("Tipo 2");;
private boolean cbxTipo2IsChecked = false;

private JCheckBox cbxCSS2 = new JCheckBox("CSS2");;
private boolean cbxCSS2IsChecked = false;

private JCheckBox cbxCHA = new JCheckBox("CHAdeMO");;
private boolean cbxCHAIsChecked = false;

	public Home(RegisterController registerControllerC, DBRepositoryController repository) throws SQLException {
		registerController = registerControllerC;
		 cbxTipo1.setBounds(107, 153, 69, 23);
		 cbxTipo1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				cbxTipo1IsChecked = !cbxTipo1IsChecked;
			}    
         
         });    
		 cbxTipo2.setBounds(178, 153, 88, 23);
		 
		 cbxTipo2.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					cbxTipo2IsChecked = !cbxTipo2IsChecked;
				}    
	         
	         });    
		 cbxCSS2.setBounds(107, 179, 69, 23);
		 
		 cbxCSS2.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					cbxCSS2IsChecked = !cbxCSS2IsChecked;
				}    
	         
	         });    
		 cbxCHA.setBounds(178, 179, 88, 23);
		 
		 cbxCHA.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					cbxCHAIsChecked = !cbxCHAIsChecked;
				}    
	         
	         });    

		this.repository = repository;
		initialize();
	}

	private void initialize() {
		home = new JFrame();
		home.setBackground(Color.DARK_GRAY);
		home.getContentPane().setBackground(Color.DARK_GRAY);
		home.getContentPane().setLayout(null);
		
		JLabel lbTitle = new JLabel("Cadastrar novo posto");
		lbTitle.setBounds(20, 11, 184, 21);
		lbTitle.setFont(new Font("Tahoma", Font.BOLD, 17));
		lbTitle.setForeground(Color.LIGHT_GRAY);
		home.getContentPane().add(lbTitle);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(61, 73, 36, 17);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setForeground(Color.LIGHT_GRAY);
		home.getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(107, 73, 159, 20);
		home.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblRua = new JLabel("Rua");
		lblRua.setBounds(316, 73, 24, 17);
		lblRua.setForeground(Color.LIGHT_GRAY);
		lblRua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		home.getContentPane().add(lblRua);
		
		txtRua = new JTextField();
		txtRua.setBounds(346, 73, 225, 20);
		txtRua.setColumns(10);
		home.getContentPane().add(txtRua);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(305, 98, 35, 17);
		lblBairro.setForeground(Color.LIGHT_GRAY);
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		home.getContentPane().add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(346, 98, 225, 20);
		txtBairro.setColumns(10);
		home.getContentPane().add(txtBairro);
		
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(299, 126, 41, 17);
		lblCidade.setForeground(Color.LIGHT_GRAY);
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		home.getContentPane().add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(346, 123, 225, 20);
		txtBairro.setColumns(10);
		home.getContentPane().add(txtCidade);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(298, 154, 42, 17);
		lblEstado.setForeground(Color.LIGHT_GRAY);
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		home.getContentPane().add(lblEstado);
		
		txtEstado = new JTextField();
		txtEstado.setBounds(346, 154, 225, 20);
		txtCidade.setColumns(10);
		home.getContentPane().add(txtEstado);
		
		JLabel lblAvaliacao = new JLabel("Avaliação");
		lblAvaliacao.setBounds(41, 101, 56, 17);
		lblAvaliacao.setForeground(Color.LIGHT_GRAY);
		lblAvaliacao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		home.getContentPane().add(lblAvaliacao);
		
		txtAvaliacao = new JTextField();
		txtAvaliacao.setBounds(107, 98, 159, 20);
		txtAvaliacao.setColumns(10);
		home.getContentPane().add(txtAvaliacao);
		
		JLabel lblPrecoKWH = new JLabel("Preço do kWh");
		lblPrecoKWH.setBounds(10, 126, 88, 17);
		lblPrecoKWH.setForeground(Color.LIGHT_GRAY);
		lblPrecoKWH.setFont(new Font("Tahoma", Font.PLAIN, 14));
		home.getContentPane().add(lblPrecoKWH);
		
		txtPrecoKWH = new JTextField();
		txtPrecoKWH.setBounds(108, 126, 158, 20);
		home.getContentPane().add(txtPrecoKWH);
		txtPrecoKWH.setColumns(10);
		
		lblTipoPlug = new JLabel("Tipos de Plug");
		lblTipoPlug.setBounds(20, 154, 81, 17);
		lblTipoPlug.setForeground(Color.LIGHT_GRAY);
		lblTipoPlug.setFont(new Font("Tahoma", Font.PLAIN, 14));
		home.getContentPane().add(lblTipoPlug);
		home.getContentPane().add(cbxTipo1);
		home.getContentPane().add(cbxTipo2);
		home.getContentPane().add(cbxCSS2);
		home.getContentPane().add(cbxCHA);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(94, 234, 110, 23);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				ArrayList<Plugs> plugs = new ArrayList<Plugs>();
				
				if (cbxTipo1IsChecked) {
					plugs.add(Plugs.tipo1);
				}
				if (cbxTipo2IsChecked) {
					plugs.add(Plugs.tipo2);
				}
				if (cbxCSS2IsChecked) {
					plugs.add(Plugs.css2);
				}
				if (cbxCHAIsChecked) {
					plugs.add(Plugs.chademo);
				}
				
				Endereco enderecoCadastro = new Endereco(txtRua.getText(), 
												 txtBairro.getText(), 
												 txtCidade.getText(), 
												 txtEstado.getText());
				
				Posto novoPosto = new Posto(txtNome.getText(), enderecoCadastro, txtAvaliacao.getText(), plugs, txtPrecoKWH.getText());
				
				try {
					repository.inserirPosto(novoPosto);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnCadastrar.setBackground(new Color(104, 104, 202));
		home.getContentPane().add(btnCadastrar);
		
		JButton btnTabela = new JButton("Tabela");
		btnTabela.setBounds(233, 234, 107, 23);
		btnTabela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Table window = new Table(repository);
							window.frmTabela.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		btnTabela.setBackground(new Color(104, 104, 202));
		home.getContentPane().add(btnTabela);
		
		JButton btnMapa = new JButton("Mapa");
		btnMapa.setBounds(383, 234, 88, 23);
		btnMapa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								Map window = new Map(repository);
								window.frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				
			}
		});
		btnMapa.setBackground(new Color(104, 104, 202));
		home.getContentPane().add(btnMapa);
		
		
		home.setForeground(Color.WHITE);
		home.setTitle("Gerenciador postos de abastecimento");
		home.setBounds(100, 100, 599, 505);
		home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}