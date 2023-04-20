# toggle-demo (A Togglz library is a feature flags for the Java platform)

- What is Togglz library?

Togglz is an implementation of the Feature Toggles pattern for Java. Feature Toggles are a very common agile development practices in the context of continuous deployment and delivery. The basic idea is to associate a toggle with each new feature you are working on. This allows you to enable or disable these features at application runtime, even for individual users.

- Reference: https://www.togglz.org/  <br>
Read details about Togglz : https://www.togglz.org/documentation/spring-boot-starter.html 

# How to run this demo project :

- Downlaod the zip file and extract it. Execute the springboot program in your IDE. <br>
(Ensure you create toggles.properties file in the same location what you mentioned in application.yml file.) <br>
you can find toggles.properties file here : https://github.com/AadityaUoHyd/implementing-springboot-togglz-library/blob/master/toggles.properties 

- Orders with discount =>
![](https://github.com/AadityaUoHyd/implementing-springboot-togglz-library/blob/master/orders.jpg)

- Actuator =>
![](https://github.com/AadityaUoHyd/implementing-springboot-togglz-library/blob/master/actuator.jpg)

- TOGGLZ-CONSOLE => 
![](https://github.com/AadityaUoHyd/implementing-springboot-togglz-library/blob/master/togglz-console.jpg)

# Now say, you want to flip the condition of discount, then change boolean value of APPLY_DISCOUNT. You can do it via various means.

- USING TOGGLZ-CONSOLE BUTTON (click and make the status as disable, internally it will make APPLY_DISCOUNT as false)=>
![](https://github.com/AadityaUoHyd/implementing-springboot-togglz-library/blob/master/togglz-console%20Disabled.jpg)

- USING POSTMAN (say erstwhile APPLY_DISCOUNT was false, enable it via postman )=>
![](https://github.com/AadityaUoHyd/implementing-springboot-togglz-library/blob/master/postman.jpg)

- USING PROPERTIES FILE => (Ensure you create toggles.properties file in the same location what you mentioned in application.yml file.) <br>
you can find toggles.properties file here : https://github.com/AadityaUoHyd/implementing-springboot-togglz-library/blob/master/toggles.properties 
![](https://github.com/AadityaUoHyd/implementing-springboot-togglz-library/blob/master/propertiesFile.jpg)

- Orders with no discount =>
![](https://github.com/AadityaUoHyd/implementing-springboot-togglz-library/blob/master/ordersWithNoDiscount.jpg)
