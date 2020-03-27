package entities;

public class Company extends TaxPayer {

	private int numFuncionarios;
	
	public Company() {
		super();
	}
	
	public Company(String nome, Double rendaAnual, int numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}
	
	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double valorImposto() {
		Double renda = getRendaAnual();
		if (numFuncionarios <= 10) {
			return renda * 0.16;
		}
		else {
			return renda * 0.14;
		}
	}

}
