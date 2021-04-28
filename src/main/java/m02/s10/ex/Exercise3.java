package m02.s10.ex;

public class Exercise3 {
	public static void main(String[] args) {
		/*
		 * Print (1) the number of arguments passed to this main (2) each argument
		 */

		// 1
		System.out.println("you passed me " + args.length + " argument(s)");

		// 2
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		System.out.println("- - -");

		// 2b
		for (String arg : args) {
			System.out.println(arg);
		}
		// 2c
		int i = 0;
		while (i < args.length) {
			System.out.println(args[i]);
			i++; // i+= 1;//i = i+1
		}

		System.out.println("- - -");

		// 2d
		int j = 0;
		do {
			System.out.println(args[j]);
			j++;
		} while (j < args.length);
	}
}
