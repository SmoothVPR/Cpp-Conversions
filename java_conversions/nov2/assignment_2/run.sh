#!/bin/sh

if [ -f ./Main.class ]
then
    java Main
else
    echo "run 'make' first"
fi
