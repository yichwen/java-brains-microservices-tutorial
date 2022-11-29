package io.tao.movieinfo.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Movie {
    private final String movieId;
    private final String name;
    private final String description;
}
