PROJECT  = dirwalker

CC       = g++
CFLAGS   = -std=c++2a -masm=intel -O2 -g -Wall -Wextra -Werror
LD       = g++
LDFLAGS  = -lboost_filesystem

BIN      = bin
SRC      = src
OBJ      = build
SOURCES  = $(wildcard $(SRC)/*.cpp)
OBJECTS  = $(patsubst $(SRC)/%.cpp, $(OBJ)/%.o, $(SOURCES))

INCLUDE  = include
INCLUDES = $(addprefix -I,$(INCLUDE))

all: $(PROJECT)

$(PROJECT): $(OBJECTS) $(BIN) $(OBJ)
	$(LD) $(OBJECTS) $(LDFLAGS) -o $(BIN)/$(PROJECT)

$(OBJECTS): $(OBJ)/%.o : $(SRC)/%.cpp
	$(CC) $(CFLAGS) $(INCLUDES) -c $^ -o $@

$(BIN):
	mkdir -p $@

$(OBJ):
	mkdir -p $@

clean:
	rm -fr $(BIN)/$(PROJECT)
	rm -fr $(OBJ)/*
