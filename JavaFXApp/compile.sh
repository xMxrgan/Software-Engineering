#!/bin/bash

JAVAFX_LIB="javafx-sdk-24.0.1/lib"
SQLITE_LIB="sqlite-jdbc-3.49.1.0"

echo "🛠 Compilazione..."
mkdir -p bin

javac \
  --module-path "$JAVAFX_LIB:$SQLITE_LIB" \
  --add-modules javafx.base,javafx.controls,javafx.fxml,javafx.graphics,javafx.media,javafx.web \
  -d bin \
  src/com/Main.java \
  src/com/view/ViewNavigator.java \
  src/com/model/UserRepository.java \
  src/com/model/User.java \
  src/com/model/DatabaseManager.java
