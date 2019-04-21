package com.ks.movieratingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ks.movieratingservice.model.MovieratingModel;
import com.ks.movieratingservice.service.MovieratingService;

@Controller
public class MovieratingController {
	@Autowired
	MovieratingService movieratingsr;

	@RequestMapping(method = RequestMethod.GET, value = "/rating/{userid}")
	private ResponseEntity<MovieratingModel> findRatingByUserid(
			@PathVariable String userid) {

		MovieratingModel movieratingModel;
		try {
			System.out
					.println("inside controller=================================");
			movieratingModel = movieratingsr.findRatingByUserId(userid);
		} catch (Exception e) {
			System.out.println(e.getMessage().getClass());
			throw e;
		}
		return new ResponseEntity<MovieratingModel>(movieratingModel,
				HttpStatus.OK);
	}

}
