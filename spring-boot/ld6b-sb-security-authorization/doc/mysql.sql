use livedb1;
CREATE TABLE `user` (
  `id` int NOT NULL,
  `active` bit(1) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `roles` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
)

select  * from user;
insert into user values(1, 1,'userpass', 'ROLE_USER', 'user');
insert into user values(2, 1,'adminpass', 'ROLE_ADMIN', 'admin');
commit;