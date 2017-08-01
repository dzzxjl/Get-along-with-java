package com.dzzxjl.test;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class MongoTest {
    public static void main(String[] args) {
        try{
            // To connect to mongodb server
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
            // Now connect to your databases
            MongoDatabase mongoDatabase = mongoClient.getDatabase("test");
            System.out.println("Connect to database successfully");

            MongoCollection<Document> collection = mongoDatabase.getCollection("newcoll");

            Document document = new Document("name","dzzxjl")
                    .append("sex","male")
                    .append("niamling",22);
//            List<Document> documents = new ArrayList<Document>();
//            documents.add(document);
            //以doc或者list的形式添加数据
            collection.insertOne(document);
            System.out.println("success!");

            FindIterable<Document> findIterable = collection.find();
            MongoCursor mongoCursor = findIterable.iterator();
            long total = collection.count();
            System.out.println(total);
            List list = new ArrayList();
            while (mongoCursor.hasNext()){
                System.out.println(mongoCursor.next());
            }

        }catch(Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
    }
}
