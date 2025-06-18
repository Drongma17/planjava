Employee				Department

Id , EmpName , Salary, DeptId		Id , DeptName
1	Rohit	10000	2		1	Computer
2	Raj	15000	1		2	Maths
3	Sachin	10000	2		3	AI
4	Rahul	25000	1		4	History
5	Ajay	1000	1		4	History




SELECT e.name from Employee e JOIN Department d ON  e.DeptId = d.Id WHERE d.DeptName = "Computer" AND e.Salary > 10000;








-- ===============================================

-- SQL CODING TEST - JOIN Operations (10 minutes)

-- ===============================================

-- SCENARIO: E-commerce Order Management System

-- You need to analyze customer orders and product data


-- CUSTOMERS Table

CREATE TABLE Customers (

    CustomerID INT PRIMARY KEY,

    FirstName NVARCHAR(50),

    LastName NVARCHAR(50),

    Email NVARCHAR(100),

    City NVARCHAR(50),

    RegistrationDate DATE

);

-- ORDERS Table

CREATE TABLE Orders (

    OrderID INT PRIMARY KEY,

    CustomerID INT,

    OrderDate DATE,

    TotalAmount DECIMAL(10,2),

    Status NVARCHAR(20), -- 'Pending', 'Shipped', 'Delivered', 'Cancelled'

    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)

);

-- PRODUCTS Table

CREATE TABLE Products (

    ProductID INT PRIMARY KEY,

    ProductName NVARCHAR(100),

    Category NVARCHAR(50),

    Price DECIMAL(10,2),

    StockQuantity INT

);

-- ORDER_ITEMS Table (Junction table)

CREATE TABLE OrderItems (

    OrderItemID INT PRIMARY KEY,

    OrderID INT,

    ProductID INT,

    Quantity INT,

    UnitPrice DECIMAL(10,2),

    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),

    FOREIGN KEY (ProductID) REFERENCES Products(ProductID)

);

-- ===============================================

-- SAMPLE DATA (For context - not needed to insert)

-- ===============================================

/*

CUSTOMERS:

CustomerID | FirstName | LastName | Email              | City        | RegistrationDate

1          | John      | Smith    | john@email.com     | New York    | 2023-01-15

2          | Jane      | Doe      | jane@email.com     | Los Angeles | 2023-02-20

3          | Bob       | Johnson  | bob@email.com      | Chicago     | 2023-03-10

4          | Alice     | Brown    | alice@email.com    | Miami       | 2023-04-05

ORDERS:

OrderID | CustomerID | OrderDate  | TotalAmount | Status

101     | 1          | 2024-01-10 | 150.00      | Delivered

102     | 1          | 2024-02-15 | 75.50       | Shipped

103     | 2          | 2024-01-20 | 200.00      | Delivered

104     | 3          | 2024-03-01 | 89.99       | Pending

-- Note: Customer 4 (Alice) has no orders

PRODUCTS:

ProductID | ProductName | Category    | Price  | StockQuantity

201       | Laptop      | Electronics | 999.99 | 50

202       | Mouse       | Electronics | 25.99  | 100

203       | Keyboard    | Electronics | 49.99  | 75

204       | Monitor     | Electronics | 299.99 | 30

ORDER_ITEMS:

OrderItemID | OrderID | ProductID | Quantity | UnitPrice

1           | 101     | 201       | 1        | 999.99

2           | 101     | 202       | 2        | 25.99

3           | 102     | 203       | 1        | 49.99

4           | 103     | 201       | 1        | 999.99

5           | 104     | 202       | 3        | 25.99

*/

-- ===============================================

-- CODING EXERCISE

-- ===============================================

-- EXERCISE 1: INNER JOIN (Medium difficulty)

Write a query to show all orders with customer information and the total number of items per order

Required columns: CustomerName (FirstName + LastName), OrderID, OrderDate, Status, TotalItems

Only show orders that have items




SELECT
    c.FirstName + ' ' + c.LastName AS CustomerName,
    o.OrderID,
    o.OrderDate,
    o.Status,
    SUM(oi.Quantity) AS TotalItems
FROM
    Customers AS c
INNER JOIN
    Orders AS o ON c.CustomerID = o.CustomerID
INNER JOIN
    OrderItems AS oi ON o.OrderID = oi.OrderID
GROUP BY
    c.FirstName, c.LastName, o.OrderID, o.OrderDate, o.Status
ORDER BY
    o.OrderID;