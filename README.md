# ⚠️ AlertDialog Android App (Kotlin)

This is a simple Android application that demonstrates how to implement an **AlertDialog** in Kotlin. When the user clicks a button, a confirmation dialog is shown asking whether they want to uninstall an app (e.g., Facebook). A `Toast` message follows the user's decision.

---

## 🎯 Features

- Displays a custom `AlertDialog` when a button is clicked
- Handles both **Yes** and **No** responses
- Shows a `Toast` message based on the user’s selection

---

## 📱 Preview

**Dialog Prompt:**
Do you want to uninstall Facebook?


- ✅ Clicking **Yes**:  
  `Toast: App has been successfully uninstalled`

- ❌ Clicking **No**:  
  The dialog simply closes

---

## 🧱 Built With

- Kotlin
- Android SDK
- Android Studio

---

## 🧪 How It Works

1. A button (`btnAlert`) is defined in the `activity_main.xml`.
2. When the button is clicked, it triggers the `showAlertDialog()` method.
3. An `AlertDialog.Builder` sets up the title, message, and button actions.
4. Based on the user's choice, appropriate actions (like showing a `Toast` or dismissing the dialog) are performed.

---
com.example.alertdialogbox/
├── MainActivity.kt # Contains logic for showing AlertDialog
└── res/
└── layout/
└── activity_main.xml # Contains a Button with id btnAlert
## 📂 Project Structure

---

## 📦 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/alertdialog-kotlin-app.git

---

Open the project in Android Studio.

Connect a physical device or use an emulator.

Press Run ▶️ to build and launch the app.

💬 Example Code Snippet

builder.setTitle("Facebook")
    .setMessage("Do you want to uninstall Facebook?")
    .setPositiveButton("Yes") { dialog, which ->
        Toast.makeText(this, "App has been successfully uninstalled", Toast.LENGTH_SHORT).show()
    }
    .setNegativeButton("No") { dialog, which ->
        dialog.dismiss()
    }

📄 License
This project is licensed under the MIT License.
