#!/bin/sh

if [ -f ./assignment_5.jar ]
then
    java -jar assignment_5.jar
else
    echo "run 'make' first"
fi
