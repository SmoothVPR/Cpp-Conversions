# Datetime API

### Date-Time API Questions
Q: <b>Which class would you use to store your birthday in years, months, days, seconds, and nanoseconds?</b>  
A: using the LocalDateTime class  

Q: <b>Given a random date, how would you find the date of the previous Thursday?</b>  
A: 
<code>
import java.time.\*;
LocalDateTime data;
System.out.println("The date of the previous Thurdsday is: " +
                   date.with(TemporalAdjuster.previous(DayOfWeek.THURDSDAY)));
</code>

Q: <b>What is the difference between a ZoneId and a ZoneOffset?</b>  
A: The ZoneId class takes into account Daylightsavings, regional time rules, etc...  

Q: <b>How would you convert an Instant to a ZonedDateTime? How would you convert a ZonedDateTime to an Instant?</b>  
A: 
<code>
ZonoedDateTime datetime = ZonedDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
</code>
       
### Date-Time API Functions
- [ ] Write an example that, for a given year, reports the length of each month within that year.
- [ ] Write an example that, for a given month of the current year, lists all of the Mondays in that month.
- [ ] Write an example that tests whether a given date occurs on Friday the 13th.

### Make Tests & Run
```
make tests
```

### Build & Run (Linux)
```
make
./bin/datetime
```
