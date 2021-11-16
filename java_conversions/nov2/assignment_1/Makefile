PROJECT = assignment_1

JC      = javac

SRC     = .
OBJ     = .
SOURCES = $(wildcard *.java)
OBJECTS = $(patsubst %.java, %.class, $(SOURCES))

all: $(OBJECTS)

$(OBJECTS): $(SOURCES)
	$(JC) $(SOURCES)

clean:
	rm -f $(OBJECTS)
