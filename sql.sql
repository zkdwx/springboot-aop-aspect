-- 创建表
CREATE TABLE `log` (
  `className` varchar(50) DEFAULT NULL,
  `methodName` varchar(50) DEFAULT NULL,
  `params` varchar(50) DEFAULT NULL,
  `exeuTime` varchar(50) DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `createDate` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8

-- 查询
SELECT * FROM LOG

-- 插入
INSERT INTO LOG(className,methodName,params,exeuTime,remark,createDate)
VALUES ('1','2','3','13:00','5','2019-11-5')