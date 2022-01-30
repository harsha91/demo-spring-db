create sequence hibernate_sequence start 1 increment 1;
create table test_table (id int8 not null, description varchar(255), title varchar(255), primary key (id));
