# 🔦 Flashlight

A clean and minimal flashlight app for Android built using Java and the Camera2 API.  
The app features a modern dark-themed UI with a glowing circular power button, pulse ring animations, brightness slider, and automatic torch cleanup when the app closes.

---

## 📱 Screenshots

<p align="center">
  <img src="Pictures/FlashLight Off.jpeg" width="250" alt="OFF State"/>
  <img src="Pictures/FlashLight On.jpeg" width="250" alt="ON State"/>
</p>

---

## ✨ Features

- One-tap power button to instantly toggle flashlight
- Smooth pulse ring animations when torch is active
- Brightness slider support
- Automatic flashlight turn OFF on app exit
- Detects devices without flashlight support
- Minimal and clean UI design
- Lightweight and fast performance

---

## 🛠️ Tech Stack

| Technology | Usage |
|---|---|
| Java | App development |
| Camera2 API | Flashlight control |
| ConstraintLayout | UI Layout |
| XML Drawables | Custom UI design |
| Android Studio | Development IDE |

---

## 📂 Project Structure

```text
Flashlight/
│
├── Pictures/
│   ├── off_state.jpeg
│   └── on_state.jpeg
│
├── app/
│   ├── src/main/
│   │   ├── java/com/example/flashlight/
│   │   │   └── MainActivity.java
│   │   │
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   ├── drawable/
│   │   │   ├── values/
│   │   │   └── mipmap/
│   │   │
│   │   └── AndroidManifest.xml
│   │
│   └── build.gradle
│
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites

- Android Studio Hedgehog or newer
- Android device with flashlight support
- Java 8+

---

## 📥 Installation

### Clone the Repository

```bash
git clone https://github.com/ibrahim-codes1/Flashlight.git
cd Flashlight
```

### Open in Android Studio

1. Open Android Studio
2. Click **File → Open**
3. Select the project folder
4. Wait for Gradle sync

### Run the App

- Connect a physical Android device
- Press **Shift + F10** or click the **Run** button

---

## 🔐 Permissions

```xml
<uses-permission android:name="android.permission.CAMERA" />

<uses-feature
    android:name="android.hardware.camera.flash"
    android:required="true" />
```

---

## 💡 Core Flashlight Logic

```java
cameraManager.setTorchMode(cameraId, isOn);
```

The Camera2 API directly controls the device flashlight without opening a camera preview session.

---

## 🎨 UI Theme

| Element | Color |
|---|---|
| Background | `#080810` |
| Active Glow | `#00DCFF` |
| Inactive Button | `#0D0D1A` |
| Active Button | `#001A22` |

---

## ⚠️ Known Limitations

- Android emulators usually do not support flashlight hardware
- Some devices only support ON/OFF brightness
- Uses the default rear camera flashlight

---

## 🔮 Future Improvements

- Strobe mode
- SOS mode
- Lock screen shortcut
- Home screen widget
- Timer auto OFF
- Advanced brightness control

---

## 🧑‍💻 Author

**Muhammad Ibrahim**

GitHub: https://github.com/ibrahim-codes1

---

## 📄 License

This project is licensed under the MIT License.

---

## 🙏 Acknowledgements

- Android Camera2 API
- Material Design Guidelines
- Android Developers Documentation
