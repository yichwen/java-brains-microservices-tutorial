package io.tao.movieinfo.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MovieSummary {
    private String id;
    private String title;
    private String overview;
}
