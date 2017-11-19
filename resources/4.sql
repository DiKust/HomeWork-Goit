ALTER TABLE mysqlhomework.projects ADD Cost DECIMAL NOT NULL ;

UPDATE projects SET Cost = 35000.00 WHERE Name = 'Earth';
UPDATE projects SET Cost = 30000.00 WHERE Name = 'Mercury';
UPDATE projects SET Cost = 15000.00 WHERE Name = 'Venera';
UPDATE projects SET Cost = 25000.00 WHERE Name = 'Mars';
UPDATE projects SET Cost = 10000.00 WHERE Name = 'Jupiter';
UPDATE projects SET Cost = 30000.00 WHERE Name = 'Pluton';
UPDATE projects SET Cost = 50000.00 WHERE Name = 'Saturn';
UPDATE projects SET Cost = 45000.00 WHERE Name = 'Uran';
UPDATE projects SET Cost = 25000.00 WHERE Name = 'Neptun';
UPDATE projects SET Cost = 15000.00 WHERE Name = 'Moon';