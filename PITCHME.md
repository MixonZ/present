
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
@ul[list-many-items]
## Single Responsibility principles
- A class should have only one reason to change
- A class should have only one responsibility
---

---?code=assets/Java/01-Employee.java&lang=java&Title=Bad
@[1-5](Simple Employee class)
@[6-8](Bad method nr1)
@[9-11](Bad method nr2)

---
## Todo
@ul[list-many-items]
- One class doing one task
- Change class only when change is needed in that specific task or functionality should this class be changed
---

---?code=assets/Java/SingleResponsibility/02-HRPromotions.java&lang=java&Title=Good

---?code=assets/Java/SingleResponsibility/03-FinITCalculations.java&lang=java&Title=Good

---?code=assets/Java/SingleResponsibility/04-EmployeeClean.java&lang=java&Title=Single reponsibility example

---

---
---?code=assets/Java/OpenClose/01-Rectangle.java&lang=java
---?code=assets/Java/OpenClose/02-AreaCalculator.java
---?code=assets/Java/OpenClose/03-Circle.java
---?code=assets/Java/OpenClose/04-AreaCalculator.java
@[1-4](modification)
@[5-8](modification)
---?code=assets/Java/OpenClose/05-Shape.java
@[1-3](interface)
@[5-18](shapes)
---?code=assets/Java/OpenClose/06-AreaCalculator.java

