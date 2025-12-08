# MementoMed (Android)

Offline-first Android app to manage home medicines.

## Requirements

- JDK 17
- Android SDK (compileSdk 34)
- Gradle 8.1+ recommended
- Android Studio Flamingo or later

## Modules

:app, :core:util, :core:ui, :data:db, :data:ads, :domain:billing, :features:plan, :features:gate

## Build

```
./gradlew clean :app:assembleDebug
```

## Run

Open the project in Android Studio and run the `:app` module.

## Test

Add unit and instrumentation tests per module. Example:

```
./gradlew :app:testDebugUnitTest
```

## Notes

- Billing integration placeholder in `:domain:billing` — implement Google Play BillingClient and consumable/subscription flow.
- Ads module prepared (`:data:ads`) but not integrated; prefer rewarded & non-intrusive formats.
- No backend, no accounts by design. Optional Google Drive backup should be implemented opt-in using user's Play Services / Drive API, but keep data local-by-default.

