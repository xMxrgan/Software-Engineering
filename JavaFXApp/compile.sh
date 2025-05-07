#!/bin/bash

JAVAFX_LIB="javafx-sdk-24.0.1/lib"

echo "🛠 Compilazione..."
mkdir -p bin

javac \
  --module-path "$JAVAFX_LIB" \
  --add-modules javafx.base,javafx.controls,javafx.fxml,javafx.graphics,javafx.media,javafx.web \
  -d bin \
  src/com/Main.java \
  src/com/view/ViewNavigator.java
