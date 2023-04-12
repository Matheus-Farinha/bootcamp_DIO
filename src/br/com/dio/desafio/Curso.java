package br.com.dio.desafio;

public class Curso extends Conteudo{
	
	private int cargaHoraria;
	
	
	public Curso() {
		
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", cargaHoraria=" + cargaHoraria + ", descricao=" + getDescricao() + "]";
	}

	@Override
	public double calcularXP() {
		return XP_padrao * cargaHoraria;
	}
	
	
	
	
}
