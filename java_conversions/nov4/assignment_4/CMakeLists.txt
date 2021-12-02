cmake_minimum_required(VERSION 3.8)

project(line)
set(TARGET line)

set(CMAKE_C_STANDARD   99)
set(CMAKE_CXX_STANDARD 20)

#find_package(Threads REQUIRED)

include_directories(${TARGET} include)

set(SOURCE_DIR "src")
set(INCLUDE_DIR "include")
set(SOURCES
    ${SOURCE_DIR}/Main.cpp
    ${SOURCE_DIR}/Line.cpp
    ${INCLUDE_DIR}/Line.hpp
)


add_executable(${TARGET} ${SOURCES})

#target_link_libraries(${TARGET} PUBLIC pthread)
