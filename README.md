# Exception Handling in Spring Boot

Exception Handling in Spring Boot leverages some principle of Aspect Oriented Progamming .

1.Separation of Concerns: Exception handling logic is separated from business logic.

2.Modularity: Exception handling is modularized into separate classes or methods, making the codebase easier to maintain.

There are two types of exception handling in Spring Boot:

1. Local Exception
2. Global Exception

1.Local Exception : This exception is particular to specific RestController class only

2.Global Exception : This exception is for the whole project.

Following are the Annotations for Exception handling in spring Boot

1.@ExceptionHandler : method level annotation

2.@RestControllerAdvice : This annotation is use at class level for making that class a globalException handler

