SELECT companies.Name, customers.First_Name,customers.Last_Name
FROM mysqlhomework.companies
JOIN companies_projects ON companies_projects.companies_ID = companies_ID
JOIN customers_projects ON customers_projects.customers_ID = customers_ID
JOIN customers ON customers_ID = customers_projects.customers_ID
JOIN mysqlhomework.projects ON companies_projects.project_ID = customers_projects.project_ID
GROUP BY companies_ID
ORDER BY sum(projects.Cost) ASC;
