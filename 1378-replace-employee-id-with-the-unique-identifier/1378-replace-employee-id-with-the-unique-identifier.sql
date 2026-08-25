# Write your MySQL query statement below
SELECT
   EmployeeUNI.unique_id, Employees.name
FROM Employees
LEFT JOIN EmployeeUni
    ON Employees.id = EmployeeUNI.id;