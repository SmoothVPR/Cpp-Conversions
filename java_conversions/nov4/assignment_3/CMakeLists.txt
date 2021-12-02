cmake_minimum_required(VERSION 3.8)

project(economy-sim)
set(TARGET economy-sim)

set(CMAKE_C_STANDARD   99)
set(CMAKE_CXX_STANDARD 20)

include_directories(${TARGET} include)

set(SOURCE_DIR "src")
set(INCLUDE_DIR "include")
set(SOURCES
    ${SOURCE_DIR}/Main.cpp
    ${INCLUDE_DIR}/Producer.hpp
    ${INCLUDE_DIR}/Consumer.hpp
)

find_package(Threads REQUIRED)

add_executable(${TARGET} ${SOURCES})

target_link_libraries(${TARGET} PUBLIC pthread)
