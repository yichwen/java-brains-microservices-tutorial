package io.tao.moviecatalog.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Movie {
    private String movieId;
    private String name;
    private String description;
}
