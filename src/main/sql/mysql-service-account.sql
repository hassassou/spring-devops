CREATE USER 'springframework'@'localhost' IDENTIFIED BY 'mh';

GRANT SELECT ON springmh.* to 'springframework'@'localhost';
GRANT INSERT ON springmh.* to 'springframework'@'localhost';
GRANT UPDATE ON springmh.* to 'springframework'@'localhost';
GRANT DELETE ON springmh.* to 'springframework'@'localhost';