1. Using Postman (Port Number: 8081)
Postman is a powerful API testing tool used to send HTTP requests to your backend server. In this project, we use port 8081 and perform the following HTTP methods:

Step-by-Step Process:
Set up the server to run on port 8081 (usually defined in your backend project configuration).

Launch Postman and set the request type from the dropdown to one of:

GET – To retrieve data

POST – To insert new records

PUT – To update existing records

DELETE – To remove records

Set the URL as:

bash
Copy
Edit
http://localhost:8081/api/placement
Request Examples:

GET:

Purpose: Fetch all placements

URL: GET http://localhost:8081/api/placement

POST:

Purpose: Add new placement

URL: POST http://localhost:8081/api/placement

Body (JSON):

json
Copy
Edit
{
  "company_name": "Infosys",
  "job_title": "Software Engineer",
  "placement_date": "2025-02-10",
  "student_id": 202501001
}
PUT:

Purpose: Update an existing placement

URL: PUT http://localhost:8081/api/placement/{id}

Body (JSON):

json
Copy
Edit
{
  "company_name": "TCS",
  "job_title": "Developer",
  "placement_date": "2025-03-01",
  "student_id": 202501002
}
DELETE:

Purpose: Delete a placement

URL: DELETE http://localhost:8081/api/placement/{id}

Check Response: Each request returns a status (e.g., 200 OK, 201 Created, 404 Not Found) and response body for confirmation.

2. Using pgAdmin for Database
pgAdmin is a GUI tool for managing PostgreSQL databases. You used it to manage your placement database.

Step-by-Step Process:
Open pgAdmin and connect to your PostgreSQL server.

Create a Database:

Right-click on Databases → Create → Database

Name: placement

Click Save

Create a Table:

Navigate to placement database → Schemas → public → Tables

Right-click → Create → Table

Table Name: placement

Add Columns:

id – integer, Primary Key, set as Identity (Always)

company_name – text

job_title – text

placement_date – date

student_id – bigint

Save the Table

View or Modify Data:

Right-click on placement → View/Edit Data → All Rows

Here, you can insert, update, or delete records manually.
