package me.marthin;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

/**
 * Created by marthin on 04/05/15.
 */
public class HelloWorldSparkStyle {
    public static void main(String[] args) {
        Spark.get(new Route("/hello") {
            @Override
            public Object handle(final Request request, final Response response) {
                return "Hello World From Spark";
            }
        });
    }
}
