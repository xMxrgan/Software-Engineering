#!/bin/bash

# Percorsi
SRC_DIR="src"
OUT_DIR="bin"
JAVAFX_LIB="/lib/javafx-sdk-24.0.1/lib"

echo "🧹 Pulizia vecchi file..."
rm -rf "$OUT_DIR"
mkdir -p "$OUT_DIR"

echo "🛠 Compilazione..."
javac \
  --module-path "$JAVAFX_LIB" \
  --add-modules javafx.controls,javafx.fxml \
  -d "$OUT_DIR" \
  $(find "$SRC_DIR" -name "*.java")

echo "✅ Compilazione completata."
