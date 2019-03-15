
# S-O-L-I-D
---

@snap[span-55]
@ul[list-many-items]
- Single Responsibility
- Open-close
- Liskov substitution principle
- Interface segregation principle
- Dependencies inversion principle
@ulend
@snapend

---
@snap[west span-55]
@ul[list-many-items]
## Single Responsibility principles
- A class should have only one reason to change
- A class should have only one responsibility
@ulend
@snapend
---

---?code=assets/java/singleresponsibility/01-Car.java&lang=java
@[1-5](Simple Car class)
@[6-8](Bad method nr1)
@[9-11](Bad method nr2)
---
## Todo
@snap[westspan-55]
@ul[list-many-items]
- One class doing one task
- Change class only when change is needed in that specific task or functionality should this class be changed
@ulend
@snapend
---
---?code=assets/java/singleresponsibility/02-Autonomous.java&lang=java&Title=Good

---?code=assets/java/singleresponsibility/03-FuelEconomy.java&lang=java&Title=Good

---?code=assets/java/singleresponsibility/04-CarClean.java&lang=java&Title=Single reponsibility example
---
##OpenClosed
---?code=assets/java/openclose/01-Rectangle.java&lang=java
---?code=assets/java/openclose/02-AreaCalculator.java&lang=java
---?code=assets/java/openclose/03-Circle.java&lang=java
---?code=assets/java/openclose/04-AreaCalculator.java&lang=java
@[1-4](modification)
@[5-8](modification)
---?code=assets/java/openclose/05-Shape.java&lang=java
@[1-3](interface)
@[5-18](shapes)
---?code=assets/java/openclose/06-AreaCalculator.java&lang=java
---
##Liskov substitution principle
---
## Interface segregation principle
@snap[west span-55]
@ul[list-many-items]
- Many specific interfaces are better than one general purpose interface
@ulend
@snapend
---
## Todo
@ul[list-many-items]
- Avoid creating one big interface
- Split interface in parts so every specific interface is responsible for one type of action
@ulend
---
---?code=assets/java/interfacesegregationprinciple/01-RestaurantInterface.java&Title=Bad
---?code=assets/java/interfacesegregationprinciple/02-OnlineClientImpl.java&Title=Bad
---
## Todo
@ul[list-many-items]
- Avoid creating one big interface
- Split interface in parts so every specific interface is responsible for one type of action
@ulend
---
---?code=assets/java/interfacesegregationprinciple/03-PaymentInterface.java&Title=Good
@[1-3](seperate interfaces for less responsibility for each)
@[5-7](seperate interfaces for less responsibility for each)
---?code=assets/java/interfacesegregationprinciple/04-InPersonPaymentImpl.java&Title=Good
@[1-13](classes implementing Payment interface will not know about orders)
@[15-34](classes implementing Orders interface will not know about payments)
