# Assignment-CAW
Assignment 1 UI Testing part is covered in BaseClass.Java,ObjectClass.java,Teask.Java and CusListeners.java.
BaseClass.java--> This class contains information related to basic initialisation of browser and setup the browser, implicit timeouts and screenshot methods.
ObjectClass.java--> This class contains the object repo of all the webelements which are to be interacted with during the test case validation.
CusListeners.java--> This class implements ITestListener interface and extends base class for taking screenshot.
Teask.java--> This class contains all the testvlidation and assertion written in different blocks of Tests.
Test-Output--> This folder contains html report of the last run in which all the tests passed.

Assignment 2 API Testing part is covered in Apitest.Java,ApitestII.java and Payload.java.
Payload.java--> It contains the body which needs to be sent in post request.
Apitest.Java --> This class contains test validation tasks from Task#1 to Task#3.
Apitest.JavaII --> This class contains test validation tasks for Task#4 and Tsk#5.
The post request for Add Contact is throwing error that's the reason I wrote the tests in separate class.
Task5 includes deleting the request and fetching the earlier post request from Task 4.As task 5 depends on 
Task 4 so I wrote both the scripts together.As the task4 script is failing that's why task5 is also unimplemented.
However, I have written complete code logic for validation of both the tasks.
