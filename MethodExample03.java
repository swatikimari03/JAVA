public class MethodExample03 {

    static int doubleGames ( int x) {
        return x * 2;
    }

    public static void main ( String[] args) {
        for ( int i = 1; i <= 5; i++) {

            System.out.println("Double of" + i + " is" + doubleGames(i));
        }
    }
}