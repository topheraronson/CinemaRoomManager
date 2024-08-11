package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int numberOfRows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int seatsPerRow = scanner.nextInt();

        System.out.println("Cinema:");

        for (int i = 0; i <= numberOfRows; i++) {
            System.out.print(i == 0 ? "  " : i + " ");

            for (int j = 1; j <= seatsPerRow; j++) {
                System.out.print(i != 0 ? "S " : j + " ");
            }

            System.out.println();
        }

        System.out.println("Enter a row number:");
        int userRow = scanner.nextInt();

        System.out.println("Enter a seat number in that row:");
        int userSeat = scanner.nextInt();

        int totalSeats = numberOfRows * seatsPerRow;
        int frontRows = numberOfRows / 2;

        System.out.printf("Ticket price: $%d\n", totalSeats <= 60 ? 10 : userRow <= frontRows ? 10 : 8);

        System.out.println("Cinema:");
        for (int i = 0; i <= numberOfRows; i++) {
            System.out.print(i == 0 ? "  " : i + " ");

            for (int j = 1; j <= seatsPerRow; j++) {
                String seatCharacter = i == userRow && j == userSeat ? "B " : "S ";
                System.out.print(i != 0 ? seatCharacter : j + " ");
            }

            System.out.println();
        }
    }
}