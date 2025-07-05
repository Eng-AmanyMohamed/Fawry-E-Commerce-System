# Fawry E-Commerce System

# E-Commerce System

This project is a Java-based e-commerce system designed as part of the Fawry Quantum Internship Challenge. It models products, a shopping cart, a customer, and a checkout process that includes expiry checks, shipping logic, and balance validation.

## Features

- Define products with name, price, and quantity.
- Support for:
  - Expirable products (e.g., Cheese, Biscuits)
  - Shippable products with weight (e.g., Cheese, TV)
  - Non-shippable, non-expirable products (e.g., Scratch Cards)
- Add products to cart with validation against available stock.
- Checkout process that:
  - Validates expiration and stock
  - Calculates subtotal, shipping, and total cost
  - Deducts from customer's balance
  - Sends shippable items to the `ShippingService`
- Detailed console output for shipment and receipt.
