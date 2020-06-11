package primeNumbers;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * nff11@txstate.edu
 * Date: 6/11/2020
 * @author Noah Foley
 *
 */
public class SieveOfEratosthenes {
	/**
	 * This function will write all prime numbers up to n
	 * in a file called output.txt
	 * @param n the upper bounds for the algorithm
	 * @param outFile the file "output.txt" in which to write the prime numbers to
	 */
	public void sieveOfEratosthenes(int n, String outFile) {
		
		/* Implementation of Sieve of Eratosthenes Algorithm */
		
		// a list of numbers, true if prime, false if not
		boolean prime[] = new boolean[n+1];
		
		// Set all numbers up to n in list to true
		for(int i=0; i<n; i++) {
			prime[i] = true;
		}
		
		// p initially equals first prime number, enumerate multiples of p from 2p to n
		for(int p=2; p*p <= n; p++) {
			if(prime[p] == true) {
				for(int i=p*p; i<=n; i+=p) {
					prime[i] = false;
				}
			}
		}
		
		
		// Print results to output file
		try {
			PrintWriter outputStream = new PrintWriter(outFile);
			outputStream.println("All prime numbers from 1 - " + n + " are: ");
			for(int i=2; i<=n; i++) {
				if(prime[i] == true) {
					outputStream.print(i + " ");
				}
			}
			System.out.println("Output.txt updated!");
			outputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
