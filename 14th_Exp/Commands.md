```
<build>
    <plugins>
        <plugin>
            <groupId>org.jacoco</groupId>
            <artifactId>jacoco-maven-plugin</artifactId>
            <version>0.8.11</version>
            <executions>
                <execution>
                    <goals>
                        <goal>prepare-agent</goal>
                    </goals>
                </execution>
                <execution>
                    <id>report</id>
                    <phase>test</phase>
                    <goals>
                        <goal>report</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>

```

- mvn clean test

- Complete Calculator.java
```
Calculator.java
package SimpleCalculator;

	public class Calculator {

	    public int add(int a, int b) {
	        return a + b;
	    }

	    public int subtract(int a, int b) {
	        return a - b;
	    }

	    public int multiply(int a, int b) {
	        return a * b;
	    }

	    public int divide(int a, int b) {
	        if (b == 0) {
	            throw new ArithmeticException("Division by zero is not allowed.");
	        }
	        return a / b;
	    }
	}
```

- Completed CalculatorTest.java
```
package SimpleCalculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class CalculatorTest {

	 Calculator cal=new Calculator();
    @Test
    public void testAdd() {
        int result = cal.add(2, 3);
        assertEquals(5, result);
    }
    @Test
    public void testSubtract() {
        int result = cal.subtract(5, 2);
        assertEquals(3, result);
    }
    @Test
    public void testMultiply() {
        int result = cal.multiply(4, 5);
        assertEquals(20, result);
    }
    @Test
    public void testDivide() {
        int result = cal.divide(10, 2);
        assertEquals(5, result);
    }
    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            cal.divide(10, 0);
        });
}
}
```

- mvn clean test, mvn clean verify