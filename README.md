Test the Product Service:

Add products using POST /products:
{
  "id": "1",
  "name": "Product 1",
  "price": 100.0
}
Retrieve products using GET /products.
Test the Order Service:

Create orders using POST /orders:
{
  "id": "1",
  "productId": "1",
  "quantity": 1
}
Retrieve orders using GET /orders.
Test the Inventory Service:

Update inventory using PUT /inventory/{productId}?quantity=10.
Retrieve inventory using GET /inventory.
Conclusion
You have successfully set up a basic e-commerce application using Spring Boot microservices architecture. This setup includes a Product Service, Order Service, Inventory Service, Eureka Server for service discovery, and an API Gateway. This example can be expanded with more features such as user management, payment processing, and more complex business logic.

