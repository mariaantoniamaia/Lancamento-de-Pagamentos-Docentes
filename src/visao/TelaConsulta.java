package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class TelaConsulta extends JPanel {
	private JLabel labelMatricula;
	private JTextField fieldMatricula;
	private JButton buttonConsultar;
	private JButton buttonLimparT;
	private JTextArea textArea;

	/**
	 * Create the panel.
	 */
	public TelaConsulta() {
		setLayout(new MigLayout("", "[62.00,grow][62.00,grow][62.00,grow][62.00,grow][67.00,grow][67.00,grow][grow][grow][grow]", "[][20px][][grow][][][][][][]"));
		
		JLabel labelTitulo = new JLabel("TELA DE CONSULTA DE PAGAMENTOS");
		labelTitulo.setFont(new Font("Segoe UI", Font.BOLD, 16));
		add(labelTitulo, "cell 0 0 17 1");
		
		labelMatricula = new JLabel("Matr\u00EDcula");
		add(labelMatricula, "flowx,cell 0 2 2 1");
		
		fieldMatricula = new JTextField();
		add(fieldMatricula, "cell 0 2 3 1,growx");
		fieldMatricula.setColumns(10);
		
		textArea = new JTextArea();
		add(textArea, "cell 0 3 5 6,grow");
		
		buttonConsultar = new JButton("Consultar");
		add(buttonConsultar, "cell 0 9,growx");
		
		buttonLimparT = new JButton("Limpar Tela Consulta");
		add(buttonLimparT, "cell 1 9 2 1,growx");

	}

	public JLabel getLabelMatricula() {
		return labelMatricula;
	}

	public void setLabelMatricula(JLabel labelMatricula) {
		this.labelMatricula = labelMatricula;
	}

	public JTextField getFieldMatricula() {
		return fieldMatricula;
	}

	public void setFieldMatricula(JTextField fieldMatricula) {
		this.fieldMatricula = fieldMatricula;
	}

	public JButton getButtonConsultar() {
		return buttonConsultar;
	}

	public void setButtonConsultar(JButton buttonConsultar) {
		this.buttonConsultar = buttonConsultar;
	}

	public JButton getButtonLimparT() {
		return buttonLimparT;
	}

	public void setButtonLimparT(JButton buttonLimparT) {
		this.buttonLimparT = buttonLimparT;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}
	
	public void limparTelaCon()
	{
		fieldMatricula.setText("");
		textArea.setText("");
	}

}
