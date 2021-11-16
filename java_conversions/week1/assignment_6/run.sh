#!/bin/sh

if [ -f ./assignment_6.jar ]
then
    java -jar assignment_6.jar
else
    echo "run 'make' first"
fi
