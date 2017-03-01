package exercicio1;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio1 {
	static ArrayList<Object> exemploAL=new ArrayList<Object>();
	static Scanner scan=new Scanner(System.in);

	private static void Exercicio1_1() {
		for (int i=0; i<exemploAL.size();i++) {
			System.out.println("entrada "+i+": "+exemploAL.get(i));
		}
	}
	
	private static void Exercicio1_2() {
		System.out.println("\nInsira uma entrada na lista:\n");
		exemploAL.add(scan.next());
		System.out.println("\n");
	}
	

	public static void main(String[] args) {
		System.out.println("tamanho inicial " +exemploAL.size() );
		
		exemploAL.add("b");
		exemploAL.add("3");
		exemploAL.add("Carruagens");
		exemploAL.add("8.56");
		exemploAL.add("caixas de armazenamento");
		
		System.out.println("tamanho após primeira inserção: " +exemploAL.size()+"\n" );
		
		Exercicio1_1();
		
		Exercicio1_2();
		
		Exercicio1_1();

	}
}

	