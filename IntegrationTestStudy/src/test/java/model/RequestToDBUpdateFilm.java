package model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RequestToDBUpdateFilm {
    int id;
    String name;
    String description;
    String releaseDate;
    int duration;

    String rate;

    @Override
    public String toString() {
        return "{\"id\":\"" + id + "\",\"name\":\"" + name + "\",\"description\":\"" + description + "\"" +
                ",\"releaseDate\":\"" + releaseDate + "\",\"duration\":\"" + duration + "\"" +
                ",\"rate\":\"" + rate + "\"}";
    }
}
