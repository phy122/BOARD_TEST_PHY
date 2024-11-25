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

INSERT INTO `board` (`id`, `title`, `writer`, `content`) VALUES
('user1', 'Post Title 1', 'Writer 1', 'This is the content of post 1.'),
('user2', 'Post Title 2', 'Writer 2', 'This is the content of post 2.'),
('user3', 'Post Title 3', 'Writer 3', 'This is the content of post 3.'),
('user4', 'Post Title 4', 'Writer 4', 'This is the content of post 4.'),
('user5', 'Post Title 5', 'Writer 5', 'This is the content of post 5.'),
('user6', 'Post Title 6', 'Writer 6', 'This is the content of post 6.'),
('user7', 'Post Title 7', 'Writer 7', 'This is the content of post 7.'),
('user8', 'Post Title 8', 'Writer 8', 'This is the content of post 8.'),
('user9', 'Post Title 9', 'Writer 9', 'This is the content of post 9.'),
('user10', 'Post Title 10', 'Writer 10', 'This is the content of post 10.'),
('user11', 'Post Title 11', 'Writer 11', 'This is the content of post 11.'),
('user12', 'Post Title 12', 'Writer 12', 'This is the content of post 12.'),
('user13', 'Post Title 13', 'Writer 13', 'This is the content of post 13.'),
('user14', 'Post Title 14', 'Writer 14', 'This is the content of post 14.'),
('user15', 'Post Title 15', 'Writer 15', 'This is the content of post 15.'),
('user16', 'Post Title 16', 'Writer 16', 'This is the content of post 16.'),
('user17', 'Post Title 17', 'Writer 17', 'This is the content of post 17.'),
('user18', 'Post Title 18', 'Writer 18', 'This is the content of post 18.'),
('user19', 'Post Title 19', 'Writer 19', 'This is the content of post 19.'),
('user20', 'Post Title 20', 'Writer 20', 'This is the content of post 20.'),
('user21', 'Post Title 21', 'Writer 21', 'This is the content of post 21.'),
('user22', 'Post Title 22', 'Writer 22', 'This is the content of post 22.'),
('user23', 'Post Title 23', 'Writer 23', 'This is the content of post 23.')