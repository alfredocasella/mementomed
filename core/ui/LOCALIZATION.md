# Localization Guide

## Overview

MementoMed uses a centralized `Strings.kt` wrapper for all UI text to ensure:
- No hardcoded strings in UI code
- Automatic locale detection (it-IT first, en-US fallback)
- Type-safe string access
- Easy addition of new locales

## Usage

### In Compose Functions

Always use `Strings` object instead of hardcoded text:

```kotlin
@Composable
fun MyScreen() {
    MementoMedTheme {
        Column {
            Text(text = Strings.unlockPremiumTitle())
            PrimaryButton(
                onClick = { /* action */ },
                text = Strings.subscribeButton()
            )
        }
    }
}
```

### With Parameters

For strings with placeholders:

```kotlin
Text(text = Strings.trialBannerText(daysRemaining = 7))
```

### Available String Categories

#### Billing & Subscription
- `subscriptionPrice()` - "€1.99/month" / "€1,99/mese"
- `subscriptionMonthly()` - "Monthly Subscription" / "Abbonamento Mensile"
- `subscribeButton()` - "Subscribe" / "Abbonati"
- `subscriptionActive()` - "Subscription Active" / "Abbonamento Attivo"
- `subscriptionExpired()` - "Subscription Expired" / "Abbonamento Scaduto"
- `subscriptionRestore()` - "Restore Purchases" / "Ripristina Acquisti"

#### Trial
- `trialBannerText(daysRemaining: Int)` - "X days of trial remaining" / "X giorni di prova rimanenti"
- `trialActive()` - "Trial Active" / "Prova Attiva"
- `trialExpired()` - "Trial Expired" / "Prova Scaduta"
- `trialStartButton()` - "Start Trial" / "Inizia Prova"

#### Premium Unlock
- `unlockPremiumTitle()` - "Unlock Premium" / "Sblocca Premium"
- `unlockPremiumDescription()` - Premium description
- `unlockPremiumBenefits()` - Benefits list

#### Call-to-Action Buttons
- `continueButton()` - "Continue" / "Continua"
- `retryButton()` - "Retry" / "Riprova"
- `cancelButton()` - "Cancel" / "Annulla"
- `confirmButton()` - "Confirm" / "Conferma"
- `dismissButton()` - "Dismiss" / "Chiudi"

#### Ads
- `watchAdToUnlock()` - "Watch Ad to Unlock" / "Guarda un Annuncio per Sbloccare"
- `adNotAvailable()` - "Ad Not Available" / "Annuncio Non Disponibile"
- `adLoading()` - "Loading ad…" / "Caricamento annuncio…"
- `adRewardEarned()` - "Reward earned! Feature unlocked." / "Ricompensa ottenuta! Funzionalità sbloccata."

#### Common UI
- `errorGeneric()` - Generic error message
- `errorNetwork()` - Network error message
- `loading()` - "Loading…" / "Caricamento…"
- `emptyStateTitle()` - Empty state title
- `emptyStateMessage()` - Empty state message

## Adding New Strings

1. Add the string key to `values/strings.xml` (en-US)
2. Add the translation to `values-it/strings.xml` (it-IT)
3. Add a function to `Strings.kt` that returns the localized string
4. Use the function in your Compose code

## Lint Configuration

The project is configured to check for hardcoded text:

```kotlin
lint {
    checkReleaseBuilds = true
    enable += listOf("HardcodedText")
}
```

This will warn if you use hardcoded strings in UI code.

## Locale Detection

Android automatically selects the correct locale based on device settings:
- Italian devices → `values-it/strings.xml`
- Other devices → `values/strings.xml` (en-US fallback)

No manual locale switching is needed.

