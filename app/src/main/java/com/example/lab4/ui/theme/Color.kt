package com.example.lab4.ui.theme

import androidx.compose.ui.graphics.Color

/**
 * Brand palette for the task manager — an indigo/violet primary with a
 * teal secondary and an amber tertiary. Hand-picked (dynamic color is
 * disabled) so the app keeps a consistent identity on every device.
 */

// --- Light scheme roles ---
val IndigoPrimary = Color(0xFF5A4FCF)
val IndigoOnPrimary = Color(0xFFFFFFFF)
val IndigoPrimaryContainer = Color(0xFFE5E0FF)
val IndigoOnPrimaryContainer = Color(0xFF17134B)

val TealSecondary = Color(0xFF1E8E7E)
val TealOnSecondary = Color(0xFFFFFFFF)
val TealSecondaryContainer = Color(0xFFBFF1E6)
val TealOnSecondaryContainer = Color(0xFF00201A)

val AmberTertiary = Color(0xFFB06A00)
val AmberOnTertiary = Color(0xFFFFFFFF)
val AmberTertiaryContainer = Color(0xFFFFDDB5)
val AmberOnTertiaryContainer = Color(0xFF2B1700)

val LightBackground = Color(0xFFFBF8FF)
val LightOnBackground = Color(0xFF1B1B21)
val LightSurface = Color(0xFFFFFFFF)
val LightOnSurface = Color(0xFF1B1B21)
val LightSurfaceVariant = Color(0xFFE7E0EC)
val LightOnSurfaceVariant = Color(0xFF49454F)
val LightOutline = Color(0xFFCAC4D0)

val ErrorRed = Color(0xFFBA1A1A)
val ErrorContainer = Color(0xFFFFDAD6)
val OnErrorContainer = Color(0xFF410002)

// --- Dark scheme roles ---
val IndigoPrimaryDark = Color(0xFFC4BDFF)
val IndigoOnPrimaryDark = Color(0xFF2A2171)
val IndigoPrimaryContainerDark = Color(0xFF423A9E)
val IndigoOnPrimaryContainerDark = Color(0xFFE5E0FF)

val TealSecondaryDark = Color(0xFF8CD6C6)
val TealOnSecondaryDark = Color(0xFF00382F)
val TealSecondaryContainerDark = Color(0xFF005144)
val TealOnSecondaryContainerDark = Color(0xFFBFF1E6)

val AmberTertiaryDark = Color(0xFFFFB95C)
val AmberOnTertiaryDark = Color(0xFF472A00)
val AmberTertiaryContainerDark = Color(0xFF855400)
val AmberOnTertiaryContainerDark = Color(0xFFFFDDB5)

val DarkBackground = Color(0xFF131318)
val DarkOnBackground = Color(0xFFE5E1E9)
val DarkSurface = Color(0xFF1B1B21)
val DarkOnSurface = Color(0xFFE5E1E9)
val DarkSurfaceVariant = Color(0xFF49454F)
val DarkOnSurfaceVariant = Color(0xFFCAC4D0)
val DarkOutline = Color(0xFF938F99)

val ErrorRedDark = Color(0xFFFFB4AB)
val ErrorContainerDark = Color(0xFF93000A)
val OnErrorContainerDark = Color(0xFFFFDAD6)

// --- Priority accent colors (shared across light/dark) ---
val PriorityHigh = Color(0xFFE5484D)   // red
val PriorityMedium = Color(0xFFF2A900) // amber
val PriorityLow = Color(0xFF30A46C)    // green
