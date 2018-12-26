package com.train;

public class Ticket {
    final float fPriceOneWay = 1000f;
    final float fPriceRoundTrip = fPriceOneWay * 2 * 0.9f;

    int nCount, nRoundTrip;

    public Ticket(int nCount, int nRoundTrip) {
        this.nCount = nCount;
        this.nRoundTrip = nRoundTrip;
    }


    public void showTotalPrice() {
        float fTotal;

        fTotal = (fPriceOneWay * (nCount - nRoundTrip));
        fTotal += (fPriceRoundTrip * nRoundTrip);

        System.out.println("Total tickets: " + nCount);
        System.out.println("Round-trip: " + nRoundTrip);
        System.out.println("Total: " + fTotal);
    }
}
