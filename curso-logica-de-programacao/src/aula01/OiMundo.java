package aula01;

public class OiMundo {
	
	public static void main(String[] args) {
		
		String nome = "osvaldo"; 
		
		int idade = 35;
		
		float altura = 1.63f;
		
		double peso = 79.2;
		
		char tipoSanguineo = 'A';
		
		boolean fatorRH = true;
		
		nome = "Johny Bravo";
		
		System.out.printf("nome %s\n"
						+ "idade: %d\n"
						+ "altura: %.2f\n"
						+ "peso: %.2f\n"
						+ "tipo sanguíneo: %c\n",nome,idade,altura,peso,tipoSanguineo);
		
		System.out.println("nome: "+nome);
		System.out.println("idade: "+idade);
		
	}

}
