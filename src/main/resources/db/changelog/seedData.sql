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

-- Seed data for Options
insert into option (name, question_id, is_answer) values ('Option1..', '1', true);
insert into option (name, question_id, is_answer) values ('Option2..', '1', false);
insert into option (name, question_id, is_answer) values ('Option3..', '1', false);
insert into option (name, question_id, is_answer) values ('Option4..', '1', false);


insert into option (name, question_id, is_answer) values ('Option1..', '2', false);
insert into option (name, question_id, is_answer) values ('Option2..', '2', true);
insert into option (name, question_id, is_answer) values ('Option3..', '2', false);
insert into option (name, question_id, is_answer) values ('Option4..', '2', false);


insert into option (name, question_id, is_answer) values ('Option1..', '3', false);
insert into option (name, question_id, is_answer) values ('Option2..', '3', false);
insert into option (name, question_id, is_answer) values ('Option3..', '3', true);
insert into option (name, question_id, is_answer) values ('Option4..', '3', false);


insert into option (name, question_id, is_answer) values ('Option1..', '4', false);
insert into option (name, question_id, is_answer) values ('Option2..', '4', false);
insert into option (name, question_id, is_answer) values ('Option3..', '4', false);
insert into option (name, question_id, is_answer) values ('Option4..', '4', true);


insert into option (name, question_id, is_answer) values ('Option1..', '5', true);
insert into option (name, question_id, is_answer) values ('Option2..', '5', false);
insert into option (name, question_id, is_answer) values ('Option3..', '5', false);
insert into option (name, question_id, is_answer) values ('Option4..', '5', false);


insert into option (name, question_id, is_answer) values ('Option1..', '6', false);
insert into option (name, question_id, is_answer) values ('Option2..', '6', true);
insert into option (name, question_id, is_answer) values ('Option3..', '6', false);
insert into option (name, question_id, is_answer) values ('Option4..', '6', false);


insert into option (name, question_id, is_answer) values ('Option1..', '7', false);
insert into option (name, question_id, is_answer) values ('Option2..', '7', false);
insert into option (name, question_id, is_answer) values ('Option3..', '7', true);
insert into option (name, question_id, is_answer) values ('Option4..', '7', false);


insert into option (name, question_id, is_answer) values ('Option1..', '8', false);
insert into option (name, question_id, is_answer) values ('Option2..', '8', false);
insert into option (name, question_id, is_answer) values ('Option3..', '8', false);
insert into option (name, question_id, is_answer) values ('Option4..', '8', true);


insert into option (name, question_id, is_answer) values ('Option1..', '9', true);
insert into option (name, question_id, is_answer) values ('Option2..', '9', false);
insert into option (name, question_id, is_answer) values ('Option3..', '9', false);
insert into option (name, question_id, is_answer) values ('Option4..', '9', false);


insert into option (name, question_id, is_answer) values ('Option1..', '10', false);
insert into option (name, question_id, is_answer) values ('Option2..', '10', true);
insert into option (name, question_id, is_answer) values ('Option3..', '10', false);
insert into option (name, question_id, is_answer) values ('Option4..', '10', false);


insert into option (name, question_id, is_answer) values ('Option1..', '11', false);
insert into option (name, question_id, is_answer) values ('Option2..', '11', false);
insert into option (name, question_id, is_answer) values ('Option3..', '11', true);
insert into option (name, question_id, is_answer) values ('Option4..', '11', false);


insert into option (name, question_id, is_answer) values ('Option1..', '12', false);
insert into option (name, question_id, is_answer) values ('Option2..', '12', false);
insert into option (name, question_id, is_answer) values ('Option3..', '12', false);
insert into option (name, question_id, is_answer) values ('Option4..', '12', true);


insert into option (name, question_id, is_answer) values ('Option1..', '13', true);
insert into option (name, question_id, is_answer) values ('Option2..', '13', false);
insert into option (name, question_id, is_answer) values ('Option3..', '13', false);
insert into option (name, question_id, is_answer) values ('Option4..', '13', false);


insert into option (name, question_id, is_answer) values ('Option1..', '14', false);
insert into option (name, question_id, is_answer) values ('Option2..', '14', true);
insert into option (name, question_id, is_answer) values ('Option3..', '14', false);
insert into option (name, question_id, is_answer) values ('Option4..', '14', false);


insert into option (name, question_id, is_answer) values ('Option1..', '15', false);
insert into option (name, question_id, is_answer) values ('Option2..', '15', false);
insert into option (name, question_id, is_answer) values ('Option3..', '15', true);
insert into option (name, question_id, is_answer) values ('Option4..', '15', false);


-- Seed data for result
insert into result (result_id, user_id, score) values (1, 1, 0);
insert into result (result_id, user_id, score) values (2, 2, 0);
