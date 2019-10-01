

public class Tester {



	public static void main(String[] args) {



		Visitante v1 = new Visitante();

		Aluno a1 = new Aluno();

		Bolsista b1 = new Bolsista();

		Professor p1 = new Professor();

		Tecnico t1 = new Tecnico();



		v1.setNome("Visitante");

		v1.setIdade(27);

		v1.setSexo("F");

		

		p1.setNome("Jessica");

		p1.setEspecialidade("Historia");

		p1.setIdade(43);

		p1.setSalario(2000);

		p1.setSexo("F");

		p1.receberAumento();



		t1.setNome("Junior");

		t1.setMatricula(1234567);

		t1.setCurso("Sistemas de Informação");

		t1.setIdade(35);		

		t1.setSexo("M");

		t1.Praticar();

		t1.PagarMensalidade();

		t1.setRegistroProfissional("Mestrado");



		a1.setNome("Joao");

		a1.setMatricula(12345678);

		a1.setCurso("Arquitetura");

		a1.setIdade(23);		

		a1.setSexo("M");

		a1.PagarMensalidade();



		b1.setNome("Larisa");

		b1.setMatricula(14785236);

		b1.setBolsa(400);

		b1.setCurso("Filosofia");

		b1.setIdade(32);

		b1.setSexo("F");

		b1.PagarMensalidade();

	}

}