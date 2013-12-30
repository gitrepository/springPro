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
