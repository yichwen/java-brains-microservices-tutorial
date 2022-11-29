package io.tao.ratingsdata.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Rating {
    private final String movieId;
    private final int rating;
}
