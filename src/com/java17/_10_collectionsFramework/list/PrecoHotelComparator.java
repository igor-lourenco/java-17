package com.java17._10_collectionsFramework.list;

import com.java17._10_collectionsFramework.list.vector.agencia.Hotel;

import java.util.Comparator;

public class PrecoHotelComparator implements Comparator<Hotel> {


    @Override
    public int compare(Hotel o1, Hotel o2) {
        return Double.compare(o1.getPrecoDiaria(), o2.getPrecoDiaria());
    }
}
