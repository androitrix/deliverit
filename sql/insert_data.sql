INSERT INTO job (description, job_type, when_commitment_start, when_commitment_end) 
values 
('default', 'cleaning', sysdate(), sysdate());

INSERT INTO job (description, job_type, when_commitment_start, when_commitment_end) 
values 
('default', 'shining', sysdate(), sysdate());

insert into user (user_name, password, first_name, last_name) values ('root@xyz.com', 'pass', 'root', 'root');