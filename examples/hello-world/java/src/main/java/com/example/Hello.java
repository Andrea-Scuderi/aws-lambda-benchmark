package example;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context; 

public class Hello implements RequestHandler<Request, Response> {
    
    public Response handleRequest(Request request, Context context) {
        String greetingString = String.format("Hello World");
        return new Response(greetingString);
    }
}