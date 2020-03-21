/*
Link: https://www.codewars.com/kata/58167fa1f544130dcf000317/train/sql
 */

SELECT
  MIN(score) AS min,
  PERCENTILE_DISC(0.5) WITHIN GROUP(ORDER BY score)::FLOAT AS median,
  MAX(score) AS max
FROM result
INNER JOIN student
ON student.id = result.student_id;