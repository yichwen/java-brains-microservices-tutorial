package io.tao.moviecatalog.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Rating {
    private String movieId;
    private int rating;
    public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }
}
