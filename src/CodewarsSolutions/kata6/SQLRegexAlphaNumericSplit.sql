/*
Link: https://www.codewars.com/kata/594257d4db68b6e99200002c/train/sql
 */
SELECT project,
       regexp_replace(address, '[^A-Za-z]', '', 'g') AS letters,
       regexp_replace(address, '[^0-9]', '', 'g') AS numbers
FROM repositories;