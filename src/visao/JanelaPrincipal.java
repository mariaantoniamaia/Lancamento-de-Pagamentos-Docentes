package visao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private CardLayout card;
	private TelaLancamento tla;
	private TelaConsulta tco;
	private JPanel tva;

	
	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setTitle("Lan\u00E7amento de Pagamentos Docentes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuPrincipal = new JMenu("Principal");
		menuBar.add(menuPrincipal);
		
		JMenuItem itemLancamento = new JMenuItem("Tela Lan\u00E7amento");
		itemLancamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				card.show(contentPane,"tlanc");
			}
		});
		menuPrincipal.add(itemLancamento);
		
		JMenuItem itemConsulta = new JMenuItem("Tela Consulta");
		itemConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				card.show(contentPane,"tconsulta");
			}
		});
		menuPrincipal.add(itemConsulta);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		card= new CardLayout();
		contentPane.setLayout(card);
		
		tva= new JPanel();
		tco= new TelaConsulta();
		tla= new TelaLancamento();
		
		contentPane.add(tva,"telaI");
		contentPane.add(tco,"tconsulta");
		contentPane.add(tla,"tlanc");
	}

	public TelaLancamento getTelaLanc() {
		return tla;
	}

	public void setTelaLanc(TelaLancamento telaLanc) {
		this.tla = telaLanc;
	}

	public TelaConsulta getTelaCons() {
		return tco;
	}

	public void setTelaCons(TelaConsulta telaCons) {
		this.tco = telaCons;
	}
	
	
}
