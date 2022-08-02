/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : shop

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 04/07/2022 12:41:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for lmonkey_cart
-- ----------------------------
DROP TABLE IF EXISTS `lmonkey_cart`;
CREATE TABLE `lmonkey_cart`  (
  `cart_id` int(0) NOT NULL AUTO_INCREMENT,
  `cart_p_filename` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `cart_p_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `cart_p_price` decimal(10, 2) NULL DEFAULT NULL,
  `cart_quantity` int(0) NULL DEFAULT NULL,
  `cart_p_stock` int(0) NULL DEFAULT NULL,
  `cart_p_id` int(0) NULL DEFAULT NULL,
  `cart_u_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `cart_valid` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`cart_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of lmonkey_cart
-- ----------------------------
INSERT INTO `lmonkey_cart` VALUES (24, '5acf1d53N21fafd9f.jpg', '网络爬虫', 48.00, 2, 100, 3, 'adm001', 1);

-- ----------------------------
-- Table structure for lmonkey_category
-- ----------------------------
DROP TABLE IF EXISTS `lmonkey_category`;
CREATE TABLE `lmonkey_category`  (
  `cate_id` int(0) NOT NULL AUTO_INCREMENT,
  `cate_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `cate_parent_id` decimal(10, 0) NOT NULL,
  PRIMARY KEY (`cate_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 35 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of lmonkey_category
-- ----------------------------
INSERT INTO `lmonkey_category` VALUES (21, 'python', 0);
INSERT INTO `lmonkey_category` VALUES (22, 'C', 0);
INSERT INTO `lmonkey_category` VALUES (25, '爬虫', 21);
INSERT INTO `lmonkey_category` VALUES (26, '人工智能', 21);
INSERT INTO `lmonkey_category` VALUES (27, '机器学习', 21);
INSERT INTO `lmonkey_category` VALUES (28, 'Java', 0);
INSERT INTO `lmonkey_category` VALUES (29, 'JavaSE', 28);
INSERT INTO `lmonkey_category` VALUES (30, 'JavaEE', 28);
INSERT INTO `lmonkey_category` VALUES (31, 'C基础', 22);
INSERT INTO `lmonkey_category` VALUES (33, 'Linux', 0);
INSERT INTO `lmonkey_category` VALUES (34, 'Linux基础', 33);

-- ----------------------------
-- Table structure for lmonkey_order
-- ----------------------------
DROP TABLE IF EXISTS `lmonkey_order`;
CREATE TABLE `lmonkey_order`  (
  `order_id` int(0) NOT NULL AUTO_INCREMENT,
  `order_uid` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `order_pfilename` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `order_pname` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `order_pid` int(0) NOT NULL,
  `order_quantity` int(0) NULL DEFAULT NULL,
  `order_price` decimal(10, 2) NULL DEFAULT NULL,
  `order_date` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of lmonkey_order
-- ----------------------------
INSERT INTO `lmonkey_order` VALUES (9, 'adm002', 'Cjichu918fa055b341e58e.jpg', '零基础C语言', 8, 2, 112.00, '16-04-2022 19:42:50');
INSERT INTO `lmonkey_order` VALUES (11, 'adm002', 'JavaSEkuaisurumrn.jpg', 'JavaSE快速入门', 7, 1, 48.00, '16-04-2022 22:36:09');
INSERT INTO `lmonkey_order` VALUES (12, 'adm002', 'JavaSEkuaisurumrn.jpg', 'JavaSE快速入门', 7, 1, 48.00, '16-04-2022 22:42:54');
INSERT INTO `lmonkey_order` VALUES (13, 'adm002', 'Linuxjichu.jpg', 'Linux基础', 10, 1, 60.00, '16-04-2022 22:45:06');
INSERT INTO `lmonkey_order` VALUES (14, '0001', '5acf1d53N21fafd9f.jpg', '网络爬虫', 3, 1, 48.00, '04-07-2022 12:37:18');

-- ----------------------------
-- Table structure for lmonkey_product
-- ----------------------------
DROP TABLE IF EXISTS `lmonkey_product`;
CREATE TABLE `lmonkey_product`  (
  `product_id` int(0) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `product_description` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `product_price` decimal(10, 2) NOT NULL,
  `product_stock` decimal(10, 0) NULL DEFAULT NULL,
  `product_fid` decimal(10, 0) NULL DEFAULT NULL,
  `product_cid` decimal(10, 0) NULL DEFAULT NULL,
  `product_filename` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`product_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of lmonkey_product
-- ----------------------------
INSERT INTO `lmonkey_product` VALUES (3, '网络爬虫', '无', 48.00, 100, 21, 25, '5acf1d53N21fafd9f.jpg');
INSERT INTO `lmonkey_product` VALUES (7, 'JavaSE快速入门', 'JavaSE快速入门', 48.00, 100, 28, 29, 'JavaSEkuaisurumrn.jpg');
INSERT INTO `lmonkey_product` VALUES (8, '零基础C语言', 'C语言新手入门畅销书，详解开发环境配置，内含17小时同步视频、168个精彩实例、168个配套训练，附赠数字电子书、源码、PPT、100道必刷题等', 56.00, 50, 22, 31, 'Cjichu918fa055b341e58e.jpg');
INSERT INTO `lmonkey_product` VALUES (9, 'JavaWeb从入门到精通', '软件开发视频大讲堂', 75.00, 60, 28, 30, 'JavaWebc10ef361096c96a0.jpg');
INSERT INTO `lmonkey_product` VALUES (10, 'Linux基础', '无', 60.00, 60, 33, 34, 'Linuxjichu.jpg');

-- ----------------------------
-- Table structure for lmonkey_user
-- ----------------------------
DROP TABLE IF EXISTS `lmonkey_user`;
CREATE TABLE `lmonkey_user`  (
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_sex` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_birthday` datetime(0) NULL DEFAULT NULL,
  `user_idenity_code` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_email` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_mobile` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_address` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_status` decimal(6, 0) NOT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of lmonkey_user
-- ----------------------------
INSERT INTO `lmonkey_user` VALUES ('0001', '李四', '111', 'T', '2022-04-06 15:06:11', NULL, '0001@qq.com', '110', '上海', 1);
INSERT INTO `lmonkey_user` VALUES ('0002', '王五', '111', 'F', '2022-05-08 15:07:19', NULL, '0002@qq.com', '120', '广州', 1);
INSERT INTO `lmonkey_user` VALUES ('0003', '赵六', '222', 'F', '2022-02-09 15:08:49', NULL, '0003@qq.com', '119', '天津', 1);
INSERT INTO `lmonkey_user` VALUES ('0004', '猪悟能', '444', 'T', '1937-01-01 00:00:00', NULL, '0004@qq.com', '0004', '高老庄', 1);
INSERT INTO `lmonkey_user` VALUES ('0005', '沙悟净', '555', 'T', '1937-01-01 00:00:00', NULL, '0005@qq.com', '0005', '流沙河', 1);
INSERT INTO `lmonkey_user` VALUES ('0006', '孙悟空', '666', 'T', '2000-01-01 00:00:00', NULL, '0006@qq.com', '0006', '花果山', 1);
INSERT INTO `lmonkey_user` VALUES ('0007', '唐三藏', '777', 'T', '1993-04-20 00:00:00', NULL, '0007@qq.com', '0007', '东土大唐', 1);
INSERT INTO `lmonkey_user` VALUES ('adm001', '管1', '111', 'F', '2022-04-06 15:09:52', NULL, 'adm001@qq.com', 'adm001', '旧金山', 2);
INSERT INTO `lmonkey_user` VALUES ('adm002', '管2 ', '222', 'T', '2021-03-02 15:57:02', NULL, 'adm002@qq.com', 'adm002', '华盛顿', 2);

SET FOREIGN_KEY_CHECKS = 1;
