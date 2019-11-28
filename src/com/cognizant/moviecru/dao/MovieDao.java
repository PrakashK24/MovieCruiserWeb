package com.cognizant.moviecru.dao;

import java.util.List;

import com.cognizant.moviecru.model.Movies;

/**
 * 
 * @author Prakash_K
 *
 */
public interface MovieDao {
	public List<Movies> getMovieListAdmin();

	public List<Movies> getMovieListCustomer();

	public void modifyMovie(Movies movie);

	public Movies getMovie(long movieId);
}
