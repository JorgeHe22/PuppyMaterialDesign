# Puppy Material Design — actividad del curso

Aplicación Android de ejemplo creada en **Java y XML (Views)** para demostrar una
identidad visual basada en el logotipo Puppy y los roles de color solicitados.

## Colores propuestos

| Rol | HEX | Aplicación |
|---|---|---|
| Primary | `#74E0E6` | Barra superior y superficies principales |
| Dark Primary | `#008C95` | Barra de estado y variante oscura |
| Accent | `#FF6254` | Botón principal y controles destacados |
| Complementario | `#4D3D41` | Textos e icono de huella |

**Importante:** valores HEX estimados visualmente, no extraídos píxel por píxel.
El color oscuro principal es una variación de la familia turquesa para
mantener coherencia con el logotipo.

## Compatibilidad

- Diseño Material Components con `Theme.MaterialComponents.Light.NoActionBar`.
- Dependencias de AndroidX/AppCompat para interfaz y versiones anteriores.
- `minSdk 21` (Android 5.0), `compileSdk 35`, `targetSdk 34`.
- Lenguaje Java y layouts XML (no Jetpack Compose).
- Android Gradle Plugin 8.7.3, Gradle 8.9 y JDK 17.

## Cómo abrir el ejercicio en Android Studio (Windows)

**Opción recomendada — proyecto nuevo con Gradle Wrapper generado por Android Studio**

1. Instala o abre Android Studio y crea **New Project > Empty Views Activity**
   (no elige Empty Activity de Jetpack Compose).
2. Nombre: `PuppyMaterialDesign`; Package: `com.example.puppymaterial`;
   Language: `Java`; Minimum SDK: **API 21**.
3. Termina el asistente y espera a que cree la estructura y el Gradle Wrapper.
4. En ese proyecto reemplaza la carpeta `app/src` por la carpeta `app/src`
   de este paquete.
5. Reemplaza `app/build.gradle.kts` **o** `app/build.gradle` por el archivo
   `app/build.gradle` de este paquete. Nunca dejes ambos a la vez.
6. Reemplaza `build.gradle.kts` **o** `build.gradle` por nuestro `build.gradle`.
   Haz lo mismo con `settings.gradle.kts` / `settings.gradle`.
7. Sustituye el contenido de `gradle/wrapper/gradle-wrapper.properties` por
   el incluido en este paquete, pero **conserva el archivo binario
   `gradle-wrapper.jar` generado por Android Studio** y los scripts
   `gradlew` y `gradlew.bat` del asistente.
8. En `gradle.properties`, confirma que existan estas propiedades:
   `android.useAndroidX=true` y `android.nonTransitiveRClass=true`.
9. Pulsa **Sync Project with Gradle Files**. Si el SDK 35 no está instalado,
   permite que Android Studio lo descargue.
10. Ejecuta en un emulador o dispositivo Android. La primera sincronización
    necesita Internet para descargar dependencias.

**Nota:** Este paquete contiene el código de la app y la configuración de
Gradle, pero no incluye el binario del Gradle Wrapper, los SDK ni un APK
precompilado. Sin la opción anterior, no está listo para compilar con
`gradlew` por sí solo. No se ha ejecutado una compilación en un emulador.

## Evidencias sugeridas

Toma una captura de la pantalla principal donde se vean los tres colores y
otra del código `colors.xml` y `themes.xml` en Android Studio. La actividad
indica que las capturas y GitHub son opcionales.

## Archivos de interés

- `app/src/main/res/values/colors.xml`: los HEX de la marca.
- `app/src/main/res/values/themes.xml`: asignación de roles Material.
- `app/src/main/res/layout/activity_main.xml`: interfaz de demostración.
- `app/src/main/java/com/example/puppymaterial/MainActivity.java`: botones.

## Para GitHub

Cuando el proyecto ya abra en Android Studio y funcione:

```bash
git init
git add .
git commit -m "Actividad Material Design: identidad Puppy"
git branch -M main
git remote add origin https://github.com/TU_USUARIO/PuppyMaterialDesign.git
git push -u origin main
```

Crea primero un repositorio vacío en GitHub. No subas `local.properties`.
