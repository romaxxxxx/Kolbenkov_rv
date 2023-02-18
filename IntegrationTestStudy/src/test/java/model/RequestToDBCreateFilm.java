package model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RequestToDBCreateFilm {
    String name;
    String description;
    String releaseDate;
    int duration;

    @Override
    public String toString() {
        return "{\"name\":\"" + name + "\",\"description\":\"" + description + "\",\"releaseDate\":\"" + releaseDate + "\",\"duration\":\"" + duration + "\"}";
    }
}
