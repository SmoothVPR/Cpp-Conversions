# Assignment 6

### Lambdas
- [ ] Fix the below Singleton class:
<code>
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public static class SampleSingleton {
    private static Connection conn = null;
    private static SampleSingleton instance = null;
    
    public static SampleSingleton getInstance() {
        return instance;
    }
}
</code>

### Make Tests & Run
```
make tests
```

### Build & Run (Linux)
```
make     # requires java jdk 8+
./run.sh
```
