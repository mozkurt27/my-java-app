# My Java App

This is a Java project built using the Spring framework. It consists of APIs that retrieve lists of products and prices.

## Project Structure

```
my-java-app
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com
│   │   │   │   ├── myapp
│   │   │   │   │   ├── controller
│   │   │   │   │   │   ├── ProductController.java
│   │   │   │   │   │   └── PriceController.java
│   │   │   │   │   ├── service
│   │   │   │   │   │   ├── ProductService.java
│   │   │   │   │   │   └── PriceService.java
│   │   │   │   │   └── Application.java
│   │   ├── resources
│   │   │   └── application.properties
│   ├── test
│   │   ├── java
│   │   │   ├── com
│   │   │   │   ├── myapp
│   │   │   │   │   ├── controller
│   │   │   │   │   │   ├── ProductControllerTest.java
│   │   │   │   │   │   └── PriceControllerTest.java
│   │   │   │   │   ├── service
│   │   │   │   │   │   ├── ProductServiceTest.java
│   │   │   │   │   │   └── PriceServiceTest.java
├── .gitignore
├── pom.xml
└── README.md
```

## API Endpoints

### Product API

- **Endpoint**: `/products`
- **Method**: GET
- **Description**: Retrieves a list of products.
- **Controller**: `ProductController.java`
- **Service**: `ProductService.java`

### Price API

- **Endpoint**: `/prices`
- **Method**: GET
- **Description**: Retrieves a list of prices.
- **Controller**: `PriceController.java`
- **Service**: `PriceService.java`

## Getting Started

1. Clone the repository.
2. Build the project using Maven: `mvn clean install`.
3. Run the application: `mvn spring-boot:run`.
4. Access the APIs using the provided endpoints.

## Configuration

The application can be configured using the `application.properties` file located in the `src/main/resources` directory.

## Testing

Unit tests are available for the controllers and services. You can run the tests using Maven: `mvn test`.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, please create a new issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).