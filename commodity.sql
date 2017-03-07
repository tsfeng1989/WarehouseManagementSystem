create table tb_commodity
(
   c_id varchar2(32) primary key,
   c_name varchar2(100) not null,
   c_units varchar2(50) not null,
   c_quantity number not null,
   c_time date default sysdate not null,
   c_operator varchar2(50) not null
)
insert into tb_commodity values('P00003','º”∂‡±¶ª πﬁ','24∆ø/œ‰',121,sysdate,'kk');
commit;
select * from tb_commodity
--drop table tb_commodity