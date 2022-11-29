package io.tao.moviecatalog.resources;

import io.tao.moviecatalog.models.CatalogItem;
import io.tao.moviecatalog.models.UserRating;
import io.tao.moviecatalog.services.MovieInfo;
import io.tao.moviecatalog.services.UserRatingInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private DiscoveryClient discoveryClient;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @Autowired
    private MovieInfo movieInfo;

    @Autowired
    private UserRatingInfo userRatingInfo;

    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

        // get all rated movie IDs
        UserRating ratings = userRatingInfo.getUserRating(userId);

        // for each movie ID, call movie info service and get details
        return ratings.getUserRating().stream().map(rating -> movieInfo.getCatalogItem(rating))
                .collect(Collectors.toList());
    }

//    public List<CatalogItem> getFallbackCatalog(@PathVariable("userId") String userId) {
//        return Arrays.asList(new CatalogItem("No movie", "", 0));
//    }
    
}

// WebClient
//            Movie movie = webClientBuilder.build()
//                    .get()
//                    .uri("http://localhost:8082/movies/" + rating.getMovieId())
//                    .retrieve()
//                    .bodyToMono(Movie.class)
//                    .block();
