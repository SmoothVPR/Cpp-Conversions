cmake_minimum_required(VERSION 3.8)

project(deadlock)
set(TARGET deadlock)

set(CMAKE_C_STANDARD   99)
set(CMAKE_CXX_STANDARD 20)

set(SOURCE_DIR "src")
set(SOURCES
    ${SOURCE_DIR}/Main.cpp
)

find_package(Threads REQUIRED)

add_executable(${TARGET} ${SOURCES})

target_link_libraries(${TARGET} PUBLIC pthread)
