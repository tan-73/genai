- mvn --version
- mvn archetype:generate
- 2309 : enter
- 9 : enter
- groupId : com.bnmit
- artifactId : sample-app
- version : enter
- package : com.bnmit
- press y
- under src > app.java replace with BankService.java
- mvn site
- From /sample-app, run - 
- mvn clean
- mvn package
- From /target, run
```
java -cp sample-app-1.0-SNAPSHOT.jar com.bnmit.BankService
```