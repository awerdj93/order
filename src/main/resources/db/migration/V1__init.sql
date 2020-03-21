CREATE TABLE orders
  (
     id          BIGSERIAL    NOT NULL PRIMARY KEY,
     customer_id BIGSERIAL,
     data jsonb
 );