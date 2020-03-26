/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50531
Source Host           : localhost:3306
Source Database       : virus

Target Server Type    : MYSQL
Target Server Version : 50531
File Encoding         : 65001

Date: 2020-03-24 23:39:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1009036135@qq.com', '$2a$10$hUlAKdYrv5s65ELAoK8wz.9apBSG5V.rybXHdkju8w8.Xpmb6tmca', '11');
INSERT INTO `user` VALUES ('2', 'ls', 'ls', '2');
INSERT INTO `user` VALUES ('3', 'ww', 'ww', '3');
INSERT INTO `user` VALUES ('4', '123', '$2a$10$G9BPlMCdcDX/lzbS6s7HmeKYzcN.AuBhkZkCbhw/lcuKEOWkSPUoK', '3');
INSERT INTO `user` VALUES ('5', '123', '$2a$10$f1MPpx7W3IGIwsdXFesF2emWmYk9DOln82WdKbaQ/kDJ7w3jAIepe', '3');
INSERT INTO `user` VALUES ('6', '456', '$2a$10$MjxIxuxAsONon1B7IwPq7.FQ8nx5DDLMK5WnORU9C82Ix8VFXLSFS', '3');
INSERT INTO `user` VALUES ('7', '789', '$2a$10$fEMylShP5cXi.SE7pxiYjenupcbvhkOzNOsy4ujG1A9/nt7j3S8.W', '3');
INSERT INTO `user` VALUES ('8', 'ww', '$2a$10$VS3V21ty0JipfkqJpwSx/.O98oQRsCOGzk10arpfzRDhpoYiQyoVC', '2');
INSERT INTO `user` VALUES ('9', 'xxx', '$2a$10$0/PiaEXt8wGfGARqnlJSIOZk/IyBDnzv.GpOL7De7fqrydG4NvZSG', '1');

-- ----------------------------
-- Table structure for virus
-- ----------------------------
DROP TABLE IF EXISTS `virus`;
CREATE TABLE `virus` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `college` varchar(255) DEFAULT NULL,
  `myclass` varchar(255) DEFAULT NULL,
  `startdate` datetime DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `tel` bigint(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `areas` varchar(255) DEFAULT NULL,
  `ischinesestudent` tinyint(1) DEFAULT NULL,
  `iswuhanstudent` tinyint(1) DEFAULT NULL,
  `ishubeistudent` tinyint(1) DEFAULT NULL,
  `is14contact` tinyint(1) DEFAULT NULL,
  `isinwuhan` tinyint(1) DEFAULT NULL,
  `isinhubei` tinyint(1) DEFAULT NULL,
  `istodayformother` tinyint(1) DEFAULT NULL,
  `islikevirus` tinyint(1) DEFAULT NULL,
  `isconfirmvirus` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of virus
-- ----------------------------
INSERT INTO `virus` VALUES ('1', '543543', '543543', '2020-03-23 22:31:35', '5253', '4234324', 'fsdfsdf', '43242', '4324', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO `virus` VALUES ('2', 'fdsf', '3213213', '2020-03-23 22:41:14', '3213', '32131', '3213', '213', '3213', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO `virus` VALUES ('3', '文学院', 'czvdzv', '2020-03-24 11:39:33', 'fzfdf', '424234', '432432', '4324', '4324', '1', '0', '0', '1', '0', '1', '0', '0', '1');
INSERT INTO `virus` VALUES ('4', '数学学院', '4324', '2020-03-24 11:40:46', '4324', '4324', '4324', '4324', '432', '1', '1', '1', '1', '1', '1', '1', '1', '1');
INSERT INTO `virus` VALUES ('5', '数学学院', '324234', '2020-03-24 23:22:30', '43242', '4324', '432432', '4324', '4324', '0', '0', '0', '0', '0', '0', '0', '0', '0');
