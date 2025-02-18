package cursoJava.classes;

import java.util.Arrays;
import java.util.Objects;

/* Relacionamento entre Classes � quando uma classe uma classe depende de outra, 
 * utilizando objetos dessa classe.
 */

// Esta classe de Disciplina servir� para todos os objetos e inst�ncias de notas e disciplinas
public class Disciplina {
	/* Cada disciplina ter� 4 notas no ano letivo */
	private double[] nota = new double[4] ;
	private String disciplina;

	
	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public double getMediaNotas() {
		double somaTotal = 0;
		
		for (int i = 0; i < nota.length; i++) {
			somaTotal += nota[i];
		}
		
		return somaTotal / 4;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota);
		result = prime * result + Objects.hash(disciplina);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina) && Arrays.equals(nota, other.nota);
	}

	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
	}

}
