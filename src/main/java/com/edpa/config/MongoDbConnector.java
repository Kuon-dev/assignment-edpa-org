// package com.edpa.config;
//
// import com.mongodb.ConnectionString;
// import com.mongodb.MongoClientSettings;
// import com.mongodb.MongoException;
// import com.mongodb.client.MongoClient;
// import com.mongodb.client.MongoClients;
// import com.mongodb.client.MongoDatabase;
// import com.mongodb.ServerApi;
// import com.mongodb.ServerApiVersion;
// import io.github.cdimascio.dotenv.Dotenv;
// import org.springframework.stereotype.Component;
//
// @Component
// public class MongoDbConnector {
//
//     private final MongoClient mongoClient;
//
//     public MongoDbConnector() {
//         String connectionString = Dotenv.load().get("MONGODB_URI");
//
//         ServerApi serverApi = ServerApi.builder()
//                 .version(ServerApiVersion.V1)
//                 .build();
//
//         MongoClientSettings settings = MongoClientSettings.builder()
//                 .applyConnectionString(new ConnectionString(connectionString))
//                 .serverApi(serverApi)
//                 .build();
//
//         this.mongoClient = MongoClients.create(settings);
//     }
//
//     public MongoClient getMongoClient() {
//         return this.mongoClient;
//     }
// }
