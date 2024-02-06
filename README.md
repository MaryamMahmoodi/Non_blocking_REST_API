# Non_blocking_REST_API
This is a simple example of a non-blocking REST API implemented using Spring Boot. The API fetches data from two different endpoints, combines the data, and returns a single response.

## Features

- Fetches data from two different REST endpoints.
- Combines the fetched data and returns a single response.
- Built with Spring Boot and Spring WebFlux for non-blocking processing.

## Getting Started

To run the application locally, you'll need Java and Maven installed on your system.

1. Clone this repository:

``` git clone https://github.com/MaryamMahmoodi/Non_blocking_REST_API.git ```

2. Navigate to the project directory:
``` non_blocking_api```

3. Run the application using Maven:

   You can run it directly from IntelliJ IDEA or your preferred IDE, or you can use Maven to package and run the application from the command line.

``` mvn spring-boot:run```


4. Once the application is running, you can access the API at:
``` http://localhost:8080/api/combinedData ```


## Dependencies

- Spring Boot
- Spring WebFlux
- Lombok