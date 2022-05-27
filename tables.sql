CREATE TABLE User(
    uid INT AUTO_INCREMENT NOT NULL,
    username VARCHAR(15),
    password VARCHAR(30),
    email VARCHAR(30),
    profile_category VARCHAR(10),
    PRIMARY_KEY(uid)
)

CREATE TABLE Candid_User(
    uid INT NOT NULL,
    name VARCHAR(15),
    last_name VARCHAR(15),
    address VARCHAR(30),
    birth_date DATE(),
    nationality VARCHAR(15),
    phone_number VARCHAR(30),
    CONSTRAINT UserID FOREIGN KEY(uid) REFERENCES User(uid)
    ON DELETE CASCADE ON UPDATE CASCADE
)

CREATE TABLE Employer_User(
    uid INT NOT NULL,
    ,
    CONSTRAINT EmployerID FOREIGN KEY(uid) REFERENCES User(uid)
    ON DELETE CASCADE ON UPDATE CASCADE
)