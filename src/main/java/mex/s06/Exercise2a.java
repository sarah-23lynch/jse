package mex.s06;

public class Exercise2a {
	/**
	 * Calculate the average somma tutti i valori e poi dividi per il numero di
	 * valori in array
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {

		double result = 0.0;                        // è la mia variabile somma di tutti i valori in array
		for (int i = 0; i < data.length; i++) {
			result += data[i];                         // incrementa result aggiungendoci il valore di i
		}

		return result / data.length;            // chiaramente dividi per quanti sono i valori in array
	}
}
