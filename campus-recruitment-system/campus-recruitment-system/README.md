## Campus Recruitment System

This project implements a **full‑stack campus recruitment portal** that helps universities manage placement activities.  Students can register and apply for jobs, companies can post openings, and the Training & Placement Officer (TPO) can monitor and schedule interviews.

### Features

* **Student module** – registration, profile management and the ability to browse and apply for available jobs.
* **Company module** – post new job listings, view applications and shortlist candidates.
* **TPO module** – view all students and companies, schedule interviews and monitor the placement pipeline.
* **Interview scheduling** – basic API to assign interview dates to job applications.
* **REST API** – the backend exposes endpoints for students, companies, jobs and applications.
* **Clean architecture** – separate `frontend` and `backend` directories.

### Tech Stack

* **Frontend:** Angular, TypeScript, Bootstrap
* **Backend:** Java, Spring Boot (Web, JPA), Hibernate, H2 or any SQL database
* **Build:** Maven

### Running Locally

1. **Clone the repo:**

   ```bash
   git clone https://github.com/Patidarmadhuri/campus-recruitment-system.git
   cd campus-recruitment-system
   ```

2. **Backend:**

   ```bash
   cd backend
   ./mvnw spring-boot:run
   ```

   The REST API starts on `http://localhost:8080/api`.

3. **Frontend:**

   ```bash
   cd frontend
   npm install
   npm start
   ```

4. **Database:**

   By default the application uses an in‑memory H2 database.  Configure `application.properties` to use MySQL or PostgreSQL if needed.

### Repository Structure

```
campus-recruitment-system/
├── backend/
│   ├── pom.xml
│   └── src/main/java/com/example/campus/
│       ├── CampusRecruitmentApplication.java
│       ├── entity/
│       │   ├── Student.java
│       │   ├── Company.java
│       │   ├── Job.java
│       │   ├── Application.java
│       │   └── Interview.java
│       ├── repository/
│       │   ├── StudentRepository.java
│       │   ├── CompanyRepository.java
│       │   ├── JobRepository.java
│       │   ├── ApplicationRepository.java
│       │   └── InterviewRepository.java
│       ├── service/
│       │   ├── StudentService.java
│       │   ├── CompanyService.java
│       │   ├── JobService.java
│       │   ├── ApplicationService.java
│       │   └── InterviewService.java
│       └── controller/
│           ├── StudentController.java
│           ├── CompanyController.java
│           ├── JobController.java
│           ├── ApplicationController.java
│           └── InterviewController.java
├── frontend/
│   ├── package.json
│   ├── angular.json
│   └── src/app/
│       ├── app.module.ts
│       ├── app.component.ts
│       ├── app.component.html
│       ├── services/
│       │   ├── student.service.ts
│       │   ├── company.service.ts
│       │   ├── job.service.ts
│       │   ├── application.service.ts
│       │   └── interview.service.ts
│       └── ...
└── README.md
```

### Screenshots

Add screenshots of the student and company dashboards here once implemented.

### Topics/Tags

`java`, `spring-boot`, `angular`, `recruitment`, `full-stack`, `campus`