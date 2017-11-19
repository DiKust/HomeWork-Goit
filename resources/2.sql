SELECT projects.Name, sum(developers.Salary)
FROM mysqlhomework.projects
JOIN project_developers ON project_developers.project_ID = project_ID
JOIN mysqlhomework.developers ON developer_ID = project_developers.project_ID
GROUP BY projects.Name
ORDER BY sum(developers.Salary) DESC
LIMIT 1;