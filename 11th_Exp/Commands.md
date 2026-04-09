To compile - 
```
javac -cp lib/junit-platform-console-standalone-1.10.1.jar -d bin src/Calculator.java test/CalculatorTest.java
```

To run unit tests - 
```
java -jar lib/junit-platform-console-standalone-1.10.1.jar execute --class-path bin --scan-class-path --details=tree
```