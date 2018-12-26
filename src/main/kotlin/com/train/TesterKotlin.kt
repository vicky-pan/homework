package com.train

import java.util.*

fun main(args: Array<String>) {
    var nCount : Int
    var nRoundTrip : Int
    var bOK: Boolean
    val scan = Scanner(System.`in`)

    do {
        print("Please enter number of tickets:")
        nCount = scan.nextInt()
        if (nCount<=0) {
            println("Total tickets count must > 0 !")
            bOK = true
        }
        else
            bOK = false
    } while (bOK)

    do {
        print("How many round-trip tickets:")
        nRoundTrip = scan.nextInt()
        if (nRoundTrip < 0 || nRoundTrip > nCount) {
            println("Round trip tickets can't be < 0 or more than total tickets !")
            bOK = true
        }
        else
            bOK = false
    } while (bOK)

    val ticket = TicketKotlin(nCount,nRoundTrip)
    ticket.showTotalPrice()
}

class TicketKotlin(var nCount : Int, var nRoundTrip : Int)  {
    val fPriceOneWay = 1000f
    val fPriceRoundTrip = fPriceOneWay * 2 * 0.9f

    fun showTotalPrice() {
        var fTotal : Float

        fTotal = (fPriceOneWay * (nCount - nRoundTrip))
        fTotal += (fPriceRoundTrip * nRoundTrip)

        println("Total tickets: $nCount\nRound-trip: $nRoundTrip\nTotal: $fTotal")
    }
}