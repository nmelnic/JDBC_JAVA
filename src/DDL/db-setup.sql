create database if not exists automation_practice;

use automation_practice;

drop table if exists Sales;

CREATE TABLE `Sales` (
  `SalesOrderID` int NOT NULL,
  `SalesOrderDetailID` int NOT NULL,
  `OrderQty` smallint NOT NULL,
  `ProductID` int NOT NULL,
  `UnitPrice` decimal(15,2) NOT NULL,
  `UnitPriceDiscount` decimal(15,2) NOT NULL,
  `rowguid` int NOT NULL,
  `ModifiedDate` datetime NOT NULL
);

INSERT INTO `Sales` (`SalesOrderID`,`SalesOrderDetailID`,`OrderQty`,`ProductID`, `UnitPrice`, `UnitPriceDiscount`, `rowguid`, `ModifiedDate`) VALUES (26271,110562,1,836,356.89,0.00,'1','2008-06-01 00:00:00.000')
INSERT INTO `Sales` (`SalesOrderID`,`SalesOrderDetailID`,`OrderQty`,`ProductID`, `UnitPrice`, `UnitPriceDiscount`, `rowguid`, `ModifiedDate`) VALUES (26272,110563,1,822,356.89,0.00,'2','2008-06-01 00:00:00.000');
INSERT INTO `Sales` (`SalesOrderID`,`SalesOrderDetailID`,`OrderQty`,`ProductID`, `UnitPrice`, `UnitPriceDiscount`, `rowguid`, `ModifiedDate`) VALUES (26273,110567,1,907,163.90,0.00,'3','2008-06-01 00:00:00.000');
INSERT INTO `Sales` (`SalesOrderID`,`SalesOrderDetailID`,`OrderQty`,`ProductID`, `UnitPrice`, `UnitPriceDiscount`, `rowguid`, `ModifiedDate`) VALUES (26274,110616,4,905,218.45,0.00,'4','2008-06-01 00:00:00.000');
INSERT INTO `Sales` (`SalesOrderID`,`SalesOrderDetailID`,`OrderQty`,`ProductID`, `UnitPrice`, `UnitPriceDiscount`, `rowguid`, `ModifiedDate`) VALUES (26275,110617,2,983,461.69,0.00,'5','2008-06-01 00:00:00.000');
INSERT INTO `Sales` (`SalesOrderID`,`SalesOrderDetailID`,`OrderQty`,`ProductID`, `UnitPrice`, `UnitPriceDiscount`, `rowguid`, `ModifiedDate`) VALUES (26276,110618,6,988,112.99,0.40,'6','2008-06-01 00:00:00.000');
INSERT INTO `Sales` (`SalesOrderID`,`SalesOrderDetailID`,`OrderQty`,`ProductID`, `UnitPrice`, `UnitPriceDiscount`, `rowguid`, `ModifiedDate`) VALUES (26277,110619,2,748,818.70,0.00,'7','2008-06-01 00:00:00.000');
INSERT INTO `Sales` (`SalesOrderID`,`SalesOrderDetailID`,`OrderQty`,`ProductID`, `UnitPrice`, `UnitPriceDiscount`, `rowguid`, `ModifiedDate`) VALUES (26278,110620,1,990,323.99,0.00,'8','2008-06-01 00:00:00.000');
INSERT INTO `Sales` (`SalesOrderID`,`SalesOrderDetailID`,`OrderQty`,`ProductID`, `UnitPrice`, `UnitPriceDiscount`, `rowguid`, `ModifiedDate`) VALUES (26279,110621,1,926,149.87,0.00,'9','2008-06-01 00:00:00.000');



