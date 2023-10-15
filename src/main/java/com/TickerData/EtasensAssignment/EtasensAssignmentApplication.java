package com.TickerData.EtasensAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
@SpringBootApplication
public class EtasensAssignmentApplication {

	public static String fetchDataFromAPI(String apiUrl) throws Exception {
		// Create a URL object with the API endpoint
		URL url = new URL(apiUrl);

		// Open a connection to the URL
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		// Set the request method (GET in this case)
		connection.setRequestMethod("GET");

		// Set the request headers if needed
		//connection.setRequestProperty("User-Agent", "YourApp/1.0");

		// Get the response code (200 for success)
		int responseCode = connection.getResponseCode();

		if (responseCode == 200) {
			// Create a BufferedReader to read the API response
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String inputLine;
			StringBuilder response = new StringBuilder();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}

			in.close();

			// Close the connection
			connection.disconnect();

			// Return the API response as a string
			return response.toString();
		} else {
			// Handle the error (e.g., by throwing an exception)
			throw new Exception("Failed to fetch data from the API. Response code: " + responseCode);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(EtasensAssignmentApplication.class, args);

		try {
			String apiUrl = "http://api.marketstack.com/v1/eod?access_key=e572ae5ca4bf9f5d52cb624037f93bad&symbols=AAPL,GOOG,MSFT";
			; // Replace with your API endpoint
			String responseData = fetchDataFromAPI(apiUrl);
			System.out.println(responseData);
		} catch (Exception e) {
			e.printStackTrace();
		}

 		 }
}








