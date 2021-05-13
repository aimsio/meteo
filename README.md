# Project Guide

This document describes the coding challenge for Android developers at Aimsio's Android team. Please read the document carefully before you begin your work. Should you have any questions feel free to reach out to us.


# Introducing Meteo

This repository hosts the starter project for creating an Android application called Meteo to display the weather forecast data and news for any given city. This is the how Meteo is supposed to look like.
	

![Meteo ](https://www.linkpicture.com/q/screen-shot-2021-05-12-at-8-35-1.png)

## Challenge Objectives

Start your work by forking this repository into your own github account. To help you get this assignment off the ground we have already added some model classes and a few dependencies. When you are done with the assignment, send us the link to your repository. 

Use git commits to break down the work into steps in a way that reflects your planning and thinking process.

To pass this challenge your assignment must meet the following objectives:

1. Implement the main page of the app, similar to the mockup image above.
2. When the app launches, if this is the very first run, it must wait for the user to enter a city name in the searchbox, and then uses the endpoints to retrieve the current weather condition, 3-day forecast, and a list of news articles about the city. If this is a relaunch, it must show the weather data based on the last search by the user.
3. When the user rotates the device, the app should continue to show correct data based on the last state.
4. The app should work in both offline and online mode.
5. When there is a failure in fetching data from the endpoints or stored data, display a message to the user and an option for retrying.
6. Use MVVM architecture for implementing your app.
7. Make use of a dependency injection library, preferably Dagger.
8. Write unit tests for your app. The tests should cover a meaningful part of your business logic or architecture.
9. Write at least 3 relevant instrumentation tests to confirm the correct behavior of the app based on the user interaction.
10. Needless to say, your app must remain crash-free at all times.

## Data Endpoints

The following endpoints provide the necessary data for populating the user interface of Meteo:

1. current weather condition: https://openweathermap.org/current	
2. 5-day weather forecast: https://openweathermap.org/forecast5
3. weather images: http://openweathermap.org/img/w/{iconCode}.png
4. news about the city: https://newsapi.org/docs/endpoints/everything

