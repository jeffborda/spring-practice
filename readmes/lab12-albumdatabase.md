# Lab 12: Create a Spring App with RESTful Routing

* [Code](../src/main/java)

In this lab I created an app that allows a user to enter in album information which gets entered into a database.  Upon visiting the page, and upon entering a new album, the list of albums in the database is rendered for the user.

## Route
* ```/albums```  Will render all albums from the database, and provide a form for the user to enter new albums.

### Setup Project

In order to run, you must have a file called: ```application.properties``` inside the directory: ```/src/main/resources```.

File contains:

```
spring.datasource.platform=postgres
spring.datasource.url=jdbc:postgresql://localhost:5432/album_app
spring.datasource.username=your-postgres-username
spring.datasource.password=your-postgres-password

spring.jpq.hibernate.ddl-auto=create
```

#### Running Project

To run from command line, use the terminal command:

```./gradlew bootrun```
