/*
Link: https://www.codewars.com/kata/580d08b5c049aef8f900007c/train/sql
 */
SELECT
  c.customer_id,
  c.email,
  COUNT(p.payment_id) AS payments_count,
  SUM(p.amount::FLOAT) AS total_amount
  FROM customer c
  JOIN payment p
  ON c.customer_id = p.customer_id
  GROUP BY c.customer_id
  ORDER BY total_amount DESC LIMIT 10;