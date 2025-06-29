CREATE TABLE SavingsAccounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(50),
    Balance NUMBER(10,2)
);

INSERT INTO SavingsAccounts VALUES (201, 'Keerthana', 15000);
INSERT INTO SavingsAccounts VALUES (202, 'Husna', 22000);
INSERT INTO SavingsAccounts VALUES (203, 'Poushya', 18000);
INSERT INTO SavingsAccounts VALUES (204, 'Mahima', 12000);
INSERT INTO SavingsAccounts VALUES (205, 'Rachana', 25000);

COMMIT;

SELECT * FROM SavingsAccounts;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    FOR rec IN (SELECT AccountID, Balance FROM SavingsAccounts) LOOP
        UPDATE SavingsAccounts
        SET Balance=Balance+(Balance * 0.01)
        WHERE AccountID = rec.AccountID;
    END LOOP;
    
    COMMIT;
END;
/

BEGIN
    ProcessMonthlyInterest;
END;
/

SELECT * FROM SavingsAccounts;

