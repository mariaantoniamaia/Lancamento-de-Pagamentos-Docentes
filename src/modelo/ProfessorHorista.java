package modelo;

public class ProfessorHorista extends Professor {
	
	private int quantHoras;
	private float valorHora;
	
	public ProfessorHorista(String matricula, String nome, int quantH, float valH) {
		super(matricula, nome);
		this.quantHoras=quantH;
		this.valorHora=valH;
		// TODO Auto-generated constructor stub
	}

	public int getQuantHoras() {
		return quantHoras;
	}

	public void setQuantHoras(int quantHoras) {
		this.quantHoras = quantHoras;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public float calculaSalario() {
		// TODO Auto-generated method stub
		setSalarioFinal(quantHoras * valorHora);
		return getSalarioFinal();
	}
	
}
