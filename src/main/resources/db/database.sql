DROP TABLE IF EXISTS skills;
DROP TABLE IF EXISTS persons;

CREATE TABLE persons (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    created TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
    updated TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE skills (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    persons_id INT REFERENCES persons(id) NOT NULL,
    created TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
    updated TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO persons VAlUES (1, 'user1');
INSERT INTO persons VAlUES (2, 'user2');
INSERT INTO persons VAlUES (3, 'user3');

INSERT INTO skills VAlUES (1, 'skill1', 1);
INSERT INTO skills VAlUES (2, 'skill2', 1);
INSERT INTO skills VAlUES (3, 'skill3', 1);
INSERT INTO skills VAlUES (4, 'skill1', 2);
INSERT INTO skills VAlUES (5, 'skill2', 2);
INSERT INTO skills VAlUES (6, 'skill3', 3);