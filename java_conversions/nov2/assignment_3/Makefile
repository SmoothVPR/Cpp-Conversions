PROJECT  = shapes

CC       = g++
CFLAGS   = -std=c++2a -O2 -g -pedantic -Wall -Wextra -Werror
LD       = g++
LDFLAGS  =

BIN      = bin
SRC      = src
OBJ      = build
BUILD    = $(OBJ)
SOURCES  = $(wildcard $(SRC)/*.cpp)
OBJECTS  = $(patsubst $(SRC)/%.cpp, $(OBJ)/%.obj, $(SOURCES))

INCLUDE  = include
INCLUDES = $(addprefix -I,$(INCLUDE))

all: $(PROJECT)

$(PROJECT): $(BIN) $(BUILD) $(OBJECTS) 
	$(LD) $(OBJECTS) $(LDFLAGS) -o $(BIN)/$(PROJECT)

$(OBJECTS): $(OBJ)/%.obj : $(SRC)/%.cpp
	$(CC) $(CFLAGS) $(INCLUDES) -c $^ -o $@

$(BIN):
	mkdir -p $@

$(BUILD):
	mkdir -p $@

clean:
	rm -fr $(BIN)/$(PROJECT)
	rm -fr $(OBJ)/*
