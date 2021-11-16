# Assignment 1

### Basic lambdas (Sort string array)
- [x] length (i.e., shortest to longest)
- [x] reverse length (i.e., longest to shortest)
- [x] alphabetically by the first character only
- [x] Strings that contain “e” first, everything else second. For now, put the code directly in the lambda.
- [x] Redo the previous problem, but use a static helper method so that your lambda looks like this:
      Arrays.sort(words, (s1,s2) -> Utils.yourMethod(s1,s2))
- [x] Using Java 8 features write a method that returns a comma separated string based on a given list of  
      integers. Each element should be preceded by the letter 'e' if the number is even, and preceded by  
      the letter 'o' if the number is odd.
- [x] Given a list of Strings, write a method that returns a list of all strings that start with the letter  
  'a' (lower case) and have exactly 3 letters. 

### Make Tests & Run
```
make tests
```

### Build & Run (Linux)
```
make     # requires java jdk 8+
./run.sh
```
