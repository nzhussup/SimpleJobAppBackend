-- H2 Config
CREATE TABLE jobs (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(150) NOT NULL,
  country VARCHAR(50),
  city VARCHAR(50),
  requirements VARCHAR(255)
);

-- -- Postgres Config
-- CREATE TABLE jobs (
--   id SERIAL PRIMARY KEY,
--   name VARCHAR(150) NOT NULL,
--   country VARCHAR(50),
--   city VARCHAR(50),
--   requirements VARCHAR(255)
-- );
