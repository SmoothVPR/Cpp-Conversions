#!/bin/sh

if [ -f ./assignment_4.jar ]
then
    java -jar assignment_4.jar
else
    echo "run 'make' first"
fi
