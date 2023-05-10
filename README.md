Title: ECommerce App

Structure:

**ECommerce App Assignment**

You are tasked with building an ECommerce app that allows users to purchase products from various categories, including electronics, clothing, and home goods. Your app should be built using Object-Oriented Programming (OOP) principles, including the use of classes, abstract classes, interfaces, inheritance, encapsulation, and polymorphism.

**Requirements**

Your app should meet the following requirements:

1. The app should have a Product class that represents a product that can be sold on the ECommerce app. It should have the following attributes:
  - name: the name of the product (string)
  - price: the price of the product (float)
2. The app should have an abstract class Category that represents a category of products. It should have the following attributes:
  - name: the name of the category (string)
  - products: a list of products in the category (list of Product objects)
  - get\_products(): a method that returns a list of products in the category
3. The app should have the following concrete subclasses of Category:
  - ElectronicsCategory: represents the electronics category, with a list of electronics products.
  - ClothingCategory: represents the clothing category, with a list of clothing products.
  - HomeGoodsCategory: represents the home goods category, with a list of home goods products.
4. The app should have an interface Shippable that represents products that can be shipped to a customer. It should have the following methods:
  - get\_shipping\_cost(): calculates the cost of shipping the product to the customer.
5. The app should have a concrete class PhysicalProduct that represents a physical product that can be shipped. It should inherit from Product and implement the Shippable interface. It should have the following attributes:
  - weight: the weight of the physical product (float)
  - get\_shipping\_cost(): calculates the cost of shipping the product based on its weight.
6. The app should have a concrete class DigitalProduct that represents a digital product that does not need to be shipped. It should inherit from Product and have no additional attributes.
7. The app should use encapsulation to ensure that the internal state of each object is protected and can only be accessed through appropriate methods.
8. The app should demonstrate polymorphism by allowing products to be treated as instances of their respective subclasses.

**Implementation**

You should implement the following classes and interfaces in your code:

- Product
- Category
- ElectronicsCategory
- ClothingCategory
- HomeGoodsCategory
- Shippable
- PhysicalProduct
- DigitalProduct

You should also create a test file to demonstrate that your implementation meets the requirements of the assignment.

**Submission**

Submit your implementation with a README file that includes instructions for running your tests.
