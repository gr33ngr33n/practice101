package org.schoolactivities.service;

import org.schoolactivities.model.*;

public class SchoolService {
	
	private FootballActivity footballActivity;
	private BasketballActivity basketballActivity;
		
	public FootballActivity getFootballActivity() {
		return footballActivity;
	}
	public void setFootballActivity(FootballActivity footballActivity) {
		this.footballActivity = footballActivity;
	}
	public BasketballActivity getBasketballActivity() {
		return basketballActivity;
	}
	public void setBasketballActivity(BasketballActivity basketballActivity) {
		this.basketballActivity = basketballActivity;
	}

}
