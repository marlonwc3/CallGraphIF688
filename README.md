# CallGraph
This project was developed to Compilers discipline (IF688) at Centro de Informática of Universidade Federal de Pernambuco.
Using WALA we built a Call Graph representation of three java codes and using JUnit we made unit tests to ensure their results.


### Pre-requisits

- Watson Libraries for Analysis ( WALA )
  - Version: 1.3.5
  - We've included the four basic projects of WALA into this project, so you will not need to download WALA.
  - You can get more informations about WALA at: http://wala.sourceforge.net/wiki/index.php/Main_Page
  
- Eclipse 3.7
  - You can download Eclipse 3.7 at oracle official website:     http://www.eclipse.org/downloads/packages/eclipse-classic-37/indigor
  
- JRE 1.6 
  - You can download JRE 1.6 at oracle official website: http://www.oracle.com/technetwork/java/javase/downloads/java-archive-downloads-javase6-419409.html

- JUnit 4
  - Embedded in Eclipse 3.7 Sdk
  - But you can download JUnit official website: http://junit.org/

### Configuration


- At eclipse and import the four projects at WALA folder and CallGraphTester project.
  
- At com.ibm.wala.core project, go into dat package and change wala.properties file, 
  - put an absolute path to JRE 1.6 at: java_runtime_dir, getting something like this:
    -   java_runtime_dir = /home/CIN/mras/Documents/CallGraph/jre1.6.0_45

###  Tests
  - All tests are defined at tests package of CallGraphTester project
  - Three java codes are used as sample and they can be find at sample package
  - GraphConstructionsTests: Tests the basic construction of graphs representations
  - SanityTests: Has an objective of test if the basic expected structure of the graphs are correct.
  - DetailsTests: Some especific test about the sample like:
    - Verify if a method that was never invoked by any other method exists on the graph
    - Verify if all initializers exist on the graph
    - Verify if there is a mutual (simple) recursion between a function that has a recursive structure, such as Euclidean Algorithm for finding the Greatest Common Divisor between two numbers.
    - Verify if there is an edge from an overrided function to his parent function using super acessor
  - These tests can be useful to get informations about the code structure and verify if all behaviors about the call graph are working as expected.
  - You can run all tests executing AllTests

### Contact
  - You can find me at: mras@cin.ufpe.br
  


###### Thanks :)
  
  

