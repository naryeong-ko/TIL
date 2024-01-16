SELECT B.CATEGORY, SUM(SALES) AS TOTAL_SALES
FROM BOOK B
JOIN BOOK_SALES S
ON B.BOOK_ID = S.BOOK_ID
WHERE LEFT(S.SALES_DATE, 7) = '2022-01'
GROUP BY B.CATEGORY
ORDER BY CATEGORY;
