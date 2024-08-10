package cinema;

public class Cinema {

    public static void main(String[] args) {
        System.out.println("Cinema:");

        for (int i = 0; i < 8; i++) {
            System.out.print(i == 0 ? " " : i + " ");

            for (int j = 1; j <= 8; j++) {
                System.out.print(i != 0 ? "S " : j + " ");
            }

            System.out.println();
        }

    }
}