PROJECT  = singleton

CMAKE    = /bin/cmake
CMAKE_FLAGS =

BIN      = bin
BUILD    = build

SRC      = src
OBJ      = $(BUILD)/CMakeFiles/$(PROJECT).dir/$(SRC)
SOURCES  = $(wildcard $(SRC)/*.cpp)
OBJECTS  = $(patsubst $(SRC)/%.cpp,$(OBJ)/%.cpp.o,$(SOURCES))

INCLUDE  = include
INCLUDES = $(addprefix -I,$(INCLUDE))

all: $(PROJECT)

$(PROJECT): $(BIN) $(BUILD) $(OBJECTS)
	mv $(BUILD)/$(PROJECT) $(BIN)/$(PROJECT)

$(OBJECTS): $(OBJ)
	$(CMAKE) --build $(BUILD)

$(OBJ):
	$(CMAKE) . $(CMAKE_FLAGS) -B $(BUILD)

$(BIN):
	mkdir -p $@

$(BUILD):
	mkdir -p $@

clean:
	rm -fr $(BIN)/$(PROJECT)
	rm -fr $(BUILD)/*
