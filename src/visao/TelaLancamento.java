package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class TelaLancamento extends JPanel {
	private JTextField fieldMatricula;
	private JTextField fieldNome;
	private JTextField fieldSalBase;
	private JTextField fieldHorasTrab;
	private JTextField fieldValHora;
	private JButton buttonLimparT;
	private JButton buttonCadastrar;
	private ButtonGroup grupo;
	private JRadioButton radioDE;
	private JRadioButton radioHorista;

	/**
	 * Create the panel.
	 */
	public TelaLancamento() {
		setLayout(new MigLayout("", "[82.00,grow][50.00,grow][71.00,grow][87.00,grow][87.00,grow][grow][grow][grow][grow][grow][grow][grow]", "[][20px][][][][][][][40px][]"));
		
		JLabel labelTitulo = new JLabel("TELA DE LAN\u00C7AMENTO DE PAGAMENTO");
		labelTitulo.setFont(new Font("Segoe UI", Font.BOLD, 16));
		add(labelTitulo, "cell 0 0 9 1");
		
		JLabel labelMatricula = new JLabel("Matr\u00EDcula");
		add(labelMatricula, "flowx,cell 0 2 2 1");
		
		fieldMatricula = new JTextField();
		add(fieldMatricula, "cell 0 2 2 1,growx");
		fieldMatricula.setColumns(10);
		
		JLabel labelNome = new JLabel("Nome");
		add(labelNome, "flowx,cell 2 2 10 1");
		
		fieldNome = new JTextField();
		add(fieldNome, "cell 2 2 10 1,growx");
		fieldNome.setColumns(10);
		
		JLabel labelTipoProfessor = new JLabel("Tipo de Professor");
		add(labelTipoProfessor, "flowx,cell 0 3 9 1");
		
		grupo= new ButtonGroup();
		
		radioDE = new JRadioButton("DE");
		radioDE.setActionCommand("D");
		add(radioDE, "cell 0 3 9 1");
		
		radioHorista = new JRadioButton("Horista");
		radioHorista.setActionCommand("H");
		add(radioHorista, "cell 0 3 9 1");
		
		grupo.add(radioHorista);
		grupo.add(radioDE);
		
		JLabel labelSalB = new JLabel("Sal\u00E1rio Base");
		add(labelSalB, "flowx,cell 1 5 2 1");
		
		JLabel labelHorasTrab = new JLabel("Horas Trabalhadas");
		add(labelHorasTrab, "flowx,cell 1 6 2 1");
		
		JLabel labelValH = new JLabel("Valor Hora");
		add(labelValH, "flowx,cell 1 7 2 1");
		
		buttonCadastrar = new JButton("Cadastrar");
		add(buttonCadastrar, "cell 0 9,growx");
		
		fieldSalBase = new JTextField();
		add(fieldSalBase, "cell 1 5 4 1,growx");
		fieldSalBase.setColumns(10);
		
		fieldHorasTrab = new JTextField();
		add(fieldHorasTrab, "cell 1 6 4 1,growx");
		fieldHorasTrab.setColumns(10);
		
		fieldValHora = new JTextField();
		add(fieldValHora, "cell 1 7 4 1,growx");
		fieldValHora.setColumns(10);
		buttonLimparT = new JButton("Limpar Tela Cadastro");
		add(buttonLimparT, "cell 1 9 2 1,growx");

	}

	public JTextField getFieldMatricula() {
		return fieldMatricula;
	}

	public void setFieldMatricula(JTextField fieldMatricula) {
		this.fieldMatricula = fieldMatricula;
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JTextField getFieldSalBase() {
		return fieldSalBase;
	}

	public void setFieldSalBase(JTextField fieldSalBase) {
		this.fieldSalBase = fieldSalBase;
	}

	public JTextField getFieldHorasTrab() {
		return fieldHorasTrab;
	}

	public void setFieldHorasTrab(JTextField fieldHorasTrab) {
		this.fieldHorasTrab = fieldHorasTrab;
	}

	public JTextField getFieldValHora() {
		return fieldValHora;
	}

	public void setFieldValHora(JTextField fieldValHora) {
		this.fieldValHora = fieldValHora;
	}

	public JButton getButtonLimparT() {
		return buttonLimparT;
	}

	public void setButtonLimparT(JButton buttonLimparT) {
		this.buttonLimparT = buttonLimparT;
	}

	public JButton getButtonCadastrar() {
		return buttonCadastrar;
	}

	public void setButtonCadastrar(JButton buttonCadastrar) {
		this.buttonCadastrar = buttonCadastrar;
	}

	public ButtonGroup getGrupo() {
		return grupo;
	}

	public void setGrupo(ButtonGroup grupo) {
		this.grupo = grupo;
	}

	public JRadioButton getRadioDE() {
		return radioDE;
	}

	public void setRadioDE(JRadioButton radioDE) {
		this.radioDE = radioDE;
	}

	public JRadioButton getRadioHorista() {
		return radioHorista;
	}

	public void setRadioHorista(JRadioButton radioHorista) {
		this.radioHorista = radioHorista;
	}
	
	public void limparTelaLancamento()
	{
		fieldMatricula.setText("");
		fieldHorasTrab.setText("");
		fieldNome.setText("");
		fieldSalBase.setText("");
		fieldValHora.setText("");
		grupo.clearSelection();
	}
	
	
}
