public class Professor extends Pessoa {

	private String especialidade;

	private int salario;

	

	public void receberAumento() {

		System.out.println("O salario teve um aumento de 20 %, de R$ " + salario + " para R$ " + (salario*0.20+salario) + " (aumento de R$ " + (salario*0.20) + ")");

		this.salario += salario*0.20;

	}

	

	public String getEspecialidade() {

		return especialidade;

	}

	public void setEspecialidade(String especialidade) {

		this.especialidade = especialidade;

	}

	public int getSalario() {

		return salario;

	}

	public void setSalario(int salario) {

		this.salario = salario;

	}

}