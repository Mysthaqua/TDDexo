package tibo.tdd.exo4;

import tibo.tdd.exo4.exception.NotFoundException;
import tibo.tdd.exo4.exception.NotImplementedException;

import java.util.List;

public class SearchCity {
    private List<String> cities;

    public SearchCity(List<String> cities) {
        this.cities = cities;
    }

    public List<String> search(String city) {
        if (city.length() < 2) throw new NotFoundException();

        throw new NotImplementedException();
    }
}
