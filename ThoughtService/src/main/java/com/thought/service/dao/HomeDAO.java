package com.thought.service.dao;

import org.springframework.stereotype.Service;

import com.thought.service.model.HomeModel;

@Service("homeDAO")
public class HomeDAO {

	public HomeModel getHomeDetails() {

		HomeModel model = new HomeModel();
		model.setNameOfHome("This is my first framwork!");
		return model;

	}
}
