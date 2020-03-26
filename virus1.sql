/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50531
Source Host           : localhost:3306
Source Database       : virus

Target Server Type    : MYSQL
Target Server Version : 50531
File Encoding         : 65001

Date: 2020-03-26 19:14:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1009036135@qq.com', '$2a$10$hUlAKdYrv5s65ELAoK8wz.9apBSG5V.rybXHdkju8w8.Xpmb6tmca', '11');
INSERT INTO `user` VALUES ('4', '123', '$2a$10$G9BPlMCdcDX/lzbS6s7HmeKYzcN.AuBhkZkCbhw/lcuKEOWkSPUoK', '3');
INSERT INTO `user` VALUES ('5', '123', '$2a$10$f1MPpx7W3IGIwsdXFesF2emWmYk9DOln82WdKbaQ/kDJ7w3jAIepe', '3');
INSERT INTO `user` VALUES ('14', '1936203991@qq.com', '$2a$10$bIZTaAzYQqV3MjTD1kINsOxlW148sQ2Wo1o/c3xX3CwTKw7yhfYY.', '11');
INSERT INTO `user` VALUES ('15', '大王不高兴1', '$2a$10$L6coUm2UtFssTh1hkTLFret.sXxDLbZzBNNhpjwEQKIMy.71Wxr52', '2');
INSERT INTO `user` VALUES ('16', '791683057@qq.com', '$2a$10$Z5U5GnLnSmPL/9ZaSl2ZfOhvmtF7YPSPzibntSRj6KtcxEDDZCU6y', '1');
INSERT INTO `user` VALUES ('17', '2016029787@qq.com', '$2a$10$bap4ESSj3olMb6pgFl/VouRk./LiRFBJLGoJmiglu8zJO/v9OvKWm', '1');
INSERT INTO `user` VALUES ('18', '2833881053@qq.com', '$2a$10$S12esSX6sOU7VtuMSxuHD.5/rHzhrA0SqpW0fWPIoInYHoNOv66cG', '1');
INSERT INTO `user` VALUES ('19', '1689164469@qq.com', '$2a$10$Wzc2VGlKehPftoEgiOzFke8zvsNOUYdSnQzOnVmILX9VNY348ZnNm', '1');
INSERT INTO `user` VALUES ('21', '1040375485@qq.com', '$2a$10$dAisj8qCa3aBr6uNLzCUdufs.yrtX1wH65EulhQjmfxf.otMz9eeq', '1');
INSERT INTO `user` VALUES ('22', '2665087485@qq.com', '$2a$10$.DbjxB2lDSKSruM2/d/D2uBwo0cIyUqsiRiPUOWGvz3OJBXToUilu', '1');
INSERT INTO `user` VALUES ('23', '2519983735@qq.com', '$2a$10$L5/6fLNFT2MDL0PI8GEP2Oo7EuEMieofHBlYR51tRVxc5j4n5HrIq', '1');
INSERT INTO `user` VALUES ('24', '1135128361@qq.com', '$2a$10$GJ0U.DhVNWAsAPM616e8m.MdxQXKLeWH4p9A0Fh7Oh3UB2Y6FE6nO', '1');
INSERT INTO `user` VALUES ('25', '3451487460@qq.com', '$2a$10$TeIf9AlhBcA7oDSXYzV0yeiqYhqQkoguWPjMARweOuqoSDJh/N31.', '1');
INSERT INTO `user` VALUES ('26', '1139155785@qq.com', '$2a$10$.5B3Rhvw6Ilm.AIcRNdih.mZv.AiuZDAzdtk4a3JGutxO8AMivDsK', '1');
INSERT INTO `user` VALUES ('27', '101038715@qq.com', '$2a$10$hEnEXCXJsM7Sjj00HL8GQOtXUNA1PJLNPr25nKqyB4/RKZUb7ddM6', '1');
INSERT INTO `user` VALUES ('28', '1171849616@qq.com', '$2a$10$gloJk0wbLg1wrGromY8aE.b.p1z1QTr0f3y3qItIyaA8F1iDPL4o6', '1');
INSERT INTO `user` VALUES ('29', '2722016394@qq.com', '$2a$10$YwZlp7NlBYPdawimejs2Yu6RbKstKgOD4kYD4D6OcdDoGx8uvNG9G', '1');
INSERT INTO `user` VALUES ('30', '2722016394@qq.com', '$2a$10$WX9HkJhYedL8yiDnWVNO9OhrKlGc7bz4nds2FlWgwoME2rY23sIUe', '1');
INSERT INTO `user` VALUES ('31', '1204320859@qq.com', '$2a$10$7dcdNyAES18SmJN9ivsS1OPVWX5kQdoCcNdnfI4qR2Lsj2sEyB4Sa', '1');
INSERT INTO `user` VALUES ('32', '2326669056@qq.com', '$2a$10$8yqpc.Oqm35dXKztCH2hFuPOzWycRhtbyx/B3VBXe0YWgnWA0v2fe', '1');

-- ----------------------------
-- Table structure for `virus`
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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of virus
-- ----------------------------
INSERT INTO `virus` VALUES ('1', '543543', '543543', '2020-03-23 22:31:35', '5253', '4234324', 'fsdfsdf', '43242', '4324', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO `virus` VALUES ('2', 'fdsf', '3213213', '2020-03-23 22:41:14', '3213', '32131', '3213', '213', '3213', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO `virus` VALUES ('3', '文学院', 'czvdzv', '2020-03-24 11:39:33', 'fzfdf', '424234', '432432', '4324', '4324', '1', '0', '0', '1', '0', '1', '0', '0', '1');
INSERT INTO `virus` VALUES ('4', '数学学院', '4324', '2020-03-24 11:40:46', '4324', '4324', '4324', '4324', '432', '1', '1', '1', '1', '1', '1', '1', '1', '1');
INSERT INTO `virus` VALUES ('5', '数学学院', '324234', '2020-03-24 23:22:30', '43242', '4324', '432432', '4324', '4324', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO `virus` VALUES ('6', '计算机学院', '网络班', '2020-03-25 21:27:56', '韩蜡梅', '123456789', '甘肃省', '兰州市', '安宁区', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO `virus` VALUES ('7', '计算机学院', '网络与信息安全班', '2020-03-26 10:44:06', '韩腊梅', '123456789', '甘肃省', '兰州市', '安宁区', '0', '0', '0', '0', '0', '0', '0', '0', '0');
INSERT INTO `virus` VALUES ('8', '数学学院', '123', '2020-03-26 11:05:08', '123', '123', '123', '123', '123', '0', '0', '0', '0', '0', '0', '0', '0', '0');
