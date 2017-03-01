package exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static ArrayList<Aluno> Alunos;
	static Scanner scan=new Scanner(System.in);
	
	private static void Exercicio2_2() {
		for (int i=0;i<5;i++) {
		System.out.println("\nInsira um aluno:\n");
		String aluno=scan.nextLine();
		System.out.println("\n");
		
		System.out.println("\nInsira a nota do aluno:\n");
		int nota=scan.nextInt();
		System.out.println("\n");
		
		System.out.println("\nInsira o contacto do aluno:\n");
		int contacto=scan.nextInt();
		System.out.println("\n");
		
		Alunos.add(aluno);
		Alunos.add(nota);
		Alunos.add(contacto);
		}
	}
	
	private static void Exercicio2_3() {
	}
	
	public static void main(String[] args) {
		Alunos=new ArrayList<>();
		
		Exercicio2_2();
		Exercicio2_3();

	}

}
