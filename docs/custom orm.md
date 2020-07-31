:beginner: **BUILDING A CUSTOM ORM**  
:label: Understanding the user story
1. Fetch information from the database and populate in the model  
2. selectQuery() in the CustomORM (Metamodel) which will take any select query 
3. select * from actor, select * from films
4. populate into our model (Actor,Films)

:one: Set up the database (sakila on MySQL)  
```sql
select * from actor;
select * from film;
```
:two: create DatabaseColumn annotation 
- use @interface to create annotation 
```java
package reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//RetentionPolicy.CLASS : Annotations are to be recorded in the class file by the compiler but need not be retained by the VM at run time. This is the default behavior.
//RetentionPolicy.SOURCE : Annotations are to be discarded by the compiler.
//RetentionPolicy.RUNTIME : Annotations are to be recorded in the class file by the compiler and retained by the VM at run time, so they may be read reflectively.
@Retention(RetentionPolicy.RUNTIME)
public @interface DatabaseColumn {
    public String columnName();
}

```
:three: set up the DatabaseType & DatabaseType utilities

:four: create the Actor model   

