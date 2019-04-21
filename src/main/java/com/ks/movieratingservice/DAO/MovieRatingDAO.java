package com.ks.movieratingservice.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ks.movieratingservice.model.MovieRatingRowMapper;
import com.ks.movieratingservice.model.MovieratingModel;

@Transactional
@Repository
public class MovieRatingDAO {

	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public MovieRatingDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;

	}

	public MovieratingModel findRatingByUserId(String userid) {
		System.out.println("inside DAO=======================================================");
		String sql = "SELECT * FROM MOVIE_RATING WHERE USERID=?";
		RowMapper<MovieratingModel> rowMapper = new  MovieRatingRowMapper();
		MovieratingModel movieRating = jdbcTemplate.queryForObject(sql, rowMapper,userid);
		return movieRating;
	}

}
