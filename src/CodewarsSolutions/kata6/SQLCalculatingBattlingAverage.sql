/*
Link: https://www.codewars.com/kata/5994dafcbddc2f116d000024/train/sql
 */
SELECT *
FROM (
  SELECT
    player_name,
    games,
    ROUND(hits/at_bats::DECIMAL, 3)::TEXT AS batting_average
    FROM yankees
    WHERE at_bats >= 100
) AS bat_stats
ORDER BY batting_average DESC;