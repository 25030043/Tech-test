--ALTER USER sa SET PASSWORD '1895arcH';

CREATE TABLE if not exists Users(
  userID int(11) NOT NULL,
  firstName varchar(45),
  lastName varchar(45),
  userName varchar(45),
  password varchar(45),
  PRIMARY KEY (`userID`)

);

truncate table Users;