-- JPA INCREMENT
CREATE SEQUENCE hibernate_sequence START 1;

-- TABLE
CREATE TABLE cooked_food(
    id serial PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    username VARCHAR(50) NOT NULL,
    created_on TIMESTAMP NOT NULL
);

COMMENT ON COLUMN cooked_food.id IS 'Identifier of entity. This is the primary key of the entity';
COMMENT ON COLUMN cooked_food.name IS 'Name of the cooked food';
COMMENT ON COLUMN cooked_food.username IS 'Username that cooked this food';
COMMENT ON COLUMN cooked_food.created_on IS 'The date that food was cooked';