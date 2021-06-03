create table ITEM
(
    ID INT auto_increment,
    NAME VARCHAR2(50),
    DESCRIPTION VARCHAR2(200),
    constraint ITEM_PK
        primary key (ID)
);
