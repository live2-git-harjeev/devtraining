:closed_book: **AOP Aspect Oriented Programming**  

:label: ***key concpets in spring***
- Spring IoC Container
- AOP framework

:label: **AOP**
- Aspects enable the modularization of crosscutting concerns
  - logging,
  - transaction management
  - data validation
- key uint of modularity in OOPS is the Class
- key uint of modularity in AOP is the Aspect
- externalizes the cross cutting concerns
- Spring IoC container does not depend on AOP

:label: AOP Concepts
1. `Aspect`
   1. A modularization of a concern that cuts across multiple classes.
   2. Logging, transaction management are good examples
   3. Aspects are implemented by
      1. using regular classes (the schema-based approach)
      2. using regular classes with @Aspect annotation (the AspectJ Style)

2. `Join Point`
   1. A point during the execution of a program
   2. The execution may be a method execution, changing of a variable, or the occurance of an exception
   3. In Spring AOP Join Point represents only a method execution.  
   
3. `Advice`
   1. Action taken by an aspect at a particular JoinPoint
   2. Different types of Advices
      1. before advice
      2. after advice
      3. around advice
      4. after throwing advice
      5. after (finally) advice
4. `Pointcut`
   1. An expression or predicate that matches join points
   2. An Advice
      1. is associaed with a pointcut expression
      2. runs at JoinPoints matched by the pointcut
   3. The concept of join points
      1. as matched by pointcut expressions is central to AOP
      2. and Spring uses AspectJ pointcut expression language

:label: ***Types of Advices***  
1. `Before Advice`
   1. runs before a join point
   2. does not have the ability to prevent execution flow preceding the join point (unless an exception is thrown)
2. `After returning Advice`
   1. after joinpoint completes normally
   2. when  method returns successfully without throwing an exception
3. `After throwing  Advice`
   1. when  method returns by throwing an exception
4. `After (finally) Advice`   
   1. executes on successful execution or exception
   2. (normal or exceptional return)
5. `Around Advice`
   1. surround a join point such as a method invocation
   2. can perform custom behaviour
   3. mainly responsible for choosing
      1. whether it has to proceed to joinpoint
      2. to shortcut the advised method execution 
         1. by returning its own value
      3. throwing an exception