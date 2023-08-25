package controle;

import modelo.Professor;
import visao.JanelaPrincipal;

public class App {
	
	public static void main(String[] args) {
		
		JanelaPrincipal jan= new JanelaPrincipal();
		jan.setVisible(true);
		Professor p= new Professor();
		ProfessorControle pcon= new ProfessorControle(jan, p);
	}

}
