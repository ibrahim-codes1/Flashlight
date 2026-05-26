🔦 Torch — Flashlight App for Android

A clean, minimal flashlight app for Android built with Java and the Camera2 API.
Features a creative dark-themed UI with a circular power button, pulse ring animations, brightness slider, and automatic torch cleanup on app exit.

📱 Screenshots
OFF State

ON State

✨ Features
One-tap power button — toggles the flashlight instantly
Pulse ring animations — visual feedback when torch is active
Brightness slider — adjust torch intensity (enabled only when ON)
Auto-off on exit — torch safely turns off when you leave the app
No-flash device detection — graceful message if device has no flash
Minimal permissions — only camera permission required
🛠️ Tech Stack
Layer	Technology
Language	Java
Min SDK	API 21 (Android 5.0 Lollipop)
Target SDK	API 34 (Android 14)
Layout	ConstraintLayout
Camera API	Camera2 (CameraManager)
UI	Custom XML drawables + Vector icons
📂 Project Structure
Flashlight/
├── Pictures/
│   ├── off_state.png
│   └── on_state.png
│
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/flashlight/
│   │       │   └── MainActivity.java
│   │       │
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   │   └── activity_main.xml
│   │       │   │
│   │       │   ├── drawable/
│   │       │   │   ├── ic_power_off.xml
│   │       │   │   ├── ic_power_on.xml
│   │       │   │   ├── btn_off.xml
│   │       │   │   ├── btn_on.xml
│   │       │   │   ├── btn_ripple.xml
│   │       │   │   └── ring_deco.xml
│   │       │   │
│   │       │   ├── color/
│   │       │   │   └── btn_text_selector.xml
│   │       │   │
│   │       │   └── values/
│   │       │       ├── colors.xml
│   │       │       └── strings.xml
│   │       │
│   │       └── AndroidManifest.xml
│   │
│   └── build.gradle
│
└── README.md
🚀 Getting Started
Prerequisites
Android Studio Hedgehog (2023.1.1) or newer
Android device with a flash unit
Java 8 or higher
📥 Installation
1. Clone the repository
git clone https://github.com/ibrahim-codes1/Flashlight.git
cd Flashlight
2. Open in Android Studio
Go to File → Open
Select the project folder
Wait for Gradle to sync
3. Run the app
Connect a physical Android device
(emulators usually don't support flashlight hardware)
Click the green Run button or press:
Shift + F10
🔐 Permissions

Declared in AndroidManifest.xml:

<uses-permission android:name="android.permission.CAMERA" />

<uses-feature
    android:name="android.hardware.camera.flash"
    android:required="true" />

Note: The CAMERA permission is required by CameraManager to access the torch.
No photos or videos are ever captured.

💡 How It Works
Core Logic — MainActivity.java
App Launch
    │
    ├─► Check: does device have flash?
    │       └─ No  → show Toast, disable button
    │       └─ Yes → get cameraId from CameraManager
    │
    └─► User taps ToggleButton
            ├─ ON  → setTorchMode(cameraId, true)
            └─ OFF → setTorchMode(cameraId, false)

App goes to background (onStop)
    └─► setTorchMode(cameraId, false)
Key Method
cameraManager.setTorchMode(cameraId, isOn);

This single Camera2 API call handles everything — no SurfaceTexture or camera session needed.

🎨 UI Design

The app uses a dark futuristic theme with cyan highlights.

Element	OFF State	ON State
Background	#080810	#080810
Button Fill	#0D0D1A	#001A22
Button Border	#1E1E3A	#00DCFF
Power Icon	#2A2A5A	#00DCFF
Status Text	Gray	Cyan
Pulse Rings	Hidden	Animated
⚠️ Known Limitations
Issue	Explanation
No emulator support	Android emulators don't have real flashlight hardware
Brightness control	Most devices only support ON/OFF torch mode
Single camera usage	App currently uses the default rear camera
🔮 Planned Features
 Strobe / flicker mode
 SOS Morse code mode
 Home screen widget
 Lock screen shortcut
 Timer auto-off
 Advanced brightness control
🧑‍💻 Author

Muhammad Ibrahim 

GitHub: ibrahim-codes1 GitHub
📄 License

MIT License

Copyright (c) 2025 Ibrahim Sheikh

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files to deal in the Software
without restriction, including without limitation the rights to use, copy,
modify, merge, publish, distribute, sublicense, and/or sell copies.

🙏 Acknowledgements
Android Camera2 API Documentation
Material Design Guidelines
Built as part of a mobile app development learning journey 🚀
