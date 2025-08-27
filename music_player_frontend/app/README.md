# Music Player Frontend (Android, Kotlin)

Minimal scaffold with Bottom Navigation (Home, Search, Library, Now Playing), light theme, and placeholder screens for authentication, browsing, playback controls, playlists, and favorites.

Build:
  ./gradlew :app:assembleDebug

Install & run on device/emulator:
  ./gradlew :app:installDebug

CI note: Some environments exhibit UASTFacade failures in Android Lint. If builds fail on lintAnalyze tasks, skip lint:
  ./gradlew build -x lint -x lintAnalyzeDebug -x lintAnalyzeDebugAndroidTest -x lintAnalyzeDebugUnitTest

When toolchain is stabilized, re-enable lint.
