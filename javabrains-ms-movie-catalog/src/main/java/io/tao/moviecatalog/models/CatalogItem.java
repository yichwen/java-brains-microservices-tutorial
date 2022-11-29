package io.tao.moviecatalog.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CatalogItem {
    private final String name;
    private final String desc;
    private final int ratings;
}
