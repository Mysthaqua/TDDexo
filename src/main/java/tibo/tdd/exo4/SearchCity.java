package tibo.tdd.exo4;

import tibo.tdd.exception.NotFoundException;

import java.util.List;

public class SearchCity {
    private List<String> cities;

    public SearchCity(List<String> cities) {
        this.cities = cities;
    }

    public List<String> search(String city) {
        if (city.equals("*")) return cities;
        if (city.length() < 2) throw new NotFoundException();

        return cities.stream().filter(cityName -> cityName.toLowerCase().contains(city.toLowerCase())).toList();
    }
}
