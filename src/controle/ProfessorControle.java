package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import dao.ProfessorDAO;
import modelo.Professor;
import modelo.ProfessorDE;
import modelo.ProfessorHorista;
import visao.JanelaPrincipal;

public class ProfessorControle implements ActionListener, MouseListener {

	private JanelaPrincipal jan;
	private Professor prof;
	private ProfessorDAO pdao;
	

	public ProfessorControle(JanelaPrincipal j, Professor p) {
		this.jan = j;
		this.prof = p;
		this.jan.getTelaLanc().getButtonCadastrar().addActionListener(this);
		this.jan.getTelaCons().getButtonConsultar().addActionListener(this);
		this.jan.getTelaLanc().getRadioHorista().addMouseListener(this);
		this.jan.getTelaLanc().getRadioDE().addMouseListener(this);
		this.jan.getTelaLanc().getButtonLimparT().addActionListener(this);
		this.jan.getTelaCons().getButtonLimparT().addActionListener(this);
		pdao= new ProfessorDAO();

	}
	
	public void cadastraProfessorHorista()
	{
		this.jan.getTelaLanc().getFieldSalBase().setEnabled(false);
		this.jan.getTelaLanc().getFieldValHora().setEnabled(true);
		this.jan.getTelaLanc().getFieldHorasTrab().setEnabled(true);
		String maux = this.jan.getTelaLanc().getFieldMatricula().getText();
		String naux = this.jan.getTelaLanc().getFieldNome().getText();
		int quantHaux = Integer.parseInt(this.jan.getTelaLanc().getFieldHorasTrab().getText());
		float valHaux = Float.parseFloat(this.jan.getTelaLanc().getFieldValHora().getText());
		prof = new ProfessorHorista(maux, naux, quantHaux, valHaux);
		prof.calculaSalario();
		pdao.cadastraProfessor(prof);
		this.jan.getTelaLanc().limparTelaLancamento();
	}
	
	public void cadastraProfessorDE()
	{
		this.jan.getTelaLanc().getFieldSalBase().setEnabled(true);
		this.jan.getTelaLanc().getFieldValHora().setEnabled(false);
		this.jan.getTelaLanc().getFieldHorasTrab().setEnabled(false);
		String maux = this.jan.getTelaLanc().getFieldMatricula().getText();
		String naux = this.jan.getTelaLanc().getFieldNome().getText();
		float saux = Float.parseFloat(this.jan.getTelaLanc().getFieldSalBase().getText());
		prof = new ProfessorDE(maux, naux, saux);
		prof.calculaSalario();
		pdao.cadastraProfessor(prof);
		this.jan.getTelaLanc().limparTelaLancamento();
	}
	
	public void buscaProfessor()
	{
		boolean flag=false;
		String maux = this.jan.getTelaCons().getFieldMatricula().getText();
		prof= new Professor();
		prof.setMatricula(maux);
		flag=pdao.consultaMatricula(prof);
		
		if(flag)
			jan.getTelaCons().getTextArea().setText(prof.imprimeDados());
		else
			System.out.println("Matrícula não localizada em arquivo");
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Cadastrar")) {
			
			try {
				
				if (this.jan.getTelaLanc().getGrupo().getSelection().getActionCommand().equals("H"))	
					cadastraProfessorHorista();
			
				else if (this.jan.getTelaLanc().getGrupo().getSelection().getActionCommand().equals("D")) 
					cadastraProfessorDE();

			
			} catch (NullPointerException e2) {
				// TODO: handle exception
				System.out.println("ATENÇÃO - campo(s) em branco");
			}	
			catch (NumberFormatException e2) {
				// TODO: handle exception
				System.out.println("ATENÇÃO - campo(s) em branco ou em formato inválido");
			}	
				
		}

		else if (e.getActionCommand().equals("Limpar Tela Cadastro")) {
			this.jan.getTelaLanc().limparTelaLancamento();
		}

		else if (e.getActionCommand().equals("Consultar")) {
			buscaProfessor();
		}
		
		else if (e.getActionCommand().equals("Limpar Tela Consulta")) {
			this.jan.getTelaCons().limparTelaCon();
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == this.jan.getTelaLanc().getRadioHorista()) {
			
			this.jan.getTelaLanc().getFieldSalBase().setEnabled(false);
			this.jan.getTelaLanc().getFieldValHora().setEnabled(true);
			this.jan.getTelaLanc().getFieldHorasTrab().setEnabled(true);
		} else if (e.getSource() == this.jan.getTelaLanc().getRadioDE()) {
			this.jan.getTelaLanc().getFieldSalBase().setEnabled(true);
			this.jan.getTelaLanc().getFieldValHora().setEnabled(false);
			this.jan.getTelaLanc().getFieldHorasTrab().setEnabled(false);
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
