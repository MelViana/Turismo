package br.ifsul.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


import br.ifsul.dto.Cidade;

import br.ifsul.dto.PontoTuristico;
import br.ifsul.repository.CidadeRepository;

public class UICidade extends JFrame {
	
	private static final long serialVersionUID = -5782972015790244479L;

	private JPanel contentPane;
	private JLabel tituloGeralTopo;
	private JTextField txtNome;
	private JTextField txtEstado;
	private JTextField txtPais;
	private JTextField txtDescricao;
	
	private CidadeRepository repo;
	
	/**
	 * Create the frame.
	 * @param repo 
	 */
	public UICidade(CidadeRepository repo) {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 490, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tituloGeralTopo = new JLabel("CADASTRAR NOVA CIDADE");
		tituloGeralTopo.setBounds(151, 11, 246, 33);
		contentPane.add(tituloGeralTopo);
		
		txtNome = new JTextField();
		txtNome.setBounds(93, 28, 320, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(37, 31, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtEstado = new JTextField();
		txtEstado.setBounds(93, 28, 320, 20);
		contentPane.add(txtEstado);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Estado");
		lblNewLabel_2.setBounds(37, 31, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtPais = new JTextField();
		txtPais.setBounds(93, 28, 320, 20);
		contentPane.add(txtPais);
		txtPais.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("País");
		lblNewLabel_3.setBounds(37, 31, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(93, 28, 320, 20);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Descrição");
		lblNewLabel_4.setBounds(37, 31, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnCadastrarCidade = new JButton("Cadastrar");
		btnCadastrarCidade.setBounds(261, 281, 151, 20);
		contentPane.add(btnCadastrarCidade);
		
		// Click do botao
		btnCadastrarCidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				Cidade novaCidade = new Cidade();
				
				
				novaCidade.setNome( txtNome.getText() );
				novaCidade.setNome( txtEstado.getText() );
				novaCidade.setNome( txtPais.getText() );
				novaCidade.setNome( txtDescricao.getText() );
			
				repo.save(novaCidade);
				
				JOptionPane.showMessageDialog(null, "Cidade cadastrada!!");
			}
		});
		

		
	}
}

