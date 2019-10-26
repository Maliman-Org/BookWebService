# BookWebService 💻 📌 📙 

## Explication of our application

   
## Execution 🔌🔨

1. Turn on your Xampp. 🔛

2. Create new database and name it "bookdb" then import the [sql file] (https://github.com/Maliman-Org/BookWebService/blob/master/BooksService/bookdb.sql) . 💾

3. Open a cmd window and type :
          * "cd projectpath\BookWebService\BookClient\src\" 
          * then "wsimport -Xnocompile http://localhost:8585/BookWS?wsdl" in order to generate the stub.
          
4. Execute the class *BookService.java* to deploy the service.

5. Execute the class *BookClient.java*.

6. When the interface of our app appears, type the title of book to search for the click the search icon. 🔎

7. You can like 👍 or dislike 👎 any searched book.

## Screenshots 📷

| Generating The Stub From The CMD | Result |
| ------------- |:-------------:|
| ![alt text](https://github.com/Maliman-Org/BookWebService/blob/master/ScreenShots/generatingStub.PNG "Stub generation" ) | ![alt text](https://github.com/Maliman-Org/BookWebService/blob/master/ScreenShots/ResultOfGeneratingStub.PNG "Result" ) |

| Service Deployment |
| ------------- |
|![alt text](https://github.com/Maliman-Org/BookWebService/blob/master/ScreenShots/serviceDeployed.PNG "Service deployed" )|


| Client Part Execution |
| ------------- |
|![alt text](https://github.com/Maliman-Org/BookWebService/blob/master/ScreenShots/execution.PNG "Execution" )|

| Main Interface |
| ------------- |
|![alt text](https://github.com/Maliman-Org/BookWebService/blob/master/ScreenShots/mainScreen.PNG "Main screen" )|

| Searching a book |
| ------------- |
|![alt text](https://github.com/Maliman-Org/BookWebService/blob/master/ScreenShots/searchAbook.PNG "Searching" )|

| Like | Dislike |
| ------------- |:-------------:|
| ![alt text](https://github.com/Maliman-Org/BookWebService/blob/master/ScreenShots/likeAbook.PNG "like" ) | ![alt text](https://github.com/Maliman-Org/BookWebService/blob/master/ScreenShots/dislikeAbook.PNG "dislike" ) |

## IDE & Libraries used 🔧

 * NetBeans IDE 8.2
 * JDK 8
 * Jfoenix 8.0.1
 * controlsfx 9.0.0
 * mysql connector java 5.1.42

