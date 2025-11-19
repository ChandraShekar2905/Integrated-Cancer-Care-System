# Integrated Cancer Care System (ICCS)

## Overview
The **Integrated Cancer Care System (ICCS)** is a comprehensive Java Swing-based desktop application designed to streamline and manage the complex workflows involved in cancer treatment. It integrates various stakeholders—patients, doctors, insurance providers, and administrators—into a single, unified ecosystem.

This project was developed as the Final Project for the **Application Engineering and Development (INFO 5100)** course.

## Features
*   **Role-Based Access Control**: Secure login and customized dashboards for:
    *   **System Admin**: Manage networks, enterprises, and top-level configuration.
    *   **Doctor**: Manage patient treatments, request lab tests, and prescribe medication.
    *   **Patient**: View medical history, book appointments, and manage insurance.
    *   **Insurance Agent**: Process insurance claims and verify coverage.
    *   **Receptionist**: Onboard new patients and schedule initial consultations.
    *   **Lab Assistant**: Process and update lab test results.
    *   **Pharmacist**: Fulfill medication orders.
*   **Work Queue System**: A robust task management system allowing requests (e.g., lab tests, insurance claims) to be routed between different organizations and roles.
*   **Data Persistence**:
    *   **SQLite Database**: Stores the entire ecosystem state in a structured local database (`Databank.sqlite`).
    *   **Gson Serialization**: Converts complex Java object graphs into JSON format for storage.
*   **Enterprise & Network Management**: Hierarchical structure supporting multiple networks (cities) and enterprises (Hospitals, Insurance Companies, Pharmacies).

## System Architecture
The application follows a multi-layered architecture to ensure separation of concerns:

1.  **Presentation Layer (`userinterface/`)**:
    *   Built using **Java Swing**.
    *   Uses `CardLayout` for navigation between different role-specific work areas.
2.  **Business Layer (`Business/`)**:
    *   Contains the core logic and entity models (`EcoSystem`, `Enterprise`, `Organization`, `UserAccount`, `WorkQueue`).
    *   Implements the Singleton pattern for the main `EcoSystem`.
3.  **Data Layer (`Business/SQLiteUtility/`)**:
    *   Handles connection to the SQLite database.
    *   Uses `Gson` to serialize/deserialize the system state.

## Tech Stack
*   **Programming Language**: Java (JDK 23)
*   **GUI Framework**: Java Swing
*   **Database**: SQLite (`sqlite-jdbc`)
*   **Serialization**: Google Gson
*   **Build Tool**: Apache Ant
*   **IDE**: NetBeans IDE

## Project Structure
```
Integrated-Cancer-Care-System/
├── AedFinalProject/
│   ├── src/
│   │   ├── Business/           # Core business logic and entities
│   │   │   ├── Employee/
│   │   │   ├── Enterprise/
│   │   │   ├── Network/
│   │   │   ├── Organization/
│   │   │   ├── Role/
│   │   │   ├── SQLiteUtility/  # Database handling code
│   │   │   ├── UserAccount/
│   │   │   ├── WorkQueue/
│   │   │   ├── ConfigureASystem.java
│   │   │   └── EcoSystem.java
│   │   ├── userinterface/      # Swing GUI classes
│   │   ├── Images/             # Application images
│   │   └── icons/              # UI Icons
│   ├── build.xml               # Ant build script
│   ├── Databank.sqlite         # Local database file
│   └── manifest.mf
├── README.md                   # This file
└── [Documentation Files]       # UML Diagrams, Proposal, Presentation
```

## Prerequisites
Before running the application, ensure you have the following installed:
1.  **Java Development Kit (JDK)**: Version 23 or compatible.
2.  **NetBeans IDE**: Recommended for opening and building the project (supports Ant projects natively).
3.  **Libraries**: The project relies on several JARs (included in dependencies or required to be added to classpath):
    *   `sqlite-jdbc-3.47.1.0.jar`
    *   `gson-2.11.0.jar`
    *   `jfreechart`, `jcalendar`, `javax.mail`, etc.

## Installation & Running
1.  **Clone/Download** the repository to your local machine.
2.  **Open in NetBeans**:
    *   Launch NetBeans IDE.
    *   Go to `File` -> `Open Project`.
    *   Select the `AedFinalProject` folder.
3.  **Verify Dependencies**:
    *   Right-click the project -> `Properties` -> `Libraries`.
    *   Ensure all JAR paths are correct and resolved. If any are missing (red), remove them and add the correct versions from your local library folder.
4.  **Database Setup**:
    *   Ensure the `Databank.sqlite` file is present in the `AedFinalProject` root directory.
    *   If missing, the system will attempt to create a new one, but it will be empty.
5.  **Build and Run**:
    *   Click the **Run** button (Green Play icon) or press `F6`.
    *   The application window should appear.

## Usage Guide
### Default Credentials
If the system is pre-populated (check `ConfigureASystem.java` for bootstrap data), you can try:
*   **Username**: `sysadmin`
*   **Password**: `sysadmin`

### Common Workflows
1.  **Login**: Enter your username and password. The system automatically detects your role and enterprise.
2.  **System Admin**: Create new Networks (e.g., "Boston"), then Enterprises (e.g., "Mass General"), then Admin accounts for those enterprises.
3.  **Enterprise Admin**: Log in to create Organizations (e.g., "Doctor Organization") and Employee/User accounts.
4.  **Doctor**: Log in to view assigned patients, request lab tests, or prescribe medicine.
5.  **Logout**: Always use the Logout button to ensure data is saved to the database.

## Troubleshooting
*   **"Error connecting to database"**: Ensure `Databank.sqlite` is in the correct working directory (usually the project root). Check file permissions.
*   **"Class not found" errors**: Verify that all JAR files in the `Libraries` section of the project properties are correctly linked.
*   **UI Glitches**: If running on a high-DPI screen, you may need to adjust Java scaling settings or NetBeans font sizes.

## Contributors
**Group 20** - INFO 5100 AED Final Project
*   Chandra Shekar Reddy Kusukunthla
*   Hrishi Pal
*   Aryak Pawar
