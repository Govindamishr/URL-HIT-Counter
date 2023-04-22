:house:    <font color='Blue'>URL HIT COUNTER </font>

### ***Framework***
---------
- spring boot

-------------

### ***Project management tool***
-------
- Maven


-----------------


### **use of dependency**
-----
- <dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-web</artifactId>
    <version>6.0.8</version>
</dependency>

- <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <version>3.0.5</version>
</dependency>
--------
### **packages and class**
----
- model 
  - HitCountResponse 

- controller
   - UrlHitController

- service
   - HitCountResponse
 
-------------
### **usages**
---------
- **model**
  - created  model package inside model package i created  HitCountResponse class  inside  HitCountResponse class initialized   field    like userName,hitcount.

  - after initializing all field as a private  created a constuctor to initialized  object.

  - than created getter and setter Getter and Setter in Java are methods used to access and set the values of an object’s attributes, respectively. They are also referred to as accessor methods and mutator methods.

- **service**

   - Spring boot service component is defined as a class file that includes the @Service annotation and allows developers to add business functionalities. The annotation is used with the classes that provide these business functionalities.

   - after created  service package inside service package i created HitCountResponse class  than, i was created private variable simply i created method that name is hitCount post increament that variable.

- **controller**

  - The @Autowired annotation is used to inject a dependency on the UrlHitService class into this class. This means that an instance of the UrlHitService will be automatically created by Spring and assigned to the urlHitService field.

  -  @GetMapping("/count") annotation defines a handler method for HTTP GET requests with the path "/count". This method will return the current hit count for the URL specified in the request.

  - Inside the handler method, the urlHitService.getHitCount() method is called to retrieve the current hit count value from a data store.
  - The hit count value is then used to create a new HitCountResponse object with the specified URL and hit count value.
  - Finally, the ResponseEntity.ok() method is used to create an HTTP response with the HitCountResponse object as the response body. This response is then returned to the client making the request.

----------

### **Run tests**

------

⭕ postman 

:globe_with_meridians: chrome browser



### **Data structure used**

-----

 core java

  :point_down: **Summary**
*****
This project is designed to create a simple Spring Boot application that counts the number of hits to a URL endpoint and returns the count in a JSON response. The application consists of a UrlHitController class that defines the endpoint and a UrlHitService class that keeps track of the hit count.

The application can be useful for tracking the number of hits to a particular URL and for monitoring the usage of a web application. It can be easily customized to track hits to multiple endpoints and to store the hit count in a database for more persistent storage.

### **Show your Support** 
****
:star: Thankyou 

****






