package revisao.exercicios.aula01;
/*
 *Classe de revis�o do m�dulo I
 *
 *autor: Osvaldo Souza
 * 
 * vers�o 1.0
 * 
 * */
public class Revisao01 {

	//m�todo de execu��o de uma classe JAVA.
	public static void main(String[] args) {
		
		final double GRAVIDADE = 9.8;
		
		char simbolo = '%';
		int diaDoMes = 06;
		float peso   = 70.8f;
		double pesoDouble = 70.8;
		boolean estaLegando = true;
		String curso = "L�gica de Programa��o JAVA";
		
		System.out.println("100"+simbolo);
		
		//%d inteiro, %f, %g double e float, %c caractere, %s string
		System.out.printf("Dia do m�s %d",diaDoMes);
	}
}
