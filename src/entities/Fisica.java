package entities;

public class Fisica extends Pessoa {
	private Double saude;
	
	public Fisica(String nome, Double renda) {
		super(nome, renda);
	}
	public Fisica(String nome, Double renda, Double saude) {
		super(nome, renda);
		this.saude = saude;
	}
	
	public Double getSaude() {
		return saude;
	}

	public void setSaude(Double saude) {
		this.saude = saude;
	}


	@Override
	public Double calculoImposto() {
		
		if (getRenda() < 20000.0) {
			return  getRenda() * 0.15;
		}
		else {
			if (saude > 0.0) {
				 return getRenda() * 0.25 - (saude * 0.5);
			}
			else {
				return getRenda() * 0.25;
			}
		}
	}
	
	@Override
	public String toString() {
		return getNome() + ", " + String.format("%.2f", calculoImposto());
	}
}
