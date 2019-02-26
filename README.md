# ======== Problem Statement =======
Build a RESTful WebService for employee CRUD operation and expose through Apache Camel.
- Create a new  employee
- Update existing employee
- Get all employee


# ======== Solution =======

# Step-1: Build
- Clone GIT Repository locally using this URL ->  https://github.com/pankaj358/empmgmt.git
- Import project in eclipse as maven/spring/springboot
- Open console for parent folder 
- Fire "run mvn clean & build"
- After build success you will have package inside {otherPath}/empmgmt/target


# Step-2: Run
- Pick the jar from target [empmgmt-0.0.1.jar]
- move where you want to run provided we have java8 install on target location
- run using java -jar empmgmt-0.0.1.jar

# Step-3: Test
- Add team using below api 
  -  "http://localhost:8080/emp-mgmt/employee" single Add - HttpMethodType.POST
   {
	"firstName" : "John",
	"lastName" : "Smith"
  }

- Generate Schedule using below url
   "  http://localhost:8080/emp-mgmt/employee" - HttpMethodType - Get
   
# ======== Technology Use =======
 Java8
 SpringBoot
 Apache Camel
 Postgresql
 hibernate
 Dozer
 Lombark
 