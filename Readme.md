[![CircleCI](https://circleci.com/github/shandilyaCodes/GitClient.svg?style=svg&circle-token=f0d69b6ca4e3b0780e64ee019792b6b57a6080f1)](<LINK>)


## **Problem Description**

1). Write a REST service in Java which takes a language as input (e.g. rust, go, java, etc.) and provides a JSON output,
    listing all the projects that are using that language in GitHub
    
2). The output shall contain the project id, name, url and the owner login

---

## **Solution & Approach**

1). REST Client implemented using Spring Boot to consume GitHub exposed Search API (https://docs.github.com/en/rest/reference/search#search-repositories) <br/>
2). Swagger Used for the API documentation (Refer the Important Links section in the last) <br/>
3). Heroku used for Cloud Deployment (Refer the Important Links section in the last) <br/>

---

## **API Structure**

---
### **Find Projects By Language Name**

---
URL Structure : localhost:8080/v1/search/project/language/{languageName}/{pageNumber}<br />

Parameter Details : {<br />
                        (String) languageName : Valid Language Name like Java, Go, Javascript etc.<br />
                        (Long) pageNumber : Valid page number 1,2,3,4, etc.<br />
                    }<br />

URL Sample : localhost:8080/v1/search/project/language/java/1<br />

---
### **Find Projects By Language and UserName**

---
URL Structure : localhost:8080/v1/search/project/user/{userName}/{languageName} <br />

Parameter Details : {<br />
                        (String) userName : Valid Github username <br />
                        (String) languageName : Valid Language Name<br />
                    }<br />

URL Sample : localhost:8080/v1/search/project/user/shandilyaCodes/java<br />

---
### **Find Projects By Language and sort**

---
URL Structure : localhost:8080/v1/search/project/sorted/{languageName}/{pageNumber}/{sortingParameter}/{sortingStyle}<br />

Parameter Details : {<br />
                        (String) languageName : Valid Language Name<br />
                        (Long) pageNumber : Valid page number 1,2,3,4, etc.<br />
                        (String) sortingParameter : Possible values {stars, forks, help-wanted-issues, updated}<br />
                        (String) sortingStyle : Possible values {asc, desc}<br />
                    }<br />
                    
URL Sample : localhost:8080/v1/search/project/sorted/java/1/stars/asc<br />

---
### **Instructions to Run the application**

---
-> Clone the repository<br />
-> Navigate to the root folder in a terminal<br />
-> Run the command "mvn spring-boot:run"<br />
-> Once the initialization is completed, access the required REST APIs <br />

---
### **Important Links**

---
Swagger API documentation : http://localhost:8080/swagger-ui/index.html#/<br />
Heroku Deployed API Links : { <br />
https://infa-git-client.herokuapp.com/v1/search/project/language/java/10 <br/>
https://infa-git-client.herokuapp.com/v1/search/project/user/shandilyaCodes/java <br/>
https://infa-git-client.herokuapp.com/v1/search/project/sorted/java/1/stars/desc <br/>
https://infa-git-client.herokuapp.com/v1/search/project/sorted/java/1/forks/asc <br/>
}<br />

---
