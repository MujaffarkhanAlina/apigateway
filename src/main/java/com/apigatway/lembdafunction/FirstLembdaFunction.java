package com.apigatway.lembdafunction;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class FirstLembdaFunction implements RequestHandler<String, String>{



	public String handleRequest(String input, Context context) {
        
		  System.out.println("Hello world");
          return "Hello World - " + input;
    }
}
