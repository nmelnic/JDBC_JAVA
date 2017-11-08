Learn how to send SQL queries to the database and how to collect and process the results of a query.

Prerequisites:

Set up a Data base on local machine.

Example using MySQL:
- Download MySQL zip (https://dev.mysql.com/downloads/mysql/)
- Initialize the database by navigating to "..\mysql-5.7.xx\bin" using CMD (as admin) and execute "mysqld --initialize --console" command (TAKE NOTE of the PASSWORD)
- Start DB server using "mysqld --console" command
- Start a "Client" using another CMD shell and execute "mysql -u root -p"
- [Optional] To change password use "alter user 'root'@'localhost' identified by 'myNewPass';" command
- Create a new database called "automation_practice" using "create database if not exists automation_practice;"
- Select desired db "use automation_practice" and create a table as in example below:

CREATE TABLE Sales(
SalesOrderID int NOT NULL,
SalesOrderDetailID int NOT NULL,
OrderQty smallint NOT NULL,
ProductID int NOT NULL,
UnitPrice decimal(15,2) NOT NULL,
UnitPriceDiscount decimal(15,2) NOT NULL,
rowguid int NOT NULL,
ModifiedDate datetime NOT NULL );

- Insert a couple of rows with data as in example below:

INSERT INTO Sales (SalesOrderID,SalesOrderDetailID,OrderQty,ProductID,UnitPrice,UnitPriceDiscount,rowguid,ModifiedDate)
values (26271,110562,1,836,356.89,0.00,'1','2008-06-01 00:00:00.000'),
(26272,110563,1,822,356.89,0.00,'2','2008-06-01 00:00:00.000'),
(26273,110567,1,907,163.90,0.00,'3','2008-06-01 00:00:00.000'),
(26274,110616,4,905,218.45,0.00,'4','2008-06-01 00:00:00.000'),
(26275,110617,2,983,461.69,0.00,'5','2008-06-01 00:00:00.000'),
(26276,110618,6,988,112.99,0.40,'6','2008-06-01 00:00:00.000'),
(26277,110619,2,748,818.70,0.00,'7','2008-06-01 00:00:00.000'),
(26278,110620,1,990,323.99,0.00,'8','2008-06-01 00:00:00.000'),
(26279,110621,1,926,149.87,0.00,'9','2008-06-01 00:00:00.000');

Set up JDBC Driver

MySQL: https://mvnrepository.com/artifact/mysql/mysql-connector-java/6.0.6
MicrosoftSQL: https://mvnrepository.com/artifact/com.microsoft.sqlserver/mssql-jdbc/6.1.0.jre8
Set up JDK (http://www.oracle.com/technetwork/java/javase/downloads/index.html)
Set up an integrated development environment (IDE) on your preference, example IntelliJ IDEA (https://www.jetbrains.com/idea/download/#section=windows)

Practice: CRUD operations using java

Problem_1_Read: Create a method which will return result of any given Read query (select * from Sales where ..) taking into account that number of columns may vary.
Problem_2_Update: Update table and double quantity of all orders.
Problem_3_Delete: DELETE all rows with price less than 160.00.
Problem_4 Insert: INSERT a new row with the following data (26280,110567,1,905,140.90,0.00,'3','2008-06-01 00:00:00.000').
Problem_5_Bulk_insert: Create a CSV file (100 rows) with data and insert all data to "Sales" table using bulk insert.
