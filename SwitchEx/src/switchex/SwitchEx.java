package switchex;

public class SwitchEx {

    public static void main(String[] args) {
        int number = 30;
        int number2 = 44;

        switch (number) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");

        }
        switch (number2) {
            case 5:
                System.out.println("5");
                break;
            case 15:
                System.out.println("5");
                break;
            default:
                System.out.println("Not 5 or 15");
                break;

        }
    }

}
