-- Seed data for user
insert into user (user_id, name, password, role) values (1, 'user1', 'user1', 'user');
insert into user (user_id, name, password, role) values (2, 'user2', 'user2', 'user');
insert into user (user_id, name, password, role) values (3, 'admin', 'admin', 'admin');

-- Seed data for Question
insert into question (question_id, name) values ('1', 'Domi Question1...');
insert into question (question_id, name) values ('2', 'Domi Question2...');
insert into question (question_id, name) values ('3', 'Domi Question3...');
insert into question (question_id, name) values ('4', 'Domi Question4...');
insert into question (question_id, name) values ('5', 'Domi Question5...');
insert into question (question_id, name) values ('6', 'Domi Question6...');
insert into question (question_id, name) values ('7', 'Domi Question7...');
insert into question (question_id, name) values ('8', 'Domi Question8...');
insert into question (question_id, name) values ('9', 'Domi Question9...');
insert into question (question_id, name) values ('10', 'Domi Question10...');
insert into question (question_id, name) values ('11', 'Domi Question11...');
insert into question (question_id, name) values ('12', 'Domi Question12...');
insert into question (question_id, name) values ('13', 'Domi Question13...');
insert into question (question_id, name) values ('14', 'Domi Question14...');
insert into question (question_id, name) values ('15', 'Domi Question15...');

-- Seed data for options
insert into options (option_id, name, question_id, is_answer) values (1, 'options1..', 1, true);
insert into options (option_id, name, question_id, is_answer) values (2, 'options2..', 1, false);
insert into options (option_id, name, question_id, is_answer) values (3, 'options3..', 1, false);
insert into options (option_id, name, question_id, is_answer) values (4, 'options4..', 1, false);


insert into options (option_id, name, question_id, is_answer) values (5, 'options1..', 2, false);
insert into options (option_id, name, question_id, is_answer) values (6, 'options2..', 2, true);
insert into options (option_id, name, question_id, is_answer) values (7, 'options3..', 2, false);
insert into options (option_id, name, question_id, is_answer) values (8, 'options4..', 2, false);


insert into options (option_id, name, question_id, is_answer) values (9, 'options1..', 3, false);
insert into options (option_id, name, question_id, is_answer) values (10, 'options2..', 3, false);
insert into options (option_id, name, question_id, is_answer) values (11, 'options3..', 3, true);
insert into options (option_id, name, question_id, is_answer) values (12, 'options4..', 3, false);


insert into options (option_id, name, question_id, is_answer) values (13, 'options1..', 4, false);
insert into options (option_id, name, question_id, is_answer) values (14, 'options2..', 4, false);
insert into options (option_id, name, question_id, is_answer) values (15, 'options3..', 4, false);
insert into options (option_id, name, question_id, is_answer) values (16, 'options4..', 4, true);


insert into options (option_id, name, question_id, is_answer) values (17, 'options1..', 5, true);
insert into options (option_id, name, question_id, is_answer) values (18, 'options2..', 5, false);
insert into options (option_id, name, question_id, is_answer) values (19, 'options3..', 5, false);
insert into options (option_id, name, question_id, is_answer) values (20, 'options4..', 5, false);


insert into options (option_id, name, question_id, is_answer) values (21, 'options1..', 6, false);
insert into options (option_id, name, question_id, is_answer) values (22, 'options2..', 6, true);
insert into options (option_id, name, question_id, is_answer) values (23, 'options3..', 6, false);
insert into options (option_id, name, question_id, is_answer) values (24, 'options4..', 6, false);


insert into options (option_id, name, question_id, is_answer) values (25, 'options1..', 7, false);
insert into options (option_id, name, question_id, is_answer) values (26, 'options2..', 7, false);
insert into options (option_id, name, question_id, is_answer) values (27, 'options3..', 7, true);
insert into options (option_id, name, question_id, is_answer) values (28, 'options4..', 7, false);


insert into options (option_id, name, question_id, is_answer) values (29, 'options1..', 8, false);
insert into options (option_id, name, question_id, is_answer) values (30, 'options2..', 8, false);
insert into options (option_id, name, question_id, is_answer) values (31, 'options3..', 8, false);
insert into options (option_id, name, question_id, is_answer) values (32, 'options4..', 8, true);


insert into options (option_id, name, question_id, is_answer) values (33, 'options1..', 9, true);
insert into options (option_id, name, question_id, is_answer) values (34, 'options2..', 9, false);
insert into options (option_id, name, question_id, is_answer) values (35, 'options3..', 9, false);
insert into options (option_id, name, question_id, is_answer) values (36, 'options4..', 9, false);


insert into options (option_id, name, question_id, is_answer) values (37, 'options1..', 10, false);
insert into options (option_id, name, question_id, is_answer) values (38, 'options2..', 10, true);
insert into options (option_id, name, question_id, is_answer) values (39, 'options3..', 10, false);
insert into options (option_id, name, question_id, is_answer) values (40, 'options4..', 10, false);


insert into options (option_id, name, question_id, is_answer) values (41, 'options1..', 11, false);
insert into options (option_id, name, question_id, is_answer) values (42, 'options2..', 11, false);
insert into options (option_id, name, question_id, is_answer) values (43, 'options3..', 11, true);
insert into options (option_id, name, question_id, is_answer) values (44, 'options4..', 11, false);


insert into options (option_id, name, question_id, is_answer) values (45, 'options1..', 12, false);
insert into options (option_id, name, question_id, is_answer) values (46, 'options2..', 12, false);
insert into options (option_id, name, question_id, is_answer) values (47, 'options3..', 12, false);
insert into options (option_id, name, question_id, is_answer) values (48, 'options4..', 12, true);


insert into options (option_id, name, question_id, is_answer) values (49, 'options1..', 13, true);
insert into options (option_id, name, question_id, is_answer) values (50, 'options2..', 13, false);
insert into options (option_id, name, question_id, is_answer) values (51, 'options3..', 13, false);
insert into options (option_id, name, question_id, is_answer) values (52, 'options4..', 13, false);


insert into options (option_id, name, question_id, is_answer) values (53, 'options1..', 14, false);
insert into options (option_id, name, question_id, is_answer) values (54, 'options2..', 14, true);
insert into options (option_id, name, question_id, is_answer) values (55, 'options3..', 14, false);
insert into options (option_id, name, question_id, is_answer) values (56, 'options4..', 14, false);


insert into options (option_id, name, question_id, is_answer) values (57, 'options1..', 15, false);
insert into options (option_id, name, question_id, is_answer) values (58, 'options2..', 15, false);
insert into options (option_id, name, question_id, is_answer) values (59, 'options3..', 15, true);
insert into options (option_id, name, question_id, is_answer) values (60, 'options4..', 15, false);


-- Seed data for result
insert into result (result_id, user_id, score) values (1, 1, 0);
insert into result (result_id, user_id, score) values (2, 2, 0);
