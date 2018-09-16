--考试种类表：  公务员、四六级、托福
--ID、名称、排序、说明
drop table IF EXISTS `exam_catalog`;
CREATE TABLE `exam_catalog` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` nvarchar(50) COMMENT '种类名称',
  `descr` nvarchar(200) COMMENT '描述',
  `order_num` int COMMENT '排序',
  `del` tinyint DEFAULT 0 COMMENT '是否删除  1：已删除  0：正常',
  `dcreate_by` bigint,
  `dcreate_date` datetime,
  `dupdate_by` bigint,
  `update_date` datetime,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考题类别';

INSERT INTO `exam_catalog`(`id`, `name`, `order_num`) VALUES (1, '大学英语四级', '1',);
INSERT INTO `exam_catalog`(`id`, `name`, `order_num`) VALUES (2, '大学英语六级', '2');
INSERT INTO `exam_catalog`(`id`, `name`, `order_num`) VALUES (3, '公务员', '3';
INSERT INTO `exam_catalog`(`id`, `name`, `order_num`) VALUES (4, '司法考试', '4');
INSERT INTO `exam_catalog`(`id`, `name`, `order_num`) VALUES (5, '软考', '5');

--区域表：  省份，区域（中国区）
--ID、名称、排序
drop table IF EXISTS `exam_area`;
CREATE TABLE `exam_area` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` nvarchar(50) COMMENT '地区名称',
  `order_num` int COMMENT '排序',
  `del` tinyint DEFAULT 0 COMMENT '是否删除  1：已删除  0：正常',
  `dcreate_by` bigint,
  `dcreate_date` datetime,
  `dupdate_by` bigint,
  `update_date` datetime,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考题地区';

INSERT INTO `exam_area`(`id`, `name`, `order_num`) VALUES (1, '国家统一', '1');
INSERT INTO `exam_area`(`id`, `name`, `order_num`) VALUES (2, '北京', '2');
INSERT INTO `exam_area`(`id`, `name`, `order_num`) VALUES (3, '天津', '3');
INSERT INTO `exam_area`(`id`, `name`, `order_num`) VALUES (4, '重庆', '4');
INSERT INTO `exam_area`(`id`, `name`, `order_num`) VALUES (5, '上海', '5');
INSERT INTO `exam_area`(`id`, `name`, `order_num`) VALUES (6, '广州', '6');
INSERT INTO `exam_area`(`id`, `name`, `order_num`) VALUES (7, '河南', '7');

