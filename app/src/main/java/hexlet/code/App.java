package hexlet.code;

public class App {
    private static boolean Calc;
    private static Game game;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc ");
        System.out.println("4 - GCD ");
        System.out.println("0 - Exit");
        int choiceNumber = Cli.getNumber();
        System.out.println("Your choice: " + choiceNumber);
        switch (choiceNumber) {
            case (1):
                System.out.println("Welcome to the Brain Games!");
                System.out.println("Hello, " + Cli.getName() + "!");
                break;
            case (2):
                game = new Even();
                break;
            case(3):
                game = new Calc();
                break;
            case(4):
                game = new Gnd();
                break;
        }
//        if (choiceNumber == 1) {
//            System.out.println("Welcome to the Brain Games!");
//            System.out.println("Hello, " + Cli.getName() + "!");
//        } else if (choiceNumber == 2) {
//            game = new Even();
//        } else if (choiceNumber == 3) {
//            game = new Calc();
//        }
        game.play();
    }

}
