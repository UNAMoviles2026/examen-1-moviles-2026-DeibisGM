# Examen 1 - Plataformas Móviles (I Ciclo 2026)

PoC de aplicación móvil para gestión de espacios de coworking desarrollada con Jetpack Compose.

## Objetivo
Demostrar análisis técnico, diseño de arquitectura, diseño backend conceptual, contratos API y una interfaz funcional en Compose con datos simulados.

## Estructura del repositorio

- `app/`: proyecto Android (Jetpack Compose)
- `docs/architecture/`: arquitectura del sistema y diagrama
- `docs/backend/`: diseño backend por capas
- `docs/api/`: contratos de API (OpenAPI YAML)
- `docs/ui/`: documentación de diseño de interfaz
- `docs/decisions/`: análisis de decisiones técnicas y mejoras

## Implementación de la app

Pantallas implementadas:
- `SpacesListScreen` con `LazyColumn`
- `SpaceDetailScreen`
- `AppBottomBar` visible en ambas pantallas

Componentes reutilizables:
- `SpaceCardItem`
- `SpaceInfoSection`
- `ReservationButton`
- `AppBottomBar`

Datos:
- Mock data en `MockSpaces`.
- Modelo de datos en `CoworkingSpace`.

## Documentación entregable

- Arquitectura:
  - `docs/architecture/Arquitectura del sistema.pdf`
  - `docs/architecture/system-architecture-diagram.png`
- Backend:
  - `docs/backend/Diseño de backend.pdf`
- API:
  - `docs/api/api-contracts.yml`
- UI:
  - `docs/ui/Diseño de UI.md`
- Decisiones técnicas:
  - `docs/decisions/Decisiones tecnicas.pdf`

## Cómo ejecutar

Requisitos:
- Android Studio (Koala o superior recomendado)
- JDK 17
- SDK de Android configurado

Pasos:
1. Abrir el proyecto en Android Studio.
2. Sincronizar Gradle.
3. Ejecutar `app` en emulador o dispositivo.

Desde terminal (Windows PowerShell):

```powershell
.\gradlew.bat :app:assembleDebug
```

## Notas

- El alcance del examen define PoC con datos simulados: no hay backend real ni persistencia.
