package me.marthin;

import com.mongodb.*;

import java.net.UnknownHostException;


/**
 * Created by marthin on 04/05/15.
 */
public class HelloWorldMongoDBStyle {
    public static void main(String[] args) throws UnknownHostException{
        MongoClient client = new MongoClient(new ServerAddress("localhost", 27017));

        DB database = client.getDB("course");
        DBCollection collection = database.getCollection("hello");

        DBObject document = collection.findOne();
        System.out.println(document);
    }
}