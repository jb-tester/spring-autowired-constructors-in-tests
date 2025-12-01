## Spring Autowired Constructors in Tests

0. No validation for the @Autowired annotation presence in the test class constructors
1. ~~Gutter icons in the test class constructors are not shown~~  - fixed
2. @TestConstructor annotation is not supported (as a part of (0) support)
3. spring.test.constructor.autowire.mode property (as a part of (0) support)
4. spring.properties file support (as a part of (3) support). It is now treated just as a regular properties file
5. beans autowiring via the test method parameters is not supported yet
* https://youtrack.jetbrains.com/issue/IDEA-269662/Spring-Testing-no-gutter-navigation-icons-and-or-errors-are-shown-for-the-autowired-constructors-in-the-test-classes
* https://youtrack.jetbrains.com/issue/IDEA-375086/Spring-Testing-check-autowiring-in-test-classes-considering-the-TestConstructor-and-spring.test.constructor.autowire.mode
* https://youtrack.jetbrains.com/issue/IDEA-308042/Spring-Boot-spring.properties-file-should-be-supported
* https://youtrack.jetbrains.com/issue/IDEA-382757/Spring-Testing-support-the-beans-autowiring-in-the-test-methods-parameters

== spring-autowired-constructors-in-tests
== by irina on 6/26/2025

   
 