# Lab 13: Related Resources

* [Code](../src/main/java)

In this lab I provided the ability for a user to add songs to their list of albums.  For this to work, I added a table in the ```album_app``` database called ```song```.  Since this is a many-to-one relationship between albums and songs, each song contains a foreign key which points to the album it belongs to.

Also completed in this lab was adding integration testing for the ```/hello``` route.

## Routes
* ```/``` Root route set to redirect to: ```/albums```
* ```/albums```  Will render all albums from the database, and provide a form for the user to enter new albums.
* ```/albums/{albumId}``` Will render the detail view for that album, which is where a user can add songs to that album.
* ```/songs``` Will render a table of all songs which have been added to the database.

### Setup Project

In order to run, you must have a file called: ```application.properties``` inside the directory: ```/src/main/resources```.

File contains:

```
spring.datasource.platform=postgres
spring.datasource.url=jdbc:postgresql://localhost:5432/album_app
spring.datasource.username=your-postgres-username
spring.datasource.password=your-postgres-password

spring.jpa.generate-ddl=true
spring.jpq.hibernate.ddl-auto=create
```

#### Running Project

To run project from terminal, use command:

```./gradlew bootrun```
