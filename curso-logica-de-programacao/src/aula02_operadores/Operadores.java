package aula02_operadores;

/*
 * Classe explicativa dos operadores na Linguagem Java
 * 
 * Data: 30/07
 * 
 * autor: Osvaldo Souza
 * 
 * versão: 1.0
 * 
 * */


public class Operadores {

	public static void main(String[] args) {
		//operadores aritméticos. + - * / %
		//System.out.println(Math.sqrt(25));
		//System.out.println(Math.cbrt(27));
		//System.out.println(Math.pow(2, 10));
		//System.out.println((double)(10+4+9)/3);
		//System.out.println(28%5);
		//System.out.println(120 - (120*(30/100.0)));
		
		//operadores relacionais >  < >= <= == != =
		//double nota = 0.0;
		//System.out.println(nota < 7.0);//reprova
		//System.out.println(nota >= 7.0);//aprovado
		//System.out.println(nota == 10.0);
		//System.out.println(nota != 10.0);
		
		//Operadores lógicos & && | || 
		//System.out.println(false&&true);
		//System.out.println(true||false);
		
		int numero = 5;
		int resultado = 0;
		System.out.println(numero);
		System.out.println(resultado = 60*++numero);
		
		System.out.println(numero);
		
		
		//Operador ternário
		boolean vaiChover = true;
		
		String acao = vaiChover ? "então vai dar stream em casa" : "então vai dar praia";
		
		System.out.println(acao);
	}

}
