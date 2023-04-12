package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		
		curso1.setTitulo("curso JAVA");
		curso1.setCargaHoraria(8);
		curso1.setDescricao("descrição sobre o curso de JAVA");
		
		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setTitulo("Mentoria JAVA");
		mentoria1.setDescricao("Mentoria do curso JAVA");
		mentoria1.setData(LocalDate.now());
		
		
		
		
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("curso JAVASCRIPT");
		curso2.setCargaHoraria(4);
		curso2.setDescricao("descrição sobre o curso de JAVASCRIPT");
		
		Mentoria mentoria2 = new Mentoria();
		
		mentoria2.setTitulo("Mentoria JAVASCRIPT");
		mentoria2.setDescricao("Mentoria do curso JAVASCRIPT");
		mentoria2.setData(LocalDate.now());
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("JAVA developer");
		bootcamp.setDescricao("Descrição do bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devMatheus = new Dev();
		devMatheus.setNome("Matheus");
		devMatheus.inscreverBootcamp(bootcamp);
		System.out.println("conteudos inscritos" +  devMatheus.getConteudosInscritos());
		devMatheus.progredir();
		System.out.println("conteudos concluídos" +  devMatheus.getConteudosConcluidos());
		
		
		Dev devLucas = new Dev();
		devLucas.setNome("Lucas");
		devLucas.inscreverBootcamp(bootcamp);
		System.out.println("conteudos inscritos" +  devLucas.getConteudosInscritos());
		devLucas.progredir();
		System.out.println("conteudos concluídos" +  devMatheus.getConteudosConcluidos());
	}
}
