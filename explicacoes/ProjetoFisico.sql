+----------+---------------+------+-----+---------------------+----------------+
| Field    | Type          | Null | Key | Default             | Extra          |
+----------+---------------+------+-----+---------------------+----------------+
| IDBANCO  | int(11)       | NO   | PRI | NULL                | auto_increment |
| AGENCIA  | varchar(150)  | YES  |     | NULL                |                |
| NOME     | varchar(300)  | YES  |     | NULL                |                |
| NUMERO   | int(11)       | NO   | UNI | NULL                |                |
| CPFCNPJ  | int(14)       | NO   | UNI | NULL                |                |
| RENDA    | double(150,2) | NO   |     | NULL                |                |
| DATETIME | timestamp     | NO   |     | current_timestamp() |                |
+----------+---------------+------+-----+---------------------+----------------+
