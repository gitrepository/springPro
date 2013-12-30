###-###
RTB04:
Logging - SLF4J (log4j)
Implemented Simple Logging Facade 4 Java.
SLF4J actual binding is of type [org.slf4j.impl.Log4jLoggerFactory]
Configuring log4j by adding it's log4j.properties file in class path 
-(place it in main/resources folder).


###-##
RTB03:
@Controller flow implementation PhoneBookController
Spring tag usage. Using <spring:url value="/pb" /> automatically appends
-application context before URL value (sp)
-jsessionid at the end of URL value (;jsessionid=8E...)

<!--Activates various annotations to be detected in bean classes -->
<context:annotation-config />

<!--The controllers are auto detected POJOs labeled with the @Controller annotation.-->
<context:component-scan base-package="com"/>

<!-- Configures the annotation-driven Spring MVC Controller 
	 programming model. Note that, with Spring 3.0, this tag works in 
	 Servlet MVC only! -->
<mvc:annotation-driven />

<!-- Defines a simple Controller that selects a view to render the response -->
<mvc:view-controller path="/" view-name="welcome"/>


###-##
RTB02:
Basic Spring MVC setup. index.html removed and application page loaded by Spring MVC config.

springPoc-servlet.xml: This config file defines Spring Application context.
Based on the configuration springPoc (DispatcherServlet) handles all the requests (as defined by it's mapping).

<mvc:view-controller path="/" view-name="welcome"/> to forward to welcome.jsp without a controller.
The above config makes spring mvc provide a dummy controller.

###-###
RTB01:
Basic web app: This has just the index.html page deployed onto the server. Maven Structure followed.
