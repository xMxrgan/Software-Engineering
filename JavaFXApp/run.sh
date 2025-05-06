#!/bin/bash

JAVAFX_LIB="lib/javafx-sdk-24.0.1/lib"

echo "🚀 Avvio applicazione..."

java \
  --module-path "$JAVAFX_LIB" \
  --add-modules javafx.controls,javafx.base,javafx.fxml,javafx.graphics,javafx.media,javafx.web  \
  --enable-native-access=ALL-UNNAMED \
  -Dprism.order=sw \
  -cp bin JavaFXApp.src.com.Main
