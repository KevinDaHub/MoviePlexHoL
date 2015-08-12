package org.javaee7.movieplex7.client;

import org.javaee7.movieplex7.entities.Movie;
import org.javaee7.movieplex7.json.MovieWriter;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.Serializable;

/**
 * Created by KeVH on 11/08/2015.
 */
@Named
@SessionScoped
public class MovieBackingBean implements Serializable{


    String movieName;
    String actors;
    int movieId;



    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }



    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }


}
