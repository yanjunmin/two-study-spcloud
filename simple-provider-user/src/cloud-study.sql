/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50727
Source Host           : localhost:3306
Source Database       : cloud-study

Target Server Type    : MYSQL
Target Server Version : 50727
File Encoding         : 65001

Date: 2019-10-09 17:55:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `balance` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'account1', '张三', '20', '100');
INSERT INTO `user` VALUES ('2', 'account2', '李四', '28', '180');
INSERT INTO `user` VALUES ('3', 'account3', '王五', '32', '260');
