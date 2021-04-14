package com.obydul.interfaces;

public interface Subject {
	public void registerObserver(Observer o);
	public void remoeObserver(Observer o);
	public void notifyObservers();
}
