/*
SQLyog Ultimate v9.10 
MySQL - 8.0.22 : Database - vrms
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`vrms` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `vrms`;

/*Table structure for table `address` */

DROP TABLE IF EXISTS `address`;

CREATE TABLE `address` (
  `addid` int NOT NULL AUTO_INCREMENT COMMENT '地址ID',
  `address` text COLLATE utf8_bin COMMENT '地址名称',
  `detail` text COLLATE utf8_bin COMMENT '地址详情',
  `tel` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '电话',
  `ctime` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '添加时间',
  `mtime` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '修改时间',
  `deleted` int DEFAULT '0' COMMENT '0未删除 1已删除',
  PRIMARY KEY (`addid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `address` */

/*Table structure for table `administrators` */

DROP TABLE IF EXISTS `administrators`;

CREATE TABLE `administrators` (
  `aid` int NOT NULL AUTO_INCREMENT COMMENT '管理员ID',
  `username` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '用户名称',
  `password` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '用户密码',
  `images` text COLLATE utf8_bin COMMENT '头像',
  `stats` int DEFAULT '0' COMMENT '状态',
  `ctime` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '创建时间',
  `mtime` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '修改时间',
  `deleted` int DEFAULT '0' COMMENT '0未删除,1已删除',
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `administrators` */

/*Table structure for table `appointment` */

DROP TABLE IF EXISTS `appointment`;

CREATE TABLE `appointment` (
  `appid` int NOT NULL AUTO_INCREMENT COMMENT '预约ID',
  `uid` int DEFAULT NULL COMMENT '用户外键',
  `addid` int DEFAULT NULL COMMENT '预约地址外键',
  `avcid` int DEFAULT NULL COMMENT '疫苗外键',
  `money` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '支付金额',
  `appstats` int DEFAULT '0' COMMENT '预约状态 0已预约、1已取消',
  `apptime` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '预约时间',
  `stats` int DEFAULT '0' COMMENT '接种状态 0未接种、1已接种',
  `ctime` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '创建时间',
  `mtime` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '修改时间',
  `deleted` int DEFAULT '0' COMMENT '0未删除 1已删除',
  `remark` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`appid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `appointment` */

/*Table structure for table `logs` */

DROP TABLE IF EXISTS `logs`;

CREATE TABLE `logs` (
  `opid` int NOT NULL AUTO_INCREMENT COMMENT '日志ID',
  `optime` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '操作时间',
  `ip` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '操作ip',
  `methods` text COLLATE utf8_bin COMMENT '操作方法',
  `ddesc` text COLLATE utf8_bin COMMENT '操作方法描述',
  PRIMARY KEY (`opid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `logs` */

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `uid` int NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '用户名称',
  `password` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '密码',
  `sex` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '性别',
  `age` int DEFAULT NULL COMMENT '年龄',
  `idcard` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '身份证',
  `tel` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '电话',
  `address` text COLLATE utf8_bin COMMENT '住址',
  `ctime` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '创建时间',
  `mtime` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '修改时间',
  `deleted` int DEFAULT '0' COMMENT '0未删除 , 1已删除',
  `stats` int DEFAULT '0' COMMENT '0未禁用,1已经用',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `users` */

/*Table structure for table `vaccines` */

DROP TABLE IF EXISTS `vaccines`;

CREATE TABLE `vaccines` (
  `avcid` int NOT NULL AUTO_INCREMENT COMMENT '疫苗ID',
  `avcname` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '疫苗名称',
  `manufactor` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '生成厂家',
  `mdate` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '生产日期',
  `price` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '单价',
  `instructions` text COLLATE utf8_bin COMMENT '说明',
  `ctime` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '创建时间',
  `mtime` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '修改时间',
  `deleted` int DEFAULT '0' COMMENT '0未删除 1已删除',
  PRIMARY KEY (`avcid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `vaccines` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
