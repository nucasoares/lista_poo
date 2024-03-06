package org.listaalgoritmos.template;

import java.util.Scanner;

public class RespostaListaExercicio {
	
	/*
	 * Utilize apenas o método main para testar a implementação dos métodos. 
	 * Não se faz necessário implementar dentro do escopo do método.
	 */
	public static void main(String[] args) {
		
		
		 int array[] = { 5,10,33,4,1,27,71,38,19,1,9,9};
		 
		 calcularMediaAritmetica(array);
		 
		
				
	}
	
	/**
	 * Método deve calcular o IMC utilizando peso e altura. Como resultado
	 * o método deve retornar uma variável resultado do tipo float.
	 * @param peso
	 * @param altura
	 * @return resultado
	 */

	public static float calcularImc(float peso, float altura) 
	{
		return (peso/(altura*altura));
	}
	
	/**
	 * Método deve calcular a área do trapézio independente da unidade de medida.
	 * Como resultado, o método deve retornar a área calculada.
	 * @param baseMaior
	 * @param baseMenor
	 * @param altura
	 * @return areaTrapezio
	 */
	public static float calcularAreaTrapezio(float baseMaior, float baseMenor, float altura) 
	{	
		return ((baseMaior + baseMenor)*altura)/2;
	}
	
	/**
	 * O método deve calcular o maior entre dois inteiros, que são fornecidos
	 * como argumento do método. O retorno deve ser o maior valor dado
	 * como entrada, sendo do tipo inteiro.
	 * @param a
	 * @param b
	 * @return maiorValor
	 */
	public static int maiorEntreDoisInteiros(int a, int b) 
	{
		if (a > b) {
			return a;
		}else {
			return b;
		}	
	}
	
	/**
	 * Método verifica se o número apresentado como argumento é ímpar ou par.
	 * caso seja par, o retorno do método deve ser verdadeiro. Caso contrário,
	 * o valor retornado deve ser falso.
	 * @param numero
	 * @return condicao
	 */
	public static boolean verificarParImpar(int numero) 
	{
		if (numero%2 == 0) {
			return true;
		}else {
			return false;		
		}
	}
	
	/**
	 * Método calcula a média aritmetica dos elementos float a partir de um array. 
	 * O retorno deve ser o resultado do cálculo da média.
	 * @param notas
	 * @return media
	 */

	public static float calcularMediaNotas(float[] notas) {
		float resultado = 0;
		int quantidade = notas.length;
		
		for (int i=0; i<quantidade; i++) {
			resultado=resultado+notas[i];
		}
		return resultado/quantidade;
	}
	
	/**
	 * Método imprime array de inteiros no sentido inverso, separando os elementos por vírgula.
	 * O último elemento impresso não deve preceder vírgula. Use o System.out.print() para imprimir os valores.
	 * Os elementos devem ser impresso numa única linha.
	 * @param array
	 */
	public static void imprimirArrayInverso(int[] array)
	{	
		for (int i=array.length - 1; i>=0; i--) {
			if (i==0) {
				System.out.print(array[i]);
			}else {
				System.out.print(array[i]+",");
			}
		}
	}
	
	/**
	 * Método deve imprimir os elementos primos de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosPrimos(int[] array) 
	{
		int primo = 0;
		for (int i=0; i<array.length; i++) {
			for(int j=1; j<=array[i]; j++ ) {
				if(array[i]%j==0) {
					primo++;
				}			
			} if (primo == 2) {
				System.out.print(array[i]+" ");
			}	
			primo=0;
		}		
	}
	
	
	/**
	 * Método deve imprimir os elementos ímpares de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosImpares(int[] array) 
	{
		for(int i=0; i<array.length; i++) {
			if(array[i]%2 != 0) {
				System.out.print(array[i]+" ");
			}
		}
	}
	
	
	/**
	 * Método deve imprimir os elementos pares de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosPares(int[] array) 
	{
		for(int i=0; i<array.length; i++) {
			if(array[i]%2==0) {
				System.out.print(array[i]+" ");
			}
		}
	}
	
	
	/**
	 * Método deve imprimir o maior e o menor elemento de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirMaiorMenorElemento(int[] array) 
	{
		int valorMaior = array[0];
		int valorMenor = array[0];
		
		for (int i=0; i<array.length; i++ ) {
			if(valorMaior < array[i]) {
				valorMaior = array[i];
			}if (valorMenor > array[i]) {
				valorMenor = array[i];
			}
		}
		System.out.print(valorMaior + " " + valorMenor + " ");
	}
	
	/**
	 * O método calcula a média aritmética dos elementos de um array de inteiros. 
	 * Como resultado, o valor da média deve ser retornado no método.
	 * @param array
	 * @return media
	 */
	public static float calcularMediaAritmetica(int[] array) 
	{
		float media = 0;
		for (int i=0; i< array.length; i++) {
			media = media + array[i];
		}media = media / array.length;
		
		return media;
	}
	
}
