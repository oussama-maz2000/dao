create table lgl_address(
LGL_ADDRESS_ID bigint not null primary key auto_increment,
LGL_ADDRESS_ADDRESS_ADDRESS varchar(40) not null,
LGL_ADDRESS_STREET  varchar(50) not null,
LGL_ADDRESS_CITY  varchar(20) not null,
LGL_ADDRESS_STATE  varchar(20) not null,
LGL_ADDRESS_LONGITUDE double not null,
LGL_ADDRESS_LATITUDE  double not null,
LGL_ADDRESS_CLUSTER int not null,
LGL_ADDRESS_LAST_UPDATE timestamp not null);

create table lgl_user(
LGL_USER_ID bigint not null primary key auto_increment,
LGL_USER_FIRST_NAME varchar(30) not null,
LGL_USER_LAST_NAME  varchar(30) not null,
LGL_USER_EMAIL      varchar(30) not null,
LGL_USER_PASSWORD   varchar(30) not null,
LGL_USER_PHONE      varchar(20) not null,
LGL_USER_TYPE       int not null,
LGL_USER_JOB        varchar(30) null,
LGL_USER_CREATED_AT timestamp not null,
);

create table lgl_company(
LGL_COMPANY_ID bigint not null primary key auto_increment,
LGL_COMPANY_NAME varchar(30) not null,
LGL_COMPANY_EMAIL varchar(30) not null,
LGL_COMPANY_PHONE varchar(30) not null,
LGL_COMPANY_TYPE varchar(30) not null,
LGL_COMPANY_DESCRIPTION varchar(100) not null,
LGL_COMPANY_DISABLE Boolean not null,
LGL_COMPANY_CREATED_AT timestamp not null,
LGL_FK_USER_ID bigint not null,
LGL_FK_ADDRESS_ID bigint not null,
foreign key(LGL_FK_ADDRESS_ID) references lgl_address(LGL_ADDRESS_ID),
foreign key(LGL_FK_USER_ID) references lgl_user(LGL_USER_ID)
);

create table lgl_deposit_request(
LGL_DEPOSIT_REQUEST_ID  bigint not null primary key auto_increment,
LGL_DEPOSIT_REQUEST_IMG longblob  null ,
LGL_DEPOSIT_REQUEST_TEXT varchar(255) null,
LGL_DEPOSIT_REQUEST_SERVICE_TYPE varchar (50) not null,
LGL_DEPOSIT_REQUEST_RECEIVED_TIME timestamp not null,
LGL_DEPOSIT_REQUEST_LONGITUDE double not null,
LGL_DEPOSIT_REQUEST_LATITUDE double not null,
LGL_DEPOSIT_REQUEST_STATUS int not null,
LGL_FK_USER_ID bigint not null,
foreign key(LGL_FK_USER_ID) references lgl_user(LGL_USER_ID)
);