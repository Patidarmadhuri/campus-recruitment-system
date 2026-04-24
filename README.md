# Campus Recruitment System

Full-stack campus recruitment portal. Students register and apply for jobs. Companies post openings. The training & placement officer monitors and schedules interviews.

## Features
- Student module: register, manage profile, browse/apply for jobs
- Company module: post jobs, view applications, shortlist candidates
- TPO module: manage students & companies, schedule interviews
- Interview scheduling API
- REST API using Spring Boot
- Clean frontend/backend architecture

## Tech Stack
- Frontend: Angular, TypeScript, Bootstrap
- Backend: Java, Spring Boot (web, JPA), Hibernate, SQL (H2/MySQL/PostgreSQL)
- Build: Maven

## Running Locally
Clone repository, run backend with `./mvnw spring-boot:run` in `backend` directory (port 8080). Run frontend: `npm install` and `npm start` in `frontend` (port 4200). Default uses H2; adjust `application.properties` for MySQL/PostgreSQL.

## Repository Structure
The repository separates `backend` and `frontend` directories. The backend contains a Spring Boot project with entities, repositories, services and controllers for students, companies, jobs, applications and interviews. The frontend is an Angular application with services for each entity and components for dashboards.

## Screenshots
Add UI screenshots here once implemented.

## Topics/Tags
java, spring-boot, angular, full-stack, campus, recruitment
