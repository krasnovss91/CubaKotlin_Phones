create table UNTITLED72_PHONE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PHONE_NUMBER integer not null,
    MODEL varchar(255),
    COMPANY varchar(255),
    PRICE integer,
    --
    primary key (ID)
);