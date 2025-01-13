# ZXC CXC Service

## Description
- OpenAPI Spec(API First)
- JOOQ(Database First)

## Prerequisites
- Java 17
- Maven 3.X
- MySQL 8.X

## Initial Setup

Run MySQL8 Service, and initialize `zixiDatabase` database using the `init.sql` script
```sh
docker-compose up
```

Compile the project, and generate the JOOQ classes and the OpenAPI Spec classes
```sh
mvn clean compile
```
