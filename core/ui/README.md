# MementoMed Design System

This module contains the design system for MementoMed, including theme tokens, typography, spacing, and reusable UI components.

## Structure

```
core/ui/
├── theme/
│   ├── Colors.kt          # Color tokens and light/dark color schemes
│   ├── Typography.kt      # Text styles and typography scale
│   ├── Dimens.kt          # Spacing, corner radii, icon sizes
│   └── Theme.kt           # MementoMedTheme composable
├── components/
│   ├── PrimaryButton.kt   # Primary action button
│   ├── Banner.kt          # Informational banners with severity levels
│   └── EmptyStateCard.kt  # Empty state display card
└── tests/
    ├── PrimaryButtonTest.kt
    ├── BannerTest.kt
    ├── EmptyStateCardTest.kt
    └── ComponentSemanticsTest.kt
```

## Usage

### Theme

Wrap your composable content with `MementoMedTheme`:

```kotlin
@Composable
fun MyScreen() {
    MementoMedTheme {
        // Your content here
    }
}
```

Access theme values:

```kotlin
val colors = MementoMedTheme.colors
val typography = MementoMedTheme.typography
val dimens = MementoMedTheme.dimens
```

### Components

#### PrimaryButton

```kotlin
PrimaryButton(
    onClick = { /* action */ },
    text = "Click Me",
    enabled = true,
    leadingIcon = {
        Icon(imageVector = Icons.Default.Add, contentDescription = null)
    }
)
```

#### Banner

```kotlin
Banner(
    message = "This is an informational message",
    severity = BannerSeverity.Info,
    actionLabel = "Action",
    onAction = { /* action */ }
)
```

#### EmptyStateCard

```kotlin
EmptyStateCard(
    title = "No Items",
    message = "You haven't added any items yet.",
    imageVector = Icons.Default.Info,
    ctaLabel = "Add Item",
    onCta = { /* action */ }
)
```

## Design Tokens

### Colors

The color system provides semantic color roles:
- `Primary`, `OnPrimary`, `PrimaryContainer`, `OnPrimaryContainer`
- `Surface`, `OnSurface`, `SurfaceVariant`, `OnSurfaceVariant`
- `Background`, `OnBackground`
- `Error`, `OnError`, `ErrorContainer`, `OnErrorContainer`
- `Outline`, `OutlineVariant`
- `InverseSurface`, `InverseOnSurface`, `InversePrimary`
- `Scrim`

### Typography

Text styles available:
- `DisplayLarge`, `DisplayMedium`, `DisplaySmall`
- `HeadlineLarge`, `HeadlineMedium`, `HeadlineSmall`
- `TitleLarge`, `TitleMedium`, `TitleSmall`
- `BodyLarge`, `BodyMedium`, `BodySmall`
- `LabelLarge`, `LabelMedium`, `LabelSmall`

### Spacing

Spacing tokens: `space_2`, `space_4`, `space_8`, `space_12`, `space_16`, `space_24`, `space_32`, `space_48`, `space_64`

### Corner Radii

Corner radius tokens: `corner_small` (4dp), `corner_medium` (8dp), `corner_large` (16dp), `corner_xlarge` (24dp)

### Icon Sizes

Icon size tokens: `icon_small` (16dp), `icon_medium` (24dp), `icon_large` (32dp), `icon_xlarge` (48dp)

## Testing

### Snapshot Tests

Run snapshot tests using Paparazzi:

```bash
./gradlew :core:ui:testDebugUnitTest
```

Or specifically for Paparazzi:

```bash
./gradlew :core:ui:recordPaparazziDebug
./gradlew :core:ui:verifyPaparazziDebug
```

Snapshot images are saved in `core/ui/src/test/snapshots/`.

### Unit Tests

Run all tests:

```bash
./gradlew :core:ui:test
```

### Accessibility Tests

The `ComponentSemanticsTest` verifies that components have proper accessibility semantics:
- Buttons have `Role.Button`
- Titles have `Heading` semantics
- Images have `Role.Image`

## Previews

All components include Compose previews for both light and dark themes. Open the component files in Android Studio to see the previews.

## Accessibility

All components include:
- Proper semantic roles
- Content descriptions where applicable
- Heading semantics for titles
- WCAG AA contrast ratios

## Localization

Text in production should use `stringResource()`. Preview functions may use literal strings for development speed.

