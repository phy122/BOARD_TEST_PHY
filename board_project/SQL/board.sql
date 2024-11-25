CREATE TABLE `board` (
  `no` int NOT NULL AUTO_INCREMENT,
  `id`	VARCHAR(255)	NOT NULL,
  `title` varchar(100) NOT NULL,
  `writer` varchar(100) NOT NULL,
  `content` text,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`no`)
) ;
DROP TABLE IF EXISTS board;