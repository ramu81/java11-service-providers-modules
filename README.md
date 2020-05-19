# java11-service-providers-modules

set the path.

PATH=.;c:\Windows\System32;c:\softwares\jdk-14.0.1\bin;C:\Program Files\Notepad++;

create api module 

> mkdir api-module\src\edu\chinna\kadhira\api

create a java file

>start notepad++ api-module\src\edu\chinna\kadhira\api\Calculator.java

create interface module descriptor 

>start notepad++ api-module\src\module-info.java

create api implementation module 

> mkdir api-impl-module\src\edu\chinna\kadhira\apiimpl

create a java file

>start notepad++ api-impl-module\src\edu\chinna\kadhira\apiimpl\CalculatorImpl.java

create interface module descriptor 

>start notepad++ api-impl-module\src\module-info.java

create client module 

> mkdir client\src\edu\chinna\kadhira\client

create a java file

>start notepad++ client\src\edu\chinna\kadhira\client\Client.java

create interface module descriptor 

>start notepad++ client\src\module-info.java

Notes :

Any set of packages or classes can easily be made to play the role of an extension. 
The first step in turning a set of classes into an extension is to bundle them in a JAR file. Once that's done, you can turn the software into an extension in two ways:

	by placing the JAR file in a special location in the directory structure of the Java Runtime Environment, in which case it's called an installed extension.

	by referencing the JAR file in a specified way from the manifest of the another JAR file, in which case it's called a download extension.
	
Installed extensions are JAR files in the lib/ext directory of the Java Runtime  Environment (JRE™) software. As its name implies, the JRE is the runtime portion of the Java Development Kit containing the platform's core API but without development tools such as compilers and debuggers. The JRE is available either by itself or as part of the Java Development Kit.



A service is a well-known interface or class for which zero, one, or many service providers exist. A service provider (or just provider) is a class that implements or subclasses the well-known interface or class. A ServiceLoader is an object that locates and loads service providers deployed in the run time environment at a time of an application's choosing. Application code refers only to the service, not to service providers, and is assumed to be capable of differentiating between multiple service providers as well as handling the possibility that no service providers are located.
