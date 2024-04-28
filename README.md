# WeatherForecast API with Spring Boot and Postman

This project integrates a Weather API from Rapid API into a Spring Boot application to provide weather forecast information for any city.

## Authentication
The application utilizes header-based authentication with a random client ID and secret obtained from your Rapid API account. These credentials are included in the request header to access the weather data.

## Functionality
The application exposes two RESTful APIs:

1. **Get Weather Forecast Summary by City Name**:
   - Endpoint: `/rapidapi/forecast/{city}/summary/`
   - Method: GET
   - Description: Retrieves a summary of the weather forecast for the specified city.
   - Example: `/rapidapi/forecast/London/summary/` (Replace "delhi" with your desired city)

2. **Get Hourly Weather Forecast by City Name**:
   - Endpoint: `/rapidapi/forecast/{city}/hourly/`
   - Method: GET
   - Description: Retrieves detailed hourly weather data for the specified city.
   - Example: `/rapidapi/forecast/Paris/hourly/` (Replace "Paris" with your desired city)

Please note: The curly braces `{}` in the endpoint represent a placeholder for the city name.

For detailed API documentation, refer to the Rapid API resource: Rapid API Documentation.

## Running the Application
1. Clone the repository to your local machine.
2. Import the project into your favorite Java IDE.
3. Configure your Rapid API credentials (client ID and secret) in the `application.properties` file.
4. Build and run the Spring Boot application.
5. Use a tool like Postman to interact with the API endpoints by providing the city name in the URL path and including your Rapid API credentials (client ID and secret) in the request header.

## Technologies Used
- Spring Boot
- Java
- Postman
- Rapid API

## Contributor
- Darshan Gadakh

- Feel free to customize this README further and happy coding! 🌦️🌤️🌧️ .
