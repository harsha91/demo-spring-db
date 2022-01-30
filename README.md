## Spring JPA DB integration

1. Can generate the project using https://start.spring.io/ (Select spring web, jpa, postgres & flyway libs)
2. Make the DB connection using Spring Autoconfig & provide the props in application.properties
3. The DB can either be managed using hibernate auto ddl, but most of the time more flexiblility is needed, so flyway is useful to write custom DB migration & maintain the DB schema along with app code
4. Make the DB entity see model package
5. You can use the JPARepository see repository package
6. Docker is used to bring postgres locally easily
7. Small controller to test the application


#### How to Run:
you can use ./runApp.sh to run the app localy, note you need Java 11 & docker to run the app locally