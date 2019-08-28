drop table IF EXISTS member;
create table member(
    user_id BIGINT auto_increment,
    user_name VARCHAR(20) NOT NULL,
    nick_name VARCHAR(40) NOT NULL,
    password_hash VARCHAR(60) NOT NULL,
    is_lock boolean
    is_super_user boolean
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

