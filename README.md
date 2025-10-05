## 🎮 LoLChampInfo - Información de Campeones de League of Legends

<div align="center">
  <img src="screenshots/logo_lol.png" alt="LoLChampInfo Logo" width="200" height="200"/>
  
  <br/>
  
  <a href="https://developer.android.com/"><img src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white" alt="Android"/></a>
  <a href="https://kotlinlang.org/"><img src="https://img.shields.io/badge/Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin"/></a>
  <a href="https://developer.android.com/jetpack/compose"><img src="https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpack-compose&logoColor=white" alt="Jetpack Compose"/></a>
  <a href="https://developer.android.com/topic/architecture"><img src="https://img.shields.io/badge/Architecture-MVVM-FF6B6B?style=for-the-badge" alt="MVVM"/></a>
</div>

## 📱 Descripción del Proyecto

**LoLChampInfo** es una aplicación Android moderna desarrollada con **Jetpack Compose** para explorar campeones de League of Legends: listado, detalles, lore, pasiva e habilidades, con arquitectura **MVVM**, inyección de dependencias con **Hilt** y consumo de API mediante **Ktor**.

### 🎯 Características Principales

- **📚 Lista de Campeones**: Exploración de campeones con UI moderna en Compose.
- **🧙 Detalles Completos**: Lore, pasiva y habilidades principales por campeón.
- **🖼️ Imágenes Optimizadas**: Carga y caché con Coil 3.
- **🧭 Navegación Fluida**: Navigation Compose y rutas tipadas.
- **🏗️ Arquitectura Sólida**: MVVM con ViewModels y estados inmutables.
- **🔌 Inyección de Dependencias**: Configuración con Hilt y KSP.
- **🌐 Red Moderna**: Ktor Client con OkHttp, logging y negociación de contenido.

## 🏛️ Arquitectura del Proyecto

### Patrón MVVM (Model-View-ViewModel)

La app sigue **MVVM** para separar responsabilidades y facilitar mantenimiento y pruebas.

```
📁 presentation/
└── 📁 screen/
    ├── 📁 champion_list/
    │   ├── ChampionListViewModel.kt      # Lógica y estado de la lista
    │   ├── ChampionListScreen.kt         # Pantalla de listado
    │   └── 📁 components/                # UI reutilizable
    │       └── ChampionCard.kt
    └── 📁 champion_details/
        ├── ChampionDetailsViewModel.kt   # Lógica y estado de detalles
        ├── ChampionDetailsScreen.kt      # Pantalla de detalles
        └── 📁 components/
            ├── ChampionHeader.kt
            ├── ChampionLore.kt
            ├── ChampionPassive.kt
            └── ChampionSpell.kt

📁 domain/
├── 📁 model/ (ChampionModel, SpellModel, PassiveModel, etc.)
└── 📁 repository/ ApiRepository.kt

📁 data/
├── 📁 repository/ ApiRepositoryImpl.kt   # Implementación de acceso a datos
└── 📁 di/ AppModule.kt                   # Módulos de Hilt

📁 util/
└── Routes.kt                             # Definición de rutas de navegación
```

### 🔄 Flujo de Datos
1. **View (Compose UI)** → **ViewModel** (lógica de presentación y estado)
2. **ViewModel** → **Repository** (abstracción de datos)
3. **Repository** → **API (Ktor)**
4. **Respuesta API** → **Modelos de dominio**
5. **Modelos** → **ViewModel** → **UI**

## 🚀 Tecnologías y Librerías

### Core Android y UI
- **Android SDK 24+** (min 24, target 36, compile 36)
- **Kotlin 2.2.20**
- **Jetpack Compose** (BOM 2025.09.01)
- **Material 3 1.4.0** e **Icons Extended 1.7.8**
- **Lifecycle**: ViewModel/Runtime/Compose 2.9.4

### Arquitectura y DI
- **MVVM**
- **Hilt 2.57.2** + `androidx.hilt.navigation.compose` 1.3.0
- **KSP** para procesamiento de anotaciones

### Red y Datos
- **Ktor 3.3.0**: core, okhttp, logging
- **Content Negotiation + kotlinx.serialization**
- **Sandwich Ktor 2.1.3** para manejo de respuestas
- **SLF4J Simple 2.0.17**

### Imágenes
- **Coil 3.3.0** (`coil-compose`, `coil-network-okhttp`)

### Testing
- **JUnit 4.13.2**, **AndroidX Test (JUnit, Espresso)**
- **Compose UI Test**

## 🏗️ Estructura del Proyecto

```
LoLChampInfo/
├── 📁 app/
│   └── 📁 src/main/java/com/cesar/lolchampinfo/
│       ├── LolChampInfoApp.kt
│       ├── MainActivity.kt
│       ├── 📁 util/Routes.kt
│       ├── 📁 domain/
│       │   ├── 📁 model/
│       │   └── 📁 repository/ ApiRepository.kt
│       ├── 📁 data/
│       │   ├── 📁 di/ AppModule.kt
│       │   └── 📁 repository/ ApiRepositoryImpl.kt
│       └── 📁 presentation/screen/
│           ├── 📁 champion_list/
│           └── 📁 champion_details/
├── 📁 screenshots/
└── README.md
```

## 🚀 Instalación y Configuración

### Prerrequisitos
- **Android Studio** (Ladybug o superior)
- **JDK 11**
- **Android SDK** API 24+

### Pasos
1. Clona el repositorio y ábrelo en Android Studio.
2. Sincroniza Gradle y espera a la indexación.
3. Ejecuta el módulo `app` en un dispositivo/emulador (API 24+).

```bash
git clone https://github.com/tu-usuario/LoLChampInfo.git
cd LoLChampInfo
./gradlew build
```

## 🔐 Permisos
- `INTERNET`: Requerido para consumo de API.

## 👨‍💻 Desarrollador

**César** — Desarrollador Android

---

<div align="center">
  <p>Desarrollado con ❤️ siguiendo buenas prácticas de Android</p>
  <p>🎮 <strong>LoLChampInfo</strong> — Información de campeones en tu bolsillo</p>
</div>

