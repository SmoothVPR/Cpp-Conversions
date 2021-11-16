# TEMPLATE
PROJECT = PROJECT

CC      = g++
LD      = g++
CFLAGS  = -std=c++2a -O2 -g -pedantic -Wall -Wextra -Werror
LDFLAGS = 

BIN     = bin
SRC     = src
OBJ     = build
BUILD   = $(OBJ)
SOURCES = $(wildcard $(SRC)/*.cpp)
OBJECTS = $(patsubst $(SRC)/%.cpp, $(OBJ)/%.obj, $(SOURCES))

all: $(PROJECT)

$(PROJECT): $(OBJECTS) $(BUILD) $(BIN)
	$(LD) $(OBJECTS) $(LDFLAGS) -o $(BIN)/$(PROJECT).exe

$(OBJECTS): $(OBJ)/%.o : $(SRC)/%.cpp
	$(CC) $(CFLAGS) -c $^ -o $@

$(BUILD):
	mkdir -p $@

$(BIN):
	mkdir -p $@

clean:
	rm -fr $(OBJECTS)
	rm -fr $(BIN)/$(PROJECT)
