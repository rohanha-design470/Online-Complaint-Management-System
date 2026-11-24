# Online Complaint Management System

A Spring Boot web application that allows users to submit complaints, track their complaint status by email, and lets an admin review submissions and update statuses.

## Tech Stack
- Java 17
- Spring Boot 3.5.5
- Spring MVC + Thymeleaf
- Spring Data JPA / Hibernate
- H2 In-Memory Database
- Maven
- HTML / CSS

## Features
- Submit complaints with customer name, email, category, subject, and description
- Automatically generate a complaint ID
- Track complaints by email
- Admin dashboard to view all complaints
- Update complaint status (Submitted, In Progress, Resolved, Rejected)
- Delete complaints
- Responsive user interface

## Run in Eclipse
1. Extract the project ZIP.
2. Open Eclipse and select File → Import → Maven → Existing Maven Projects.
3. Select the project folder and click Finish.
4. Wait for Maven dependencies to download.
5. Run `ComplaintManagementApplication.java`.
6. Open http://localhost:8080

## Application Pages
- Submit Complaint: `/`
- Track Complaint: `/track`
- Admin Dashboard: `/admin`
- H2 Database Console: `/h2-console`

## Developer
Rohan Ghansham Hajare

Java Developer | Spring Boot

> Demo project for learning purposes. Admin access is not protected by authentication.
