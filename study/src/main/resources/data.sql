insert into member (username,nickname,password_hash,is_lock,is_super_user) values ('admin', '管理者','$2a$08$zO81PRobOTexjgnMXRanvOYj5OV2nWNXiV9pOfdZz1IeG/NIYIDmi', false, true);
insert into member (username,nickname,password_hash,is_lock,is_super_user) values ('testUser1', 'テストユーザー1','$2a$08$zO81PRobOTexjgnMXRanvOYj5OV2nWNXiV9pOfdZz1IeG/NIYIDmi', false, false);
insert into member (username,nickname,password_hash,is_lock,is_super_user) values ('testUser2', 'テストユーザー2','$2a$08$zO81PRobOTexjgnMXRanvOYj5OV2nWNXiV9pOfdZz1IeG/NIYIDmi', false, false);
insert into member (username,nickname,password_hash,is_lock,is_super_user) values ('testUser3', 'テストユーザー3','$2a$08$zO81PRobOTexjgnMXRanvOYj5OV2nWNXiV9pOfdZz1IeG/NIYIDmi', true, false);
insert into member (username,nickname,password_hash,is_lock,is_super_user) values ('testUser4', 'テストユーザー4','$2a$08$zO81PRobOTexjgnMXRanvOYj5OV2nWNXiV9pOfdZz1IeG/NIYIDmi', false, false);

insert into task (task_name,task_status,priority,owner_menber_id,deadline) values ('牛乳を買う',0,20,1,'2019-08-28');
insert into task (task_name,task_status,priority,owner_menber_id,deadline) values ('卵を買う',0,20,1,'2019-08-29');
insert into task (task_name,task_status,priority,owner_menber_id,deadline) values ('お米を買う',0,20,1,'2019-08-30');