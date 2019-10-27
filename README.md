# BookWebService 💻 📌 📙 

## What is a *Web service* ❓ 🤷‍♀
 **WS** is a server running 🔌 on a computer device, listening 👂 for requests at a particular port over a network, serving web documents (HTML, JSON, XML, Images), and creating web applications services, which serve in solving specific domain problems over the web (www, internet, HTTP).
 
## Idea of the project 💡

 * The purpuse is to create an application to search a given book.
 * Show its rating.
 * Must use Web service.
 
   
## Execution 🔌🔨

1. Turn on your Xampp. 🔛

2. Create new database and name it "bookdb" then import the [sql file](https://github.com/Maliman-Org/BookWebService/blob/master/BooksService/bookdb.sql) . 💾

3. Open a cmd window and type :
          * "cd projectpath\BookWebService\BookClient\src\", 
          * then "wsimport -Xnocompile http://localhost:8585/BookWS?wsdl" in order to generate the stub.
          
4. Execute the class *BookService.java* to deploy the service.

5. Execute the class *BookClient.java*.

6. When the interface of our app appears, the user types the title of book to search for, then clicks into the search icon. 🔎

7. User can like 👍 or dislike 👎 any searched book.

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

### ❗️ PS
   To understand more the principle of web services, don't hesitate to watch this [video](https://www.youtube.com/watch?v=VNC7OANJL5g&list=PLxr551TUsmAozms7qX1iT8JzAwllHq0vD&fbclid=IwAR1TZ02I6PZJTVfk8kbM74uGEXKSRkDOtmVDwYh8rzotLPiGs7WBho-66Rs) which helped us a lot in our work 😉.
    

## IDE & Libraries used 🔧

 * NetBeans IDE 8.2
 * JDK 8
 * Jfoenix 8.0.1
 * controlsfx 9.0.0
 * mysql connector java 5.1.42

