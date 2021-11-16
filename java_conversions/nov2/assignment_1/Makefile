PROJECT = command-line-sum

CC      = g++
CFLAGS  = -std=c++2a -g -pedantic -Wall -Wextra -Werror
LD      = g++
LDFLAGS = # NONE

BIN     = bin
SRC     = src
OBJ     = build
SOURCES = $(wildcard $(SRC)/*.cpp)
OBJECTS = $(patsubst $(SRC)/%.cpp, $(SRC)/%.obj, $(SOURCES))

all: $(OBJECTS)

$(OBJECTS): $(SOURCES)
	$(CC) $(SOURCES) -o $(BIN)/$(PROJECT)

clean:
	rm -f $(OBJECTS)
	rm -f $(BIN)/$(PROJECT)
