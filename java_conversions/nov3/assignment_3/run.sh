#!/bin/sh

if [ -f ./assignment_3.jar ]
then
    java -jar assignment_3.jar $@
else
    echo "run 'make' first"
fi
