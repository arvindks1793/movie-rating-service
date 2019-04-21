package com.ks.movieratingservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ks.movieratingservice.DAO.MovieRatingDAO;
import com.ks.movieratingservice.model.MovieratingModel;

@Service
public class MovieratingService {

	@Autowired
	private MovieRatingDAO ratingDAO;

	public MovieratingModel findRatingByUserId(String userid) {
		System.out.println("inside service============================================================");
		MovieratingModel movierating = ratingDAO.findRatingByUserId(userid);
		return movierating;
	}

}
