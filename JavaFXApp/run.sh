#!/bin/bash

JAVAFX_LIB="javafx-sdk-24.0.1/lib"
SQLITE_JAR="lib/sqlite-jdbc-3.49.1.0.jar"

echo "🚀 Avvio applicazione..."

java \
  --module-path "$JAVAFX_LIB" \
  --add-modules javafx.controls,javafx.base,javafx.fxml,javafx.graphics,javafx.media,javafx.web \
  --enable-native-access=ALL-UNNAMED \
  -cp "bin:$SQLITE_JAR" \
  JavaFXApp.src.com.Main
