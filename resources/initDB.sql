CREATE TABLE IF NOT EXISTS developers(
  ID INT PRIMARY KEY ,
  First_Name VARCHAR(50) NOT NULL ,
  Last_Name VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS  skills(
  ID INT PRIMARY KEY ,
  Name VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS projects(
  ID INT PRIMARY KEY ,
  Name VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS companies(
  ID INT PRIMARY KEY ,
  Name VARCHAR(50) ,
  Address VARCHAR(100)
);

CREATE  TABLE IF NOT EXISTS customers(
  ID INT PRIMARY KEY ,
  First_Name VARCHAR(50),
  Last_Name VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS developer_skills(
  developer_ID INT NOT NULL ,
  skill_ID INT NOT NULL ,
  FOREIGN KEY (developer_ID) REFERENCES developers (ID),
  FOREIGN KEY (skill_ID) REFERENCES skills (ID),
  UNIQUE (developer_ID, skill_ID)
#   PRIMARY KEY (developer_ID, skill_ID)
);

CREATE TABLE IF NOT EXISTS project_developers(
  project_ID INT NOT NULL ,
  developer_ID INT NOT NULL ,
#   FOREIGN KEY (project_ID) REFERENCES projects (ID),
#   FOREIGN KEY (developer_ID) REFERENCES developers (ID),
#   UNIQUE (project_ID, developer_ID)
  PRIMARY KEY (project_ID,developer_ID)
);

CREATE TABLE IF NOT EXISTS companies_projects(
  companies_ID INT NOT NULL ,
  project_ID INT NOT NULL ,
#   FOREIGN KEY (companies_ID) REFERENCES companies (ID),
#   FOREIGN KEY (project_ID) REFERENCES projects (ID),
#   UNIQUE (companies_ID,project_ID)
  PRIMARY KEY (companies_ID, project_ID)
);

CREATE TABLE IF NOT EXISTS customers_projects(
  customers_ID INT NOT NULL ,
  project_ID INT NOT NULL ,
  PRIMARY KEY (customers_ID, project_ID)
#   FOREIGN KEY (customers_ID) REFERENCES customers (ID),
#   FOREIGN KEY (project_ID) REFERENCES projects (ID),
#   UNIQUE (customers_ID,project_ID)
);

DROP TABLE projects;

