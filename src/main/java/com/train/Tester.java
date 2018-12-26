package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        int nCount, nRoundTrip;
        boolean bOK;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.print("Please enter number of tickets:");
            nCount = scanner.nextInt();
            if (nCount <= 0) {
                System.out.println("Total tickets count must > 0 !");
                bOK = true;
            }
            else
                bOK = false;
        } while (bOK);

        do {
            System.out.print("How many round-trip tickets:");
            nRoundTrip = scanner.nextInt();
            if (nRoundTrip < 0 || nRoundTrip > nCount) {
                System.out.println("Round trip tickets can't be < 0 or more than total tickets !");
                bOK = true;
            }
            else
                bOK = false;
        } while (bOK);

        Ticket ticket = new Ticket(nCount, nRoundTrip);
        ticket.showTotalPrice();
    }
}
