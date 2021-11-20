cmake_minimum_required(VERSION 3.8)

project(Singleton)
set(TARGET Singleton)

# Set standards
set(CMAKE_C_STANDARD   99)
set(CMAKE_CXX_STANDARD 20)

# Search for dependencies
find_package(Threads REQUIRED)

# Set Includes
set(SOURCE_DIR src)
set(SOURCES
    ${SOURCE_DIR}/Main.cpp
    ${SOURCE_DIR}/Singleton.cpp
)

# Set includes
include_directories(${TARGET} include)

# Output file
add_executable(${TARGET} ${SOURCES})

# Link dependencies
target_link_libraries(${TARGET} PRIVATE pthread)
