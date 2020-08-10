insert into users (id, name) values((select count(*) + 1 from users), 'XiaoDao');
insert into users (id, name) values((select count(*) + 1 from users), '公众号:java技术大本营');
insert into users (id, name) values((select count(*) + 1 from users), '微信:best396975802');
