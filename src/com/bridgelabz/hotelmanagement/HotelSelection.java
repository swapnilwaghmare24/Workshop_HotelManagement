package com.bridgelabz.hotelmanagement;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HotelSelection {

    List<HotelDetail> hotelDetails=new LinkedList<>();
    Scanner sc=new Scanner(System.in);

    public void hotelAvailable()
    {
        HotelDetail lakewood=new HotelDetail("Lakewood",110);
        HotelDetail bridgewood=new HotelDetail("Bridgewood",160);
        HotelDetail ridgewood=new HotelDetail("Ridgewood",220);
        hotelDetails.add(lakewood);
        hotelDetails.add(bridgewood);
        hotelDetails.add(ridgewood);
        System.out.println(hotelDetails);
    }

    public void customerType()
    {
        long amount;
        System.out.println("Enter price at which you want hotel");
        amount=sc.nextLong();
        for (HotelDetail detail:hotelDetails)
        {
            if(amount==detail.getRate())
            {
                System.out.println("Hotel available for you "+detail.getHotelName());
            }
        }


    }
}
