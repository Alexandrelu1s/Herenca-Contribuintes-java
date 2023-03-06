package entities;

public class Juridica extends Pessoa {
	private int numFuncionarios;
	
	public Juridica(String nome, Double renda, int numFuncionarios) {
		super(nome, renda);
		this.numFuncionarios = numFuncionarios;
	}

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	
	@Override
	public Double calculoImposto() {
		
		if(numFuncionarios > 10) {
			return 0.14 * getRenda();
		}
		else {
			return 0.16 * getRenda();
		}
	}
	
	@Override
	public String toString() {
		return getNome() + ", " + String.format("%.2f", calculoImposto());
	}
}
