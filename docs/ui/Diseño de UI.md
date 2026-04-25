# Diseño de UI

## 1) Estructura de la interfaz implementada
La prueba de concepto se organiza en dos pantallas principales con navegación simple y consistente:

1. **SpacesListScreen**
   - Muestra listado de espacios en `LazyColumn`.
   - Cada elemento se representa con una tarjeta y datos resumidos.
2. **SpaceDetailScreen**
   - Muestra información ampliada del espacio seleccionado.
   - Incluye acción principal para iniciar reservación.
3. **BottomBar**
   - Visible en ambas pantallas.
   - Mantiene una sola opción principal: **Lista**.
4. **TopAppBar (en detalle)**
   - En la pantalla de detalle muestra un botón de volver (`←`) para regresar al listado.

La estructura de pantalla usa `Scaffold` como contenedor principal para mantener una composición consistente.

### Justificación de la estructura
- Se definieron dos pantallas porque corresponden al flujo mínimo del problema: explorar y revisar detalle.
- El detalle se abre únicamente desde la acción **Ver** en cada tarjeta de la lista.
- El regreso al listado se resuelve con el botón de volver en el `TopAppBar`, evitando rutas ambiguas.
- Se mantiene `BottomBar` con opción de **Lista** para conservar un punto de inicio claro.
- `Scaffold` centraliza layout base y evita repetir estructura entre pantallas.

## 2) Lista de composables creados
- `CoworkingApp` (entry composable y navegación base)
- `SpacesListScreen`
- `SpaceDetailScreen`
- `AppBottomBar`
- `SpaceCardItem`
- `SpaceInfoSection`
- `ReservationButton`

## 3) Componentes reutilizables identificados
- **`SpaceCardItem`**: reutilizable para mostrar cualquier espacio en listados.
- **`AppBottomBar`**: reutilizable como barra de navegación principal.
- **`ReservationButton`**: reutilizable para acciones primarias de reserva.
- **`SpaceInfoSection`**: reutilizable para bloques de texto y metadatos del espacio.

### Justificación de reutilización
- Reutilizar `SpaceCardItem` permite que cambios visuales del listado se hagan en un solo lugar.
- `ReservationButton` estandariza la acción principal para no mezclar estilos y comportamientos.
- Esta separación reduce duplicación y mejora mantenibilidad, incluso en una PoC.

## 4) Justificación de la organización de la interfaz
- Se separan **Screens** y **Components** para evitar composables monolíticos.
- Los componentes reutilizables reducen duplicación y facilitan mantenimiento.
- `Scaffold` + `TopAppBar` + `BottomBar` permiten consistencia visual y navegación clara.
- `LazyColumn` es adecuado para listados dinámicos y escalables de espacios.
- La jerarquía visual prioriza información clave: nombre, ubicación, precio, disponibilidad y acción de reserva.

## 5) Trade-offs de UI
- Con solo dos pantallas, se optó por navegación directa: entrar al detalle con **Ver** y volver con flecha superior.
- Se conserva `BottomBar` para mantener referencia de sección principal sin exponer una opción redundante de detalle.
