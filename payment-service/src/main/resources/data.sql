DROP TABLE IF EXISTS PAYMENTS;

CREATE TABLE PAYMENTS(
    ID INTEGER PRIMARY KEY,
    name VARCHAR,
    amount NUMERIC
);

INSERT INTO PAYMENTS VALUES(1, 'TRANSACTION1', 56);
INSERT INTO PAYMENTS VALUES(2, 'TRANSACTION2', 77);
INSERT INTO PAYMENTS VALUES(3, 'TRANSACTION3', 88);