PROJECT  = assignment_2

JC       = javac
JAR      = jar
JFLAGS   =
JARFLAGS = cvfm

PACKAGE  = com/ss/assn/two
MANIFEST = manifest.txt

SRC      = src/$(PACKAGE)
OBJ      = bin
SOURCES  = $(wildcard $(SRC)/*.java)
OBJECTS  = $(patsubst $(SRC)/%.java, $(OBJ)/$(PACKAGE)/%.class, $(SOURCES))

all: $(PROJECT)

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

clean:
	rm -fr $(OBJ)
	rm -f  $(MANIFEST)
	rm -f  $(PROJECT).jar
