## **Description**

1). Write a REST service in Java which takes a language as input (e.g. rust, go, java, etc.) and provides a JSON output,
    listing all the projects that are using that language in GitHub
    
2). The output shall contain the project id, name, url and the owner login

---

## **API Structure**

---
### **Find Projects By Language Name**

---
URL Structure : localhost:8080/v1/search/project/language/{languageName}/{pageNumber}

Parameter Details : {
                        (String) languageName : Valid Language Name like Java, Go, Javascript etc.
                        (Long) pageNumber : Valid page number 1,2,3,4, etc.
                    }

URL Sample : localhost:8080/v1/search/project/language/java/1

---
### **Find Projects By Language and UserName**

---
URL Structure : localhost:8080/v1/search/project/user/{userName}/{languageName}

Parameter Details : {
                        (String) userName : Valid Github username 
                        (String) languageName : Valid Language Name
                    }

URL Sample : localhost:8080/v1/search/project/user/shandilyaCodes/java

---
### **Find Projects By Language and sort**

---
URL Structure : localhost:8080/v1/search/project/sorted/{languageName}/{pageNumber}/{sortingParameter}/{sortingStyle}

Parameter Details : {
                        (String) languageName : Valid Language Name
                        (Long) pageNumber : Valid page number 1,2,3,4, etc.
                        (String) sortingParameter : Possible values {stars, forks, help-wanted-issues, updated}
                        (String) sortingStyle : Possible values {asc, desc}
                    }
                    
URL Sample : localhost:8080/v1/search/project/sorted/java/1/stars/asc

---
### **Instructions to Run the application**

---
-> Clone the repository
-> Navigate to the root folder in a terminal
-> Run the command "mvn spring-boot:run"
-> Once the initialization is completed, access the required REST APIs 

---
### **Important Links**

---
Swagger API documentation : http://localhost:8080/swagger-ui/index.html#/

---
