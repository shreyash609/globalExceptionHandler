
# Exception Handling in Spring Boot

There are two types of exception handling in Spring Boot:

1. Local Exception
2. Global Exception

1.Local Exception : This exception is particular to specific RestController class only

2.Global Exception : This exception is for the whole project.

Following are the Annotations for Exception handling in spring Boot

1.@ExceptionHandler : method level annotation

2.@RestControllerAdvice : This annotation is use at class level for making that class a globalException handler

