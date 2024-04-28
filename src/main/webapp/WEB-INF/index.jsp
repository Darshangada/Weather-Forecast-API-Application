<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Weather Application</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h1>Weather Application</h1>
    
     <section class="weather-summary">
        <h1>Weather Summary</h1>
        <form action="/weatherSummary" method="get">
            <label for="summary-city">Enter City:</label>
            <input type="text" id="summary-city" name="city">
            <button type="submit">Get Weather Summary</button>
        </form>
    </section>

    <section class="hourly-weather">
        <h1>Hourly Weather</h1>
        <form action="/hourlyWeather" method="get">
            <label for="hourly-city">Enter City:</label>
            <input type="text" id="hourly-city" name="city">
            <button type="submit">Get Hourly Weather</button>
        </form>
    </section>
</body>
</html>