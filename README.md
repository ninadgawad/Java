# Java 
Java is a set of computer software and specifications developed by **James Gosling** at Sun Microsystems, which was later acquired by the Oracle Corporation, that provides a system for developing application software and deploying it in a cross-platform computing environment

## Java LTS Release Versions 
- Java 19
- Java 17
- Java 11
- Java 8
- Java 7

## Non LTS Release Versions
- Java 20
- Java 18
- Java 16
- Java 15
- Java 14
- Java 13
- Java 12
- Java 10
- Java 9

#### Java 17 New Features: 
- Text Blocks
- Switch Expressions
- Records 
- Sealed Classes
- Helpful NullPointerExceptions 
- Compact Number Formatting Support
- Day Period Support Added
- Stream.toList()

Java 17 will also include support for Unicode 14, the latest version of the Unicode standard. This will bring a number of new characters and symbols to the language, including support for emoji.
### Here are a few more details about some of the features that will be included in Java 17:
- Local Variable Syntax for Lambda Parameters: This feature will allow developers to use the var keyword to declare the type of a lambda parameter. This will make it easier to write concise lambda expressions and reduce boilerplate code.
- Sealed Classes: Java 17 will introduce sealed classes, which are a new kind of class that can only be subclassed by a specific set of classes. This will allow developers to better control the inheritance hierarchy of their code and make it easier to reason about.
- Records: Java 17 will also introduce records, which are a new kind of class that are designed to hold a fixed set of data. Records are essentially a concise way to define simple data classes and will make it easier to create immutable value types.
- Foreign Linker API: Java 17 will include a new Foreign Linker API, which will allow developers to link native libraries and call native functions from Java code. This will enable Java programs to interact with native code and take advantage of features that are not available in the Java platform.
- Networking Improvements: Java 17 will include a number of improvements to the networking API, including support for TLS 1.3 and HTTP/3. These enhancements will improve the performance and security of Java programs that use networking.


#### Java 12 New Features: 
- Switch Expressions
- New String Methods 
- New collector utility
- Compact Number Formatting
- File.mismatch method


### Download Java 
```
wget https://download.oracle.com/java/19/latest/jdk-19_linux-x64_bin.tar.gz
```

### JDK Source Code
https://github.com/openjdk/jdk


## Apache Maven 
Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information. 
- Used for building project and managing third party open source framework dependency for Java apps 

####  To use Maven, you will need to install it on your machine and create a Maven project. You can then configure your project by creating a pom.xml file and specifying the dependencies and build parameters for your project. Once your project is configured, you can use Maven commands to build and manage your project.

Some common Maven commands include:
- Compiles the source code for the project
```
mvn compile
```
- Runs the tests for the project
```
mvn test
```
- Packages the project into a JAR or WAR file
```
mvn package
```
- Installs the project's artifacts in the local repository
```
mvn install
```
- Find dependencies of the project and the dependencies of those dependencies
```
mvn dependency:tree
```

## Links:
- https://www.oracle.com/java/technologies/java-se-support-roadmap.html
- https://www.oracle.com/java/technologies/downloads/
- https://openjdk.java.net/
- https://maven.apache.org/
