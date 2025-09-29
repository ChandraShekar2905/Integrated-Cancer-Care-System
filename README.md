# Integrated Cancer Care System (ICCS)

## Overview
The **Integrated Cancer Care System (ICCS)** is a Java Swing-based desktop application developed as the Final Project for the **Application Engineering and Development (INFO 5100)** course.  
The system is designed to streamline cancer treatment workflows by integrating multiple roles — from patients and doctors to insurers and administrators — within a single ecosystem.  

It provides:
- A unified **ecosystem** of networks, enterprises, and organizations.  
- A structured **WorkQueue** system for task assignment and tracking.  
- A persistent data model using **SQLite** for storage and **Gson** serialization.  
- A modular, extensible design supporting future expansion.  

---

## Features
- **User Role Management**: Patients, Doctors, Insurance Agents, and Admins with role-specific dashboards.  
- **Patient Onboarding**: Receptionists can create patient accounts and assign doctors.  
- **Work Queues**: Supports request creation, routing, and tracking across different roles.  
- **Insurance Integration**: Allows processing and tracking of insured individuals.  
- **Data Persistence**:  
  - **SQLite Database** (`Databank.sqlite`) for structured data storage.  
  - **Gson** for serialization and deserialization of system states.  
- **UML Design**: Includes high-level and detailed UML diagrams to explain architecture.  

---

## System Architecture
The project follows a **multi-layered architecture**:

- **Business Layer (`Business/`)**  
  Defines core entities such as `EcoSystem`, `Network`, `Enterprise`, `Organization`, `WorkQueue`, `UserAccount`, `Patient`, and `Insurance`.  

- **Operating System & Ecosystem (`ConfigureASystem.java`)**  
  Bootstraps the initial system configuration, networks, and admin accounts.  

- **Data Layer (`SQLiteUtility/`)**  
  Handles SQLite database connectivity and persistence.  

- **Presentation Layer (`userinterface/`)**  
  Implements GUI components using Java Swing for different roles.  

- **Supporting Resources**  
  - `Images/` and `icons/` for the UI.  
  - UML diagrams (`UML_Diagram_Group20.pdf`, `HighLevelComponentDiagram_Group20.pdf`) to visualize design.  

---

## Tech Stack
- **Language**: Java (JDK 8+)  
- **UI Framework**: Java Swing  
- **Database**: SQLite  
- **Build Tool**: Apache Ant (`build.xml`)  
- **Serialization**: Gson  
- **IDE**: NetBeans  

---

## Installation & Setup
1. Clone or extract the project repository.  
2. Open in **NetBeans IDE** (or any IDE with Ant support).  
3. Build the project using `build.xml` or directly from IDE.  
4. Ensure `Databank.sqlite` is present in the project directory for persistence.  
5. Run the project to launch the main application.  

---

## Usage
- Log in with the appropriate role credentials (admin, doctor, patient, etc.).  
- Navigate through dashboards tailored to the logged-in role.  
- Perform tasks such as creating patient records, assigning doctors, managing insurance, and processing workflows.  

---

## Project Artifacts
- 📄 `Project Proposal_Group20.pdf` – Initial proposal with problem statement & goals.  
- 📄 `HighLevelComponentDiagram_Group20.pdf` – System-level architecture diagram.  
- 📄 `UML_Diagram_Group20.pdf` – Class and interaction diagrams.  
- 📊 `FinalProject_Group20.pptx` – Final presentation slides.  

---

## Team
**Group 20** – INFO 5100 AED Final Project  
- Chandra Shekar Reddy Kusukunthla  
- Hrishi Pal  
- Aryak Pawar  

---

## Future Enhancements
- Web-based version for broader accessibility.  
- Advanced analytics & dashboards for treatment outcomes.  
- Integration with external healthcare APIs and insurance providers.  
- Enhanced security and HIPAA compliance.  

---

✨ This project demonstrates the application of **Object-Oriented Design, UML Modeling, Database Integration, and Swing UI Development** principles covered in the course.  
