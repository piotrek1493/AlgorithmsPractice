/*
Link: https://www.codewars.com/kata/5811597e9d278beb04000038/train/sql
 */
SELECT
  COUNT(*),
  CAST(created_at AS date) AS day,
  description
FROM events
WHERE name = 'trained'
GROUP BY CAST(created_at AS date),
         description
ORDER BY day;