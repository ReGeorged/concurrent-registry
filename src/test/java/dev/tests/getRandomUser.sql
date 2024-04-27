WITH activate_local_users AS (
    SELECT n.* FROM users AS n
    INNER JOIN user_roles AS r
    ON n.id = r.user_id
    WHERE r.role_id = 1
    AND n.active = TRUE
    LIMIT 100
)
SELECT * FROM activate_local_users
ORDER BY RANDOM() LIMIT 1;
