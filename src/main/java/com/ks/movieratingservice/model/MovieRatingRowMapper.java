package com.ks.movieratingservice.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MovieRatingRowMapper implements RowMapper<MovieratingModel> {

	@Override
	public MovieratingModel mapRow(ResultSet row, int rowNum)
			throws SQLException {

		MovieratingModel movieRating = new MovieratingModel();

		movieRating.setId(row.getInt("ID"));
		movieRating.setMovieID(row.getInt("MOVIEID"));
		movieRating.setUserId(row.getString("USERID"));
		movieRating.setMovieRating(row.getInt("RATING"));

		return movieRating;
	}

}
