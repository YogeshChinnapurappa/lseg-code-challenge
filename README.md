# lseg-code-challenge

==============================
Cumulative Returns Calculator
==============================

Tech-stack :
-----------
  Java - 1.8
  Maven

How to Execute:
---------------
Run Maven : mvn clean install
Run the Main function : com\lseg\CumulativeReturnCalculatorMain.java
 console input : Enter As of Date (YYYY-MM-DD)  [e.g:- 2015-06-30]
 console input : Enter Base Date (YYYY-MM-DD) [e.g:- 2015-02-01]
 IF the date formats are correct, the value printed on the console:
    Cumulative Return Value for the given asof and base date: -0.04366
    
Junit Test cases:
-----------------
All the test cases are implemented as per the PDF example
which can be executed from src\test\java\com\lseg\CumulativeReturnsCalculatorTest.java

Limitation
---------
1) The code does not use any database to store Daily Return Map,
   it is possible to extend to use H2-SQL in-memory database to store the data 
   and provide a query to store differen sets of data
   instead SortedMap was used to store the data as per the example.
2) Logging is not used, as the implementation classes are basic.
3) The code could be refactered to use Java Lambda streams, parallel streams etc.
4) Junit test coverage is based on the sample calculations provided in the example. 

    
Design decision / Assumptions
-----------------------------
Based on the Problem specification to implement Cumulative Return, the following assumptions and decision was made:

The algorithm  is simple calculation, based on cumulative sum, the complexity and time for computation increases as the data increases.
It was possible to use some techniques such as 
1) Recursive function, but this approach could consume more memory as the data grows.
2) Use of Parallel streams (Lambda), Parallel streams could be affective, if data set is very large !00k+

The implementation uses simple sequential processing, with SortedMap.
There are options to improve the solution (Brute force) by using Load runner like Apache Jmeter
setup multiple users (threads) with different inputs and test the load.
This should give expected load based on the threads and data size.

 
 
