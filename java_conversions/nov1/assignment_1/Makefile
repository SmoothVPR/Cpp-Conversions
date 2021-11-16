PROJECT = formatting

CC      = g++
CFLAGS  = -std=c++2a -masm=intel -O2 -g -Wall -Wextra -Werror
LD      = g++
LDFLAGS = # NONE

BIN     = bin
SRC     = src
OBJ     = build
BUILD   = $(OBJ)
SOURCES = $(wildcard $(SRC)/*.cpp)
OBJECTS = $(patsubst $(SRC)/%.cpp, $(OBJ)/%.obj, $(SOURCES))

all: formatting

formatting: $(OBJECTS) $(BUILD) $(BIN)
	$(LD) $(OBJECTS) -o $(BIN)/$(PROJECT)

$(OBJECTS): $(OBJ)/%.obj : $(SRC)/%.cpp
	$(CC) $(CFLAGS) -c $^ -o $@

$(BUILD):
	mkdir -p $@

$(BIN):
	mkdir -p $@

clean:
	rm -f $(OBJECTS)
	rm -f $(PROJECT)
