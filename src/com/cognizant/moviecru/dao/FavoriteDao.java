package com.cognizant.moviecru.dao;

import java.util.List;

import com.cognizant.moviecru.model.Movies;

/**
 * 
 * @author Prakash_K
 *
 */
public interface FavoriteDao {
	public void addFavorite(long userId, long movieId);

	public List<Movies> getAllFavorites(long userId) throws FavoriteEmptyException;

	public void removeFavorite(long userId, long movieId);
}
