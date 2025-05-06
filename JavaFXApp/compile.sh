#!/bin/bash

JAVAFX_LIB="lib/javafx-sdk-24.0.1/lib"

echo "🛠 Compilazione..."
mkdir -p bin

javac \
  --module-path "$JAVAFX_LIB" \
  --add-modules javafx.controls,javafx.fxml \
  -d bin \
  src/com/Main.java
