/*
Link: https://www.codewars.com/kata/582cba7d3be8ce3a8300007c/train/sql
 */
SELECT
  s.transaction_date::DATE AS day,
  d.name AS department,
  COUNT(s.id) AS sale_count
  FROM sale s
  INNER JOIN department d
  ON s.department_id = d.id
  GROUP BY department, day
  ORDER BY day ASC;