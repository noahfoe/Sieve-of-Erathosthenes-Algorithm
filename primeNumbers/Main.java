package primeNumbers;

/**
 * nff11@txstate.edu
 * Date: 6/11/2020
 * @author Noah Foley
 *
 */
public class Main {
	/**
	 * The main function of this program
	 * @param args an array of string arguments (n is first, then the outFile)
	 */
	public static void main(String[] args) {
		int n = 0;
		try {
			n = Integer.parseInt(args[0]);
		}
		catch(NumberFormatException nfe) {
			System.out.println("First arg must be an integer.");
			System.exit(1);
		}
		
		System.out.println("Printing all primes up to " + n + ": ");
		System.out.println("Results are in the " + args[1] + " file");
		SieveOfEratosthenes primes = new SieveOfEratosthenes();
		primes.sieveOfEratosthenes(n, args[1]);
	}
}
