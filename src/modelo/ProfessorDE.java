package modelo;

public class ProfessorDE extends Professor {

	private float salarioBase;
	
	public ProfessorDE(String matricula, String nome, float salBase) {
		super(matricula, nome);
		this.salarioBase=salBase;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculaSalario() {
		// TODO Auto-generated method stub
		setSalarioFinal(salarioBase * 2);
		return getSalarioFinal();
	}
	
	
	

}
