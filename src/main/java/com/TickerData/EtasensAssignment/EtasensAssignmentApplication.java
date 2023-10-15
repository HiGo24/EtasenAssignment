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
		
		URL url = new URL(apiUrl);

		
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		
		connection.setRequestMethod("GET");

	
		//connection.setRequestProperty("User-Agent", "YourApp/1.0");

		
		int responseCode = connection.getResponseCode();

		if (responseCode == 200) {
			
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String inputLine;
			StringBuilder response = new StringBuilder();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}

			in.close();

			
			connection.disconnect();

			
			return response.toString();
		} else {
			
			throw new Exception("Failed to fetch data from the API. Response code: " + responseCode);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(EtasensAssignmentApplication.class, args);

		try {
			String apiUrl = "http://api.marketstack.com/v1/eod?access_key=e572ae5ca4bf9f5d52cb624037f93bad&symbols=AAPL,GOOG,MSFT";
			
			String responseData = fetchDataFromAPI(apiUrl);
			System.out.println(responseData);
		} catch (Exception e) {
			e.printStackTrace();
		}

 		 }
}








