SELECT II.ITEM_ID, II.ITEM_NAME
FROM ITEM_TREE IT
JOIN ITEM_INFO II
ON II.ITEM_ID = IT.ITEM_ID
WHERE IT.PARENT_ITEM_ID IS NULL
ORDER BY 1;
