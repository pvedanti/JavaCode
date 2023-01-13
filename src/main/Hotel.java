package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hotel {
    private final double rate;
    private final String name;

    public Hotel(double rate, String name) {
        this.rate = rate;
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hotel)) return false;
        Hotel hotel = (Hotel) o;
        return Double.compare(hotel.getRate(), getRate()) == 0 &&
                Objects.equals(name, hotel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRate(), name);
    }


    public static void main(String args[]){
        List<Hotel> hotels=new ArrayList<>();
        Hotel MiamiBeach = new Hotel (190,"MiamiBeach");
        Hotel MiamiCity = new Hotel (100,"MimiCity");
        Hotel MiamiDowntown = new Hotel (120,"MimiDowntown");

        hotels.add(MiamiBeach);
        hotels.add(MiamiCity);
        hotels.add(MiamiDowntown);

        ReservationSystem rs = new ReservationSystem(hotels);
        System.out.println(rs.findCheapestHotel().name);

    }
}
