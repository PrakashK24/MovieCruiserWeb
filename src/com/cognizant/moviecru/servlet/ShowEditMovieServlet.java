package com.cognizant.moviecru.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.moviecru.dao.MovieDao;
import com.cognizant.moviecru.dao.MovieDaoCollectionImpl;
import com.cognizant.moviecru.model.Movies;

/**
 * 
 * @author Prakash_K
 *
 */

/**
 * Servlet implementation class ShowEditMovieServlet
 */
@WebServlet("/ShowEditMovieServlet")
public class ShowEditMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowEditMovieServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		MovieDaoCollectionImpl movieCollectionImpl = new MovieDaoCollectionImpl();
		MovieDao movieDao = movieCollectionImpl;
		long movieId = Long.parseLong(request.getParameter("movieId"));
		Movies movies = movieDao.getMovie(movieId);
		System.out.println("Menu Item===" + movies);
		request.setAttribute("movies", movies);
		request.getRequestDispatcher("edit-movie.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
