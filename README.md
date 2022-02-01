# RePlanet

Simple Java desktop application for a waste collection system with MySQL connection and CRUD

In order to get ready:

- Install Apache NetBeans IDE
- Install MySQL
- Create a database called user_db, or you can change it to any other name you wish
- Create a table named users with the following columns:
  - id (INT, Primary Key, Not Null, Auto Incremental)
  - name (VARCHAR(45), Not Null)
  - mail (VARCHAR(45), Not Null)
  - username (VARCHAR(45), Not Null)
  - password (VARCHAR(45), Not Null)
  - birthday (date, Not Null)
  - score (INT, Not Null)
  - is_admin (binary, Not Null)
- Create a table named schedule with the following columns:
  - id (INT, Primary Key, Not Null, Auto Incremental)
  - userId (INT, Not Null)
  - city (VARCHAR(45), Not Null)
  - address (VARCHAR(45), Not Null)
  - homeType (VARCHAR(45), Not Null)
  - comments (VARCHAR(200))
  - payment (VARCHAR(45), Not Null)
  - clothes (INT, Not Null)
  - electronics (INT, Not Null)
  - toys (INT, Not Null)
  - instruments (INT, Not Null)
  - books (INT, Not Null)
  - furnis (INT, Not Null)
  - tools (INT, Not Null)
  - date (date, Not Null)
- Be sure the database name matches with db string in ConnectionDb.java file
- Edit the user and pass strings on ConnectionDb.java file (must match with your MySql credentials)
- Create the first user on the database in order to login
- Run the application
