package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int numberOfRows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int seatsPerRow = scanner.nextInt();

        int totalSeats = numberOfRows * seatsPerRow;
        int frontRows = numberOfRows / 2;
        int backRows = numberOfRows - frontRows;
        int income;

        if (totalSeats < 60) {
            income = totalSeats * 10;
        } else {
            income = frontRows * seatsPerRow * 10 + backRows * seatsPerRow * 8;
        }

        System.out.printf("Total income: $%d", income);
    }
}