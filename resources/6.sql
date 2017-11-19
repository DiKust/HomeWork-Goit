SELECT AVG(developers.salary)
FROM developers
  JOIN project_developers ON project_developers.developer_id = developers.id
  JOIN projects ON (projects.id = project_developers.project_id
                    AND project_ID IN (
    SELECT id
    FROM projects
    WHERE cost IN (SELECT min(projects.cost) FROM projects)
  )
    );