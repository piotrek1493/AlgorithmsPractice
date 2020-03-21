/*
Link: https://www.codewars.com/kata/58113c03009b4fcc66000d29/train/sql
 */
SELECT
  d.id,
  d.name
  FROM departments d
  WHERE d.id IN (SELECT
                  department_id
                  FROM sales
                  WHERE price > 98.00);