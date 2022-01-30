#!/usr/bin/env bash

docker-compose down

if ./gradlew build -x check; then
   docker-compose build
   docker-compose up
else
   echo "build failed"
fi
