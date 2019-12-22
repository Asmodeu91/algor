package DZ3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        runStringReverter();

    }

    private static void runStringReverter() {
        Reverser rever = new Reverser();
        Scanner scanner = new Scanner(System.in);

        System.out.println("print string...");

        while (true) {
            String inputString = scanner.nextLine();
            if (inputString.toLowerCase().equals("exit")) {
                System.exit(0);
            }
            System.out.println(rever.revert(inputString));
        }

    }
}