--考题类型表：  类型（枚举：选择，填空，阅读理解， 写作， 听力理解，翻译等）
--IID， 名称， 说明， 类型（枚举：选择，填空，阅读理解， 写作， 听力理解，翻译等）
drop table IF EXISTS `exam_type`;
CREATE TABLE `exam_type` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` nvarchar(100) COMMENT '试题类型名称',
  `exam_type` TINYINT(2) COMMENT '题型 作用不大 只是为了说明',
  `descr` nvarchar(200) COMMENT '描述',
  `del` tinyint DEFAULT 0 COMMENT '是否删除  1：已删除  0：正常',
  `dcreate_by` bigint,
  `dcreate_date` datetime,
  `dupdate_by` bigint,
  `update_date` datetime,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考题类型表';

INSERT INTO `exam_type`(`id`, `name`, `exam_type`) VALUES (1, '选择题', 'SELECTED');
INSERT INTO `exam_type`(`id`, `name`, `exam_type`) VALUES (2, '完成填写', 'FINISH_FILL');
INSERT INTO `exam_type`(`id`, `name`, `exam_type`) VALUES (4, '多择题', 'MULTI_SELECTED');
INSERT INTO `exam_type`(`id`, `name`, `exam_type`) VALUES (5, '写作', 'WRITTEN');
INSERT INTO `exam_type`(`id`, `name`, `exam_type`) VALUES (6, '简答', 'SIMPLE_ANSWER');
INSERT INTO `exam_type`(`id`, `name`, `exam_type`) VALUES (7, '翻译', 'TRANSLATE');



--试卷名称
--ID，区域ID，种类ID，名称，时长，分值，说明
drop table IF EXISTS `exam_paper`;
CREATE TABLE `exam_paper` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `area_id` bigint COMMENT '区域ID',
  `catalog_id` bigint COMMENT '种类ID',
  `name` nvarchar(200) COMMENT '试卷名称',
  `duration` tinyint COMMENT '时长',
  `score` tinyint COMMENT '分值',
  `closed` tinyint DEFAULT 0 COMMENT '考试类型，0开卷 1闭卷',
  `descr` nvarchar(200) COMMENT '描述',
  `del` tinyint DEFAULT 0 COMMENT '是否删除  1：已删除  0：正常',
  `dcreate_by` bigint,
  `dcreate_date` datetime,
  `dupdate_by` bigint,
  `update_date` datetime,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='试卷名称';


--试卷类型关系表
--ID，试卷ID，题型ID，分值，时长（计划），说明
drop table IF EXISTS `exam_paper_relation`;
CREATE TABLE `exam_paper_relation` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `paper_id` bigint COMMENT '试卷ID',
  `type_id` bigint COMMENT '试题ID',
  `scroe` tinyint COMMENT '分值',
  `duration` tinyint COMMENT '时长',
  `descr` nvarchar(200) COMMENT '说明',
  `del` tinyint DEFAULT 0 COMMENT '是否删除  1：已删除  0：正常',
  `dcreate_by` bigint,
  `dcreate_date` datetime,
  `dupdate_by` bigint,
  `update_date` datetime,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='试卷类型关系表';


--考题表：
--ID、区域ID、试卷ID、类型ID、题目、选项、答案、考题类型、分值、是否删除、创建人、创建时间、更新人、更新时间
drop table IF EXISTS `exam_item`;
CREATE TABLE `exam_item` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `catalog_id` bigint COMMENT '种类ID',
  `area_id` bigint COMMENT '区域ID',
  `paper_id` bigint COMMENT '试券ID',
  `type_id` bigint COMMENT '类型ID',
  `question_type` TINYINT(4) COMMENT '考题类型 ，枚举，选择题，填写...',
  `score` TINYINT(4) COMMENT '分值',

  `question` TEXT COMMENT '内容，此内容为后台管理添加',
  `selections` TEXT COMMENT '内容，此内容为后台管理添加',
  `answer` TEXT COMMENT '内容，此内容为后台管理添加',
  `del` tinyint DEFAULT 0 COMMENT '是否删除  1：已删除  0：正常',
  `dcreate_by` bigint,
  `dcreate_date` datetime,
  `dupdate_by` bigint,
  `update_date` datetime,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考题表';


--解题分析表
--ID，考题ID, 分析，说明，
drop table IF EXISTS `exam_item_analysis`;
CREATE TABLE `exam_item_analysis` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `item_id` bigint COMMENT '题类名称',
  `user_id` bigint COMMENT '分析人',
  `analysis` TEXT COMMENT '分析',
  `del` tinyint DEFAULT 0 COMMENT '是否删除  1：已删除  0：正常',
  `dcreate_by` bigint,
  `dcreate_date` datetime,
  `dupdate_by` bigint,
  `update_date` datetime,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='解题分析表';


--
--纠错日志表
--ID，用户ID，时间，原题ID,原题，新题，用户名称
drop table IF EXISTS `exam_item_log`;
CREATE TABLE `exam_item_log` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `item_id` bigint COMMENT '题类名称',
  `item_old` TEXT COMMENT '原题',
  `item_new` TEXT COMMENT '新题',
  `del` tinyint DEFAULT 0 COMMENT '是否删除  1：已删除  0：正常',
  `dcreate_by` bigint,
  `dcreate_date` datetime,
  `dupdate_by` bigint,
  `update_date` datetime,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='纠错日志表';




