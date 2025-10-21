# NyxPrinter Repository Notes

## Overview
- **Purpose**: Flutter plugin for interacting with Nyx thermal printers (e.g., NB55).
- **Primary Language**: Dart, with an embedded Android platform implementation (Kotlin/Java via Flutter plugin scaffolding).
- **Package Layout**:
  - **lib/**: Public Dart API, platform interface, and formatting helpers.
  - **android/**: Native Android host code, Gradle configuration, and namespace settings.
  - **example/**: Sample Flutter application demonstrating plugin usage.

## Tooling & Commands
1. **Fetch dependencies**: `flutter pub get`
2. **Run analyzer**: `flutter analyze`
3. **Run tests**: `flutter test`
4. **Format Dart**: `dart format lib example test`

## Coding Guidelines
- **Dart**: Follow effective Dart style; keep public API documented.
- **Android**: Use modern Gradle syntax, leverage Kotlin where applicable, and align with AGP requirements.
- **Versioning**: Update `CHANGELOG.md` and `pubspec.yaml` when releasing changes.

## Notes
- Ensure Android Gradle Plugin and Gradle wrapper stay consistent with Flutter’s supported versions.
- Example app should remain buildable; update its Android configuration if Gradle settings change.