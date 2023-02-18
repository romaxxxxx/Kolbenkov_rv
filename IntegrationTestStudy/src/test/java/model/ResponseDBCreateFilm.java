package model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class ResponseDBCreateFilm {
    String id;
    String name;
    String description;
    String releaseDate;
    int duration;
    ArrayList<String> likes;
}
