Steps to reproduce :

- Launch the server (mvn spring-boot:run)
- curl localhost:8080/employees/by-company/42
- console logs show that the company has been loaded by hibernate