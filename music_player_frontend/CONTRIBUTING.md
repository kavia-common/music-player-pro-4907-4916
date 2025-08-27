# Contributing and Build Notes

This repository contains a Declarative Gradle Android project (light theme, Bottom Navigation, placeholder screens).

Local build:
- From the music_player_frontend directory:
  ./gradlew :app:assembleDebug

Run tests:
  ./gradlew test

CI note: Lint tasks may fail in some environments due to UAST toolchain incompatibilities.
To skip lint during CI, use Gradle flags:
  ./gradlew build -x lint -x lintAnalyzeDebug -x lintAnalyzeDebugAndroidTest -x lintAnalyzeDebugUnitTest

Alternatively, run only assemble without lint:
  ./gradlew :app:assembleDebug

When upgrading the Android Gradle Plugin and Kotlin toolchain, remove those -x flags and re-enable lint.
