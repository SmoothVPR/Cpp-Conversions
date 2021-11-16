PROJECT   = assignment_2

JC        = javac
JAR       = jar
JFLAGS    = -cp resources/junit-4.12.jar:resources/hamcrest-core-1.3.jar
JARFLAGS  = cvfm

PACKAGE   = com/ss/assn/two
MANIFEST  = manifest.txt

SRC       = src/$(PACKAGE)
OBJ       = bin
SOURCES   = $(filter-out %Test.java, $(wildcard $(SRC)/*.java))
OBJECTS   = $(patsubst $(SRC)/%.java, $(OBJ)/$(PACKAGE)/%.class, $(SOURCES))

TEST      = test
TESTS     = $(wildcard $(SRC)/Utils*.java)
TESTOBJS  = $(patsubst $(SRC)/Utils%.java, $(BIN)/$(PACKAGE)/Utils%.class, $(TESTS))
TESTFLAGS = -cp resources/junit-4.12.jar:resources/hamcrest-core-1.3.jar

all: $(PROJECT)
tests: $(TEST)

$(PROJECT): $(OBJECTS) $(MANIFEST)
	$(JAR) $(JARFLAGS) $(PROJECT).jar $(MANIFEST) $(OBJECTS) 

$(OBJECTS): $(OBJ)
	$(JC) $(JFLAGS) $(SOURCES) -d $(OBJ)

$(MANIFEST):
	@echo "Manifest-Version: 1.0"                     > manifest.txt
	@echo "Class-Path: $(OBJ)/"                      >> manifest.txt
	@echo "Main-Class: $(subst /,.,$(PACKAGE)).Main" >> manifest.txt
	@echo ""                                         >> manifest.txt

$(OBJ):
	mkdir -p $@

$(TEST): $(OBJ) $(TESTOBJS)
	java $(TESTFLAGS):$(OBJ):. org.junit.runner.JUnitCore $(subst /,.,$(PACKAGE)).UtilsTest

$(TESTOBJS):
	$(JC) $(TESTFLAGS) $(TESTS) -d $(OBJ)

clean:
	rm -fr $(shell find . -name "**.class")
	rm -f  $(MANIFEST)
	rm -f  $(PROJECT).jar
