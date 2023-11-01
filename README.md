# Description
This Java Project allows you to host different REST APIs to manage the creation and the vote of different polls.

# Contributors

<img src="https://contrib.rocks/image?repo=ChristianSorgente24/SpringSondaggio" />

# Usage and Modify
**0. Prerequisites:**

- Install [Java SE JDK-11](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html) or check if already installed with `java -version`.
- Install [Maven 3.8.4+](https://maven.apache.org/install.html) or check if already installed with `mvn -v`.
- Install [Xampp](https://www.apachefriends.org/it/download.html) or check if MySQL is already installed.
- Watch the [structure](https://github.com/Puntiss/java-poll-api/blob/master/screenshot/ProgettoSondaggioSpring.drawio.png) to understand how works.

**1. Configure credential**

- After have downloaded the code edit the `spring.datasource.username` `spring.datasource.password` in *src\main\resources\application.properties* with the credential of your MySQL user.
> [!WARNING]
> If you want to distribute the application edit the *src\main\java\com\milano\sondaggio\config\WebConfig.java* with allowed origins.

**2. Build**

- Start the MySQL and create a new database called in the same way as the `spring.datasource.url` attribute in *src\main\resources\application.properties*.
- Install all project dependencies specified in the pom.xml file using `mvn clean install`, a target folder will be created.
 
**3. Deploy**

- Into the target folder of the project launch this command: `java -jar -Dserver.port=8080 sondaggio-1.0.jar`
> [!NOTE]
> In the first connection it will create automatically all the tables in the database.

![](https://github.com/Puntiss/java-poll-api/blob/master/screenshot/mysql.JPG)
  
**4. Testing**
- Use the host URL + endpoint and test it with [Postman](https://www.postman.com/), you should get a JSON responses:
![](https://github.com/Puntiss/java-poll-api/blob/master/screenshot/registration.JPG)
![](https://github.com/Puntiss/java-poll-api/blob/master/screenshot/login%20accepted.JPG)
- There are other endpoints:
```json
{	
	"api":[
		"utente":{
			"/registra":"Insert new user with username, password and email",
			"/login":"Login user if username and password are correct",
			"/logut":"Logut user"
		},
		"utenteSondaggio":{
			"/canVoto/{id_sondaggio}/{username}":"Verify if the user can vote a poll",
			"/insertVoto/{id}":"Insert the choosen vote",
			"/updateVoto/{id}/{username}":"Update the vote of the user"
		},
		"sondaggio":{
			"/sondaggio/{id}":"Get title, desc. and options from given id",
			"/deleteSondaggio/{id}":"Delete from id",
			"/updateSondaggio":"Update from id and with Poll class as parameter",
			"/sondaggi":"Retrieve all polls",
			"/insertSondaggio":"Insert with Poll class as parameter"
		}
	]	
}
```
- Is available a [frontend application](https://github.com/Puntiss/angular-poll) that use this APIs

Happy coding!

 
