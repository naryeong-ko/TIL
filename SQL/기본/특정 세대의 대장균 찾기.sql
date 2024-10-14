SELECT ID
FROM (SELECT ID, PARENT_ID
    FROM ECOLI_DATA
    WHERE PARENT_ID IN (SELECT ID
                    FROM ECOLI_DATA
                    WHERE PARENT_ID IN (SELECT ID
                                        FROM ECOLI_DATA
                                        WHERE PARENT_ID IS NULL))) AS A
ORDER BY ID;
