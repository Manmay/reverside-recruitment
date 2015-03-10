insert into resource (name, description) values('task-1', 'task-one');
insert into resource (name, description) values('task-2', 'task-two');
insert into resource (name, description) values('task-3', 'task-three');



INSERT INTO  users (username,password,firstname,lastname,emailid,enabled) VALUES ('Pradyumna','12345','pradyumna','swain','pradyumnaswain76@gmail.com',TRUE );
INSERT INTO  users (username,password,firstname,lastname,emailid,enabled) VALUES ('Jamie','23456','jimmy','seletsoane','jseletsoane@gmail.com',TRUE );
INSERT INTO  users (username,password,firstname,lastname,emailid,enabled) VALUES ('ManMay','34567','manmay','mohanty','manmay@gmail.com',FALSE );

INSERT INTO   user_roles (username,role) VALUES ('Pradyumna','ROLE_CLIENT');
INSERT INTO   user_roles (username,role) VALUES ('Jamie','ROLE_CANDIDATE');
INSERT INTO   user_roles (username,role) VALUES ('Manmay','ROLE_ADMIN');