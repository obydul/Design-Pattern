package com.obydul.running;

import com.obydul.classes.CurrentConditionsDisplay;
import com.obydul.classes.ForecastDisplay;
import com.obydul.classes.StatisticsDisplay;
import com.obydul.classes.WeatherData;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay current = new CurrentConditionsDisplay(
				weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forcaDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.5f);
		weatherData.setMeasurements(82, 70, 25.5f);
		weatherData.setMeasurements(75, 55, 45.5f);

	}
}
