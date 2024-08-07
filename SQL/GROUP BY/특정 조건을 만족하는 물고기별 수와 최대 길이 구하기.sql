SELECT CI AS FISH_COUNT, ML AS MAX_LENGTH, FISH_TYPE
FROM (SELECT FISH_TYPE, MAX(LENGTH) AS ML, AVG(IF(LENGTH < 10, 10, LENGTH)) AS AL, COUNT(ID) AS CI
      FROM FISH_INFO
      GROUP BY FISH_TYPE) AS T
WHERE AL >= 33
ORDER BY FISH_TYPE;
