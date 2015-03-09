CREATE TABLE resource (
  id          BIGINT GENERATED BY DEFAULT AS IDENTITY (
  START WITH 1 ),
  description VARCHAR(255),
  name        VARCHAR(255),
  PRIMARY KEY (id)
);

CREATE TABLE users (
  username VARCHAR_IGNORECASE(50) NOT NULL PRIMARY KEY,
  password VARCHAR_IGNORECASE(50) NOT NULL,
  enabled BOOLEAN NOT NULL
);

CREATE TABLE user_roles(
  user_role_id bigint NOT NULL generated by default as identity (start with 1),
  username VARCHAR_IGNORECASE(50) NOT NULL,
  role VARCHAR_IGNORECASE(50) NOT NULL,
  PRIMARY KEY (user_role_id),
  UNIQUE (username,role),
  CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES users (username)
);
CREATE UNIQUE index fk_username_idx on user_roles (username);