# Insurance Platform

Spring Boot microservice project built with layered architecture.

## Current Progress
Implemented the first endpoint:

- `POST /api/v1/customers`

## Features
- Resource creation
- DTO pattern
- Service layer
- Proxy abstraction for DB access
- Mapper/helper pattern
- Global exception handling
- Swagger/OpenAPI documentation
- Request validation

## Tech Stack
- Java
- Spring Boot
- Maven
- Swagger / OpenAPI
- Lombok

## Project Structure
- `controller` - API layer
- `service` - business logic
- `proxy` - data access abstraction
- `helper` - mapping logic
- `dto` - request/response models
- `entity` - internal domain model
- `exception` - centralized error handling
- `config` - configuration classes

## Endpoint
### Create Customer
`POST /api/v1/customers`

Sample request:
```json
{
  "firstName": "Sai",
  "lastName": "Reddy",
  "email": "sai@example.com",
  "phoneNumber": "9876543210",
  "addressLine1": "123 Main Street",
  "city": "Atlanta",
  "state": "GA",
  "zipCode": "30022"
}
