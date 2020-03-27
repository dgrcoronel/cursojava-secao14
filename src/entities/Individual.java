package entities;

public class Individual extends TaxPayer {

	private Double gastosSaude;
	
	public Individual() {
		super();
	}

	public Individual(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double valorImposto() {
		Double renda = getRendaAnual();
		Double abatimento = gastosSaude * 0.50;
		if (renda < 20000.00) {
			return renda * 0.15 - abatimento;
		}
		else {
			return renda * 0.25 - abatimento;
		}
	}

}
