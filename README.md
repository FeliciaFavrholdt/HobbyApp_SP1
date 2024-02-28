# 3sem_SP1 - HOBBY APPLICATION
This is a repository for SP1. The project is a hobby application that uses JPA, JPQL, Java Streams API, Java Generics, Maven, JDK 17^, JUnit 5, Docker, PostgresSQL, pgAdmin, and Lombok.

All code is written by 
Felicia Favrholdt, DAT 3. semester F24 - Computer Science, CPH Business Lyngby.

## Project Requirements

#### BUSINESS IDEA DESCRIPTION
The business idea is to create a platform that not only provides information about 
people and their hobbies but also offers a matchmaking service. Users can input their 
hobbies and interests, and the platform can connect them with like-minded individuals 
or groups in their local area. This would add a social networking element to the service 
and encourage people to explore new hobbies together, fostering real-world connections.

#### PROJECT DESCRIPTION
The project is focused on backend development. This means no interface is created. 
There is also no output to the console. Only JUnit tests are used to test the functionality of the project.

#### USER STORIES
    [US-1] As a user I want to get all the information about a person
    [US-2] As a user I want to get all phone numbers from a given person
    [US-3] As a user I want to get all persons with a given hobby
    [US-4] As a user I want to get the number of people with a given hobby
    [US-5] As a user I want to get a list all hobbies + a count of how many are interested in each hobby
    [US-6] As a user I want to get all persons living in a given city (i.e. 2800 Lyngby)
    [US-7] As a user I want to get a list of all postcodes and city names in Denmark
    [US-8] As a user I want to get all the information about a person (address, hobbies etc.) given a phone number
    [US-9] As a user I want to be able to do CRUD operations on all JPA entities unless it wouldn't make sense for a given entity.
    [US-10] As a user I want to see all people on an address with a count on how many hobbies each person has (Use Java Streams for this one)
    [US-11] … Add more meaningful services of your own choice.

#### DOMAIN MODEL 
The domain model is created in several versions. The final version is the one that is used in the project.
See all versions in the folder documentation/models. 

#### EER DIAGRAM
The EER diagram is created in pgAdmin. See diagram in the folder documentation/diagrams.

#### GROUP DESCRIPTION
We decided to do the assignment individually and not in a group. This can be elaborated on in the presentation.

#### TECHNICAL REQUIREMENTS
    [R-1] The project must include the following technologies
    * JPA
    * JPQL
    * Java Streams API
    * Java Generics
    * Maven
    * JDK 17^
    * JUnit 5
    * Docker
    * PostgresSQL
    * pgAdmin
    * Lombok
    
    [R-2] The project must contain a meaningful EER-diagram (use pgAdmin to create the diagram)
    [R-3] The project must be documented in a README.md file(*)
    [R-4] The project must contain meaningful unit tests. (70 - 80 % of the methods must be tested (DAO, Entity ...))
    [R-5] JPA annotations must be used for mapping domain classes
    [R-6] JPQL must be used for some CRUD operations
    [R-7] JPA annotations must include minimum once an @Enumerated, @PrePersist and @PreUpdate.
    [R-8] DAO must make use of java generics so we can use the DAO on different data types.
    [R-9] All date/time properties must be made with java.time.LocalDate, java.time.Date or java.time.LocalDateTime and not just a String
    [R-10] DAO classes should follow the Singleton Pattern
    [R-11] Make filter methods on one or more DAO classes to use for searching on location, age, hobbies or name (E.g. find all people with last name = "Hansson")
