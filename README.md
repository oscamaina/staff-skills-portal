# Staff Skills Portal

This is a staff management system built using:
- **Backend:** Java Spring Boot
- **Frontend:** React.js
- **Database:** PostgreSQL

It allows staff to input personal details and view/edit records.


## Setup Instructions

### ** Clone the Project**
git clone https://github.com/oscamaina/staff-skills-portal
cd staff-skills-portal

### **Backend (Spring Boot)**
1. Navigate to the backend folder:
   cd backend
2. Install dependencies:
    mvn clean install
3. Run the application:
    mvn spring-boot:run


### **FrontEnd (React.js)**
1. Navigate to the backend folder:
   cd frontend
2. Install dependencies:
    npm install
3. Run the application:
    npm start

### **DB set up**
1. Ensure PostgreSQL is installed.
2. Create a new database:
    CREATE DATABASE staff_skills;
3. Import the database schema from database/staff_skills_dump.sql:
    psql -U your_user -d staff_skills -f database/staff_skills_dump.sql


