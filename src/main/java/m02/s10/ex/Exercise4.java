package m02.s10.ex;

public class Exercise4 {
	public static void main(String[] args) {
// print up to 3 args per array
		// Math.min(args.length, 3);

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);

			if (i > 1) {
				break;
			}
		}

		int end = 3;
		if (args.length < 3) {
			end = args.length;
		}

		for (int i = 0; i < end; i++) {
			System.out.println(args[i]);
		}
	}
}