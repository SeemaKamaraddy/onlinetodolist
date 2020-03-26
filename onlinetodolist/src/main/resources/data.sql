DROP TABLE IF EXISTS tasks;
 
CREATE TABLE tasks (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  create_dt TIMESTAMP NOT NULL,
  description VARCHAR(255) NOT NULL,
  status VARCHAR(255) NOT NULL,
  user_id VARCHAR(255) NOT NULL,
  last_update_date TIMESTAMP
);
 
INSERT INTO tasks (create_dt, description, status,user_id,last_update_date) VALUES
  ('2012-09-17 18:47:52.69', 'Task1', 'New','Seema','2012-09-17 18:47:52.69'),
  ('2012-09-17 18:47:52.69', 'Task2', 'New','Suma','2012-09-17 18:47:52.69'),
  ('2012-09-17 18:47:52.69', 'Task3', 'New','Susan','2012-09-17 18:47:52.69');