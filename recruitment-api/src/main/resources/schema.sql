CREATE TABLE resource (
  id          BIGINT GENERATED BY DEFAULT AS IDENTITY (
  START WITH 1 ),
  description VARCHAR(255),
  name        VARCHAR(255),
  PRIMARY KEY (id)
);