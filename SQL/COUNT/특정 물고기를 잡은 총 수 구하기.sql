SELECT COUNT(I.ID) AS FISH_COUNT
FROM FISH_INFO I
JOIN FISH_NAME_INFO NI
USING(FISH_TYPE)
WHERE NI.FISH_NAME = 'BASS' OR NI.FISH_NAME = 'SNAPPER';
