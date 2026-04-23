- Create repo in github and push BankService.java
- Open Jenkins > New Item > Freestyle Project > Ok
- Source Code Management select Git
- Enter repo URL
- Add credentials
- Specify branch (master / main)
- Triggers > Select Github hook trigger for GitSCM Polling
- Schedule > * * * * *
- Build Step > Add build step > Execute Windows Batch Command, enter - 
```
javac BankService.java
java BankService
```
- Build Now
- Make changes to code and push again (change balance)
- Should automatically trigger build