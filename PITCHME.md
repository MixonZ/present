---
# @color[#ffc34d](Sveiki)
---
@ul[list-many-items]
- Mikus Zarins
- How did I find Codelex
- Finished Codelex on end of April
@ulend

---

@snap[north span=100]
### @color[#ffc34d](My job:)
@snapend
- Work for: @color[#ffc34d](Expert-quality)
- Work as: @color[#ffc34d](Backend developer)
@ul[list-many-items]
- Still don't know what I'm doing
@ulend

---?code=assets/java/singleresponsibility/01-Car.java&lang=java
@[1-5](Simple Car class)
@[7-9](Bad method nr1)
@[11-13](Bad method nr2)
@snap[south-west span-47]
@quote[A class should have only one reason to change](Guy next door)
@snapend

@snap[south-east span-47]
@quote[A class should have only one responsibility](Mom)
@snapend
---
@snap[west]
#### To@color[#ffc34d](do)
@ul[list-many-items]
- One class doing one task
- Change class only when change is needed in that specific task or functionality should this class be changed
@ulend
@snapend

---?code=assets/java/singleresponsibility/02-Autonomous.java&lang=java&Title=Good

---?code=assets/java/singleresponsibility/03-FuelEconomy.java&lang=java&Title=Good

---?code=assets/java/singleresponsibility/04-CarClean.java&lang=java&Title=Single reponsibility example

---
@snap[north span-100]
### @color[#ffc34d](Open/Closed principles)
@snapend
@snap[west span-47]
@quote[Open for extension](Clever ppl)
@snapend
@snap[east span-47]
@quote[Closed for modification](Clever ppl)
@snapend
---

---?code=assets/java/openclose/01-Rectangle.java&lang=java&
---?code=assets/java/openclose/02-AreaCalculator.java&lang=java
---?code=assets/java/openclose/03-Circle.java&lang=java
---?code=assets/java/openclose/04-AreaCalculator.java&lang=java
---?code=assets/java/openclose/05-Shape.java&lang=java
@[1-3](interface)
@[5-20](shapes)
---?code=assets/java/openclose/06-AreaCalculator.java&lang=java
---
@snap[north span-100]
### @color[#ffc34d](Liskov Substitution principle)
@snapend
@snap[west span-47]
@quote[The Liskov Substitution Principle is a way of ensuring that inheritance is used correctly](Few students)
@snapend
@snap[east span-47]
@quote[Derived classes must be substitutable for the base class](Few students)
@snapend
---?code=assets/java/liskovsubstitutionprinciple/01-TransportationDevice.java&lang=java
---?code=assets/java/liskovsubstitutionprinciple/02-Car.java&lang=java
---?code=assets/java/liskovsubstitutionprinciple/03-Bicycle.java&lang=java
---
#### To@color[#ffc34d](do)
@ul[list-many-items]
- Check if implemented methods for interface are used
- Create specific interface for specific class
@ulend
---?code=assets/java/liskovsubstitutionprinciple/04-TransportationDevice.java&lang=java
---?code=assets/java/liskovsubstitutionprinciple/05-DeviceNoEngine.java&lang=java
---?code=assets/java/liskovsubstitutionprinciple/06-DeviceWithEngine.java&lang=java
---?code=assets/java/liskovsubstitutionprinciple/07-Car.java&lang=java
---?code=assets/java/liskovsubstitutionprinciple/08-Bicycle.java&lang=java
---
@snap[north span-100]
### @color[#ffc34d](Interface segregation principle)
@snapend
@snap[midpoint]
@quote[Many specific interfaces are better than one general purpose interface.](Few students)
@snapend
---?code=assets/java/interfacesegregationprinciple/01-RestaurantInterface.java&lang=java&Title=Bad
---?code=assets/java/interfacesegregationprinciple/02-OnlineClientImpl.java&lang=java&Title=Bad
---
@snap[midpoint]
#### To@color[#ffc34d](do)
@ul[list-many-items]
- Avoid creating one big interface
- Split interface in parts so every specific interface is responsible for one type of action
@ulend
@snapend
---?code=assets/java/interfacesegregationprinciple/03-PaymentInterface.java&lang=java&Title=Good
@[1-3](seperate interfaces for less responsibility for each)
@[5-7](seperate interfaces for less responsibility for each)
---?code=assets/java/interfacesegregationprinciple/04-InPersonPaymentImpl.java&lang=java&Title=Good
@[1-13](classes implementing Payment interface will not know about orders)
@[15-34](classes implementing Orders interface will not know about payments)

---
@snap[north span-100]
### @color[#ffc34d](Dependency Inversion Principle)
@snapend
@snap[west span-40]
@quote[High-level and low-level modules both depend on abstraction](Few students)
@snapend
@snap[east span-40]
@quote[Abstraction should not depend on details. Details should not depend on abstraction.](Few students)
@snapend
---?code=assets/java/dependencyinversionprinciple/01-BackEndDev.java&lang=java
---?code=assets/java/dependencyinversionprinciple/02-FrontEndDev.java&lang=java
---?code=assets/java/dependencyinversionprinciple/03-Project.java&lang=java
---
#### To@color[#ffc34d](do)
@ul[list-many-items]
- Apply both and @color[#ffc34d](Open/Closed principle) and @color[#ffc34d](Liskov Substitution principle)
- Follow business logic when creating classes and interfaces
@ulend
---?code=assets/java/dependencyinversionprinciple/04-DeveloperInterface.java&lang=java
---?code=assets/java/dependencyinversionprinciple/05-BackEndDev.java&lang=java
---?code=assets/java/dependencyinversionprinciple/06-FrontEndDev.java&lang=java
---?code=assets/java/dependencyinversionprinciple/07-Project.java&lang=java
---
### @color[#ffc34d](Thnx) for your attention! @fa[smile-beam fa-spin]

