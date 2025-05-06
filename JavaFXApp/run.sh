#!/bin/bash

# Percorsi
OUT_DIR="bin"
JAVAFX_LIB="lib/javafx-sdk-24.0.1/lib"
MAIN_CLASS="JavaFXApp.src.Main"  # Cambia se il tuo main ha un nome diverso


echo "🚀 Avvio applicazione..."
java \
  --enable-native-access=ALL-UNNAMED \
  --module-path "$JAVAFX_LIB" \
  --add-modules javafx.controls,javafx.fxml \
  -cp "$OUT_DIR" \
  "$MAIN_CLASS"
