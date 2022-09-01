package com.bridgelabz.hotelmanagement;

public class HotelDetail {
    String hotelName;
    long rate;




    public HotelDetail(String hotelName,long rate)
    {
        this.hotelName=hotelName;
        this.rate=rate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public long getRate() {
        return rate;
    }

    public void setRate(long rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "HotelDetail{" +
                "hotelName='" + hotelName + '\'' +
                ", rate=" + rate +
                '}';
    }
}
