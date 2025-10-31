# Smart-Clinic-Management-System-
# 🏥 Smart Clinic Management System

A full-stack **Java Spring Boot** backend application designed to digitalize and simplify clinic operations such as appointment scheduling, doctor-patient management, and prescription tracking.  

This project follows a modular structure and uses **Spring Boot**, **MySQL**, and **RESTful APIs**, making it easy to integrate with a frontend (Angular/React).

---

## 🚀 Features

### 👩‍⚕️ Doctor
- View scheduled appointments.
- Manage patient prescriptions.
- Access patient medical history.

### 🧍 Patient
- Register, log in, and manage personal details.
- Book, cancel, and reschedule appointments.
- View prescribed medicines and doctor notes.

### 🧑‍💼 Admin
- Manage doctors, patients, and appointments.
- Generate daily/weekly reports.
- Monitor system usage and maintain records.

---

## 🧱 Tech Stack

| Layer | Technology Used |
|-------|------------------|
| **Backend Framework** | Spring Boot |
| **Language** | Java 17 |
| **Database** | MySQL |
| **Security** | JWT (JSON Web Token) |
| **Build Tool** | Maven |
| **Containerization** | Docker |
| **CI/CD** | GitHub Actions |

---

## 📁 Project Structure

smart-clinic-management/
│
├── src/main/java/com/smartclinic/
│ ├── controller/
│ │ ├── DoctorController.java
│ │ ├── PrescriptionController.java
│ │
│ ├── model/
│ │ ├── Appointment.java
│ │ ├── Doctor.java
│ │ ├── Patient.java
│ │
│ ├── repository/
│ │ ├── DoctorRepository.java
│ │ ├── PatientRepository.java
│ │ ├── AppointmentRepository.java
│ │
│ ├── service/
│ │ ├── DoctorService.java
│ │ ├── AppointmentService.java
│ │ ├── TokenService.java
│ │
│ └── SmartClinicApplication.java
│
├── src/main/resources/
│ ├── application.properties
│
├── schema-design.md
├── user_stories.md
├── Dockerfile
├── README.md
└── .github/workflows/compile-backend.yml

yaml
Copy code

---

## ⚙️ Installation and Setup

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/<username>/smart-clinic-management.git
cd smart-clinic-management
2️⃣ Configure MySQL Database
Update your application.properties with:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/clinicdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
3️⃣ Build and Run
bash
Copy code
mvn clean install
mvn spring-boot:run
App runs at 👉 http://localhost:8080

🧪 API Endpoints
👨‍⚕️ Doctor
Method	Endpoint	Description
GET	/api/doctors	Fetch all doctors
POST	/api/doctors	Add a new doctor
GET	/api/doctors/{id}	Get doctor by ID

📅 Appointment
Method	Endpoint	Description
GET	/api/appointments	List all appointments
POST	/api/appointments	Create new appointment

💊 Prescription
Method	Endpoint	Description
GET	/api/prescriptions	View all prescriptions
POST	/api/prescriptions	Add prescription

🧾 License
This project is licensed under the Apache 2.0 License — see the LICENSE file for details.

📚 Additional Files
schema-design.md — MySQL database design.

user_stories.md — User stories for Doctor, Patient, and Admin.

compile-backend.yml — GitHub Actions workflow for CI/CD.

👩‍💻 Author
Varshini
Software Engineering Student
📧 (You may personalize this section later)

🌟 Acknowledgement
This project is created as part of a Java Full Stack Development course to demonstrate backend development skills using Spring Boot and MySQL
