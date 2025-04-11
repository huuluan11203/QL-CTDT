-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: chuong_trinh_dao_tao
-- ------------------------------------------------------
-- Server version	9.2.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ctdt_cotdiem`
--

DROP TABLE IF EXISTS `ctdt_cotdiem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ctdt_cotdiem` (
  `id` int NOT NULL AUTO_INCREMENT,
  `decuong_id` int NOT NULL,
  `ten_cot_diem` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ty_le_phan_tram` decimal(5,2) NOT NULL,
  `hinh_thuc` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `decuong_id` (`decuong_id`),
  CONSTRAINT `ctdt_cotdiem_ibfk_1` FOREIGN KEY (`decuong_id`) REFERENCES `ctdt_decuongchitiet` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ctdt_cotdiem`
--

LOCK TABLES `ctdt_cotdiem` WRITE;
/*!40000 ALTER TABLE `ctdt_cotdiem` DISABLE KEYS */;
INSERT INTO `ctdt_cotdiem` VALUES (1,1,'Điểm chuyên cần',10.00,'Điểm danh'),(2,1,'Điểm thảo luận',20.00,'Thảo luận nhóm'),(3,1,'Điểm kiểm tra',20.00,'Trắc nghiệm'),(4,1,'Điểm thi cuối kỳ',50.00,'Tự luận'),(5,2,'Điểm chuyên cần',10.00,'Điểm danh'),(6,2,'Điểm bài tập',20.00,'Bài tập về nhà'),(7,2,'Điểm kiểm tra',20.00,'Trắc nghiệm + Tự luận'),(8,2,'Điểm thi thực hành',50.00,'Bài tập lớn'),(9,3,'Điểm chuyên cần',10.00,'Điểm danh'),(10,3,'Điểm bài tập',15.00,'Bài tập về nhà'),(11,3,'Điểm kiểm tra',15.00,'Trắc nghiệm'),(12,3,'Điểm đồ án',20.00,'Đồ án nhóm'),(13,3,'Điểm thi thực hành',40.00,'Thực hành cá nhân'),(14,4,'Điểm chuyên cần',10.00,'Điểm danh'),(15,4,'Điểm thảo luận',10.00,'Thảo luận nhóm'),(16,4,'Điểm kiểm tra',20.00,'Trắc nghiệm'),(17,4,'Điểm đồ án',30.00,'Đồ án nhóm'),(18,4,'Điểm thi cuối kỳ',30.00,'Tự luận');
/*!40000 ALTER TABLE `ctdt_cotdiem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ctdt_decuongchitiet`
--

DROP TABLE IF EXISTS `ctdt_decuongchitiet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ctdt_decuongchitiet` (
  `id` int NOT NULL AUTO_INCREMENT,
  `hoc_phan_id` int NOT NULL,
  `muc_tieu` text COLLATE utf8mb4_unicode_ci,
  `noi_dung` text COLLATE utf8mb4_unicode_ci,
  `phuong_phap_giang_day` text COLLATE utf8mb4_unicode_ci,
  `phuong_phap_danh_gia` text COLLATE utf8mb4_unicode_ci,
  `tai_lieu_tham_khao` text COLLATE utf8mb4_unicode_ci,
  `trang_thai` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `hoc_phan_id` (`hoc_phan_id`),
  CONSTRAINT `ctdt_decuongchitiet_ibfk_1` FOREIGN KEY (`hoc_phan_id`) REFERENCES `ctdt_hocphan` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ctdt_decuongchitiet`
--

LOCK TABLES `ctdt_decuongchitiet` WRITE;
/*!40000 ALTER TABLE `ctdt_decuongchitiet` DISABLE KEYS */;
INSERT INTO `ctdt_decuongchitiet` VALUES (1,1,'Trang bị kiến thức cơ bản về triết học Mác-Lênin','Chương 1: Khái luận về Triết học và vai trò của Triết học\nChương 2: Chủ nghĩa duy vật biện chứng\nChương 3: Chủ nghĩa duy vật lịch sử','Thuyết giảng, thảo luận nhóm','Chuyên cần: 10%, Thảo luận: 20%, Kiểm tra giữa kỳ: 20%, Thi cuối kỳ: 50%','Giáo trình Triết học Mác-Lênin, NXB Chính trị Quốc gia, 2021','Đã duyệt'),(2,9,'Trang bị kiến thức cơ bản về lập trình và kỹ năng giải quyết vấn đề','Chương 1: Giới thiệu về lập trình\nChương 2: Biến và kiểu dữ liệu\nChương 3: Cấu trúc điều khiển\nChương 4: Hàm và module\nChương 5: Mảng và chuỗi','Thuyết giảng, thực hành trên máy tính, bài tập lớn','Chuyên cần: 10%, Bài tập: 20%, Kiểm tra giữa kỳ: 20%, Thi thực hành: 50%','Introduction to Programming with C++, Liang Y. Daniel, Pearson, 2019','Đã duyệt'),(3,10,'Trang bị kiến thức về lập trình hướng đối tượng và các nguyên tắc thiết kế','Chương 1: Tổng quan về lập trình hướng đối tượng\nChương 2: Lớp và đối tượng\nChương 3: Tính kế thừa\nChương 4: Tính đa hình\nChương 5: Mẫu thiết kế','Thuyết giảng, thực hành trên máy tính, bài tập lớn, đồ án môn học','Chuyên cần: 10%, Bài tập: 15%, Kiểm tra giữa kỳ: 15%, Đồ án: 20%, Thi thực hành: 40%','Object-Oriented Programming in Java, Barnes D.J., Kölling M., Pearson, 2020','Đã duyệt'),(4,15,'Trang bị kiến thức về quy trình phát triển phần mềm và kỹ năng làm việc nhóm','Chương 1: Giới thiệu về Công nghệ phần mềm\nChương 2: Quy trình phát triển phần mềm\nChương 3: Phân tích yêu cầu\nChương 4: Thiết kế phần mềm\nChương 5: Kiểm thử phần mềm\nChương 6: Bảo trì và tiến hóa phần mềm','Thuyết giảng, thảo luận nhóm, đồ án','Chuyên cần: 10%, Thảo luận: 10%, Kiểm tra: 20%, Đồ án: 30%, Thi cuối kỳ: 30%','Software Engineering, Ian Sommerville, Pearson, 2021','Đã duyệt'),(5,25,'Trang bị kiến thức và kỹ năng thực hiện đề tài tốt nghiệp','Sinh viên thực hiện một đề tài nghiên cứu hoặc phát triển sản phẩm dưới sự hướng dẫn của giảng viên','Hướng dẫn cá nhân, seminar, báo cáo tiến độ','Báo cáo tiến độ: 30%, Sản phẩm: 30%, Báo cáo tốt nghiệp: 40%','Tùy theo đề tài cụ thể','Đã duyệt');
/*!40000 ALTER TABLE `ctdt_decuongchitiet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ctdt_giangvien`
--

DROP TABLE IF EXISTS `ctdt_giangvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ctdt_giangvien` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  `ma_gv` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ho_ten` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `bo_mon` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `khoa` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `trinh_do` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `chuyen_mon` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `trang_thai` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ma_gv` (`ma_gv`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `ctdt_giangvien_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `ctdt_user` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ctdt_giangvien`
--

LOCK TABLES `ctdt_giangvien` WRITE;
/*!40000 ALTER TABLE `ctdt_giangvien` DISABLE KEYS */;
/*!40000 ALTER TABLE `ctdt_giangvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ctdt_hocphan`
--

DROP TABLE IF EXISTS `ctdt_hocphan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ctdt_hocphan` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ma_hp` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ten_hp` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `so_tin_chi` int NOT NULL,
  `so_tiet_ly_thuyet` int DEFAULT NULL,
  `so_tiet_thuc_hanh` int DEFAULT NULL,
  `nhom_id` int DEFAULT NULL,
  `loai_hp` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `hoc_phan_tien_quyet` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ma_hp` (`ma_hp`),
  KEY `nhom_id` (`nhom_id`),
  CONSTRAINT `ctdt_hocphan_ibfk_1` FOREIGN KEY (`nhom_id`) REFERENCES `ctdt_khungchuongtrinh` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ctdt_hocphan`
--

LOCK TABLES `ctdt_hocphan` WRITE;
/*!40000 ALTER TABLE `ctdt_hocphan` DISABLE KEYS */;
INSERT INTO `ctdt_hocphan` VALUES (1,'CB001','Triết học Mác - Lênin',3,45,0,1,'Bắt buộc',NULL),(2,'CB002','Kinh tế chính trị Mác - Lênin',2,30,0,1,'Bắt buộc','CB001'),(3,'CB003','Tư tưởng Hồ Chí Minh',2,30,0,1,'Bắt buộc','CB001'),(4,'CB004','Tiếng Anh 1',4,45,30,1,'Bắt buộc',NULL),(5,'CB005','Tiếng Anh 2',4,45,30,1,'Bắt buộc','CB004'),(6,'CB006','Giải tích 1',3,45,0,1,'Bắt buộc',NULL),(7,'CB007','Đại số tuyến tính',3,45,0,1,'Bắt buộc',NULL),(8,'CB008','Xác suất thống kê',3,45,0,1,'Bắt buộc','CB006'),(9,'IT001','Nhập môn lập trình',4,30,60,2,'Bắt buộc',NULL),(10,'IT002','Lập trình hướng đối tượng',4,30,60,2,'Bắt buộc','IT001'),(11,'IT003','Cấu trúc dữ liệu và giải thuật',4,30,60,2,'Bắt buộc','IT001'),(12,'IT004','Cơ sở dữ liệu',4,45,30,2,'Bắt buộc',NULL),(13,'IT005','Mạng máy tính',4,45,30,2,'Bắt buộc',NULL),(14,'IT006','Hệ điều hành',4,45,30,2,'Bắt buộc',NULL),(15,'CN001','Công nghệ phần mềm',4,45,30,3,'Bắt buộc','IT002'),(16,'CN002','Trí tuệ nhân tạo',4,45,30,3,'Bắt buộc','IT003'),(17,'CN003','Phát triển ứng dụng web',4,30,60,3,'Bắt buộc','IT002'),(18,'CN004','Phát triển ứng dụng di động',4,30,60,3,'Bắt buộc','IT002'),(19,'CN005','An toàn và bảo mật thông tin',4,45,30,3,'Bắt buộc','IT005'),(20,'CN006','Điện toán đám mây',3,30,30,3,'Tự chọn','IT005'),(21,'CN007','Phân tích dữ liệu lớn',3,30,30,3,'Tự chọn','IT004'),(22,'CN008','Blockchain và ứng dụng',3,30,30,3,'Tự chọn',NULL),(23,'CN009','Thị giác máy tính',3,30,30,3,'Tự chọn','CN002'),(24,'CN010','Xử lý ngôn ngữ tự nhiên',3,30,30,3,'Tự chọn','CN002'),(25,'TN001','Thực tập tốt nghiệp',5,0,150,4,'Bắt buộc',NULL),(26,'TN002','Khóa luận tốt nghiệp',10,0,300,4,'Bắt buộc',NULL);
/*!40000 ALTER TABLE `ctdt_hocphan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ctdt_kehoachdayhoc`
--

DROP TABLE IF EXISTS `ctdt_kehoachdayhoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ctdt_kehoachdayhoc` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ctdt_id` int NOT NULL,
  `hoc_phan_id` int NOT NULL,
  `hoc_ky` int NOT NULL,
  `nam_hoc` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ctdt_id` (`ctdt_id`),
  KEY `hoc_phan_id` (`hoc_phan_id`),
  CONSTRAINT `ctdt_kehoachdayhoc_ibfk_1` FOREIGN KEY (`ctdt_id`) REFERENCES `ctdt_thongtinchung` (`id`) ON DELETE CASCADE,
  CONSTRAINT `ctdt_kehoachdayhoc_ibfk_2` FOREIGN KEY (`hoc_phan_id`) REFERENCES `ctdt_hocphan` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ctdt_kehoachdayhoc`
--

LOCK TABLES `ctdt_kehoachdayhoc` WRITE;
/*!40000 ALTER TABLE `ctdt_kehoachdayhoc` DISABLE KEYS */;
INSERT INTO `ctdt_kehoachdayhoc` VALUES (1,1,1,1,2023),(2,1,4,1,2023),(3,1,6,1,2023),(4,1,7,1,2023),(5,1,5,2,2023),(6,1,2,2,2023),(7,1,8,2,2023),(8,1,9,2,2023),(9,1,3,3,2024),(10,1,10,3,2024),(11,1,11,3,2024),(12,1,12,3,2024),(13,1,13,4,2024),(14,1,14,4,2024),(15,1,15,5,2025),(16,1,16,5,2025),(17,1,17,5,2025),(18,1,18,6,2025),(19,1,19,6,2025),(20,1,20,6,2025),(21,1,21,6,2025),(22,1,25,8,2026),(23,1,26,8,2026);
/*!40000 ALTER TABLE `ctdt_kehoachdayhoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ctdt_kehoachmonhom`
--

DROP TABLE IF EXISTS `ctdt_kehoachmonhom`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ctdt_kehoachmonhom` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ma_nhom` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `hoc_phan_id` int NOT NULL,
  `nam_hoc` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `hoc_ky` int NOT NULL,
  `so_luong_sv` int DEFAULT NULL,
  `thoi_gian_bat_dau` date DEFAULT NULL,
  `thoi_gian_ket_thuc` date DEFAULT NULL,
  `trang_thai` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `hoc_phan_id` (`hoc_phan_id`),
  CONSTRAINT `ctdt_kehoachmonhom_ibfk_1` FOREIGN KEY (`hoc_phan_id`) REFERENCES `ctdt_hocphan` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ctdt_kehoachmonhom`
--

LOCK TABLES `ctdt_kehoachmonhom` WRITE;
/*!40000 ALTER TABLE `ctdt_kehoachmonhom` DISABLE KEYS */;
INSERT INTO `ctdt_kehoachmonhom` VALUES (1,'CB001.01',1,'2023-2024',1,60,'2023-08-15','2023-12-31','Đã kết thúc'),(2,'CB001.02',1,'2023-2024',1,60,'2023-08-15','2023-12-31','Đã kết thúc'),(3,'CB004.01',4,'2023-2024',1,40,'2023-08-15','2023-12-31','Đã kết thúc'),(4,'CB004.02',4,'2023-2024',1,40,'2023-08-15','2023-12-31','Đã kết thúc'),(5,'CB004.03',4,'2023-2024',1,40,'2023-08-15','2023-12-31','Đã kết thúc'),(6,'IT001.01',9,'2023-2024',2,35,'2024-01-15','2024-05-31','Đã kết thúc'),(7,'IT001.02',9,'2023-2024',2,35,'2024-01-15','2024-05-31','Đã kết thúc'),(8,'IT002.01',10,'2024-2025',1,35,'2024-08-15','2024-12-31','Đang diễn ra'),(9,'IT002.02',10,'2024-2025',1,35,'2024-08-15','2024-12-31','Đang diễn ra'),(10,'CN001.01',15,'2025-2026',1,30,'2025-08-15','2025-12-31','Chưa mở');
/*!40000 ALTER TABLE `ctdt_kehoachmonhom` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ctdt_khungchuongtrinh`
--

DROP TABLE IF EXISTS `ctdt_khungchuongtrinh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ctdt_khungchuongtrinh` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ctdt_id` int NOT NULL,
  `ma_nhom` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ten_nhom` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `so_tin_chi_toi_thieu` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ctdt_id` (`ctdt_id`),
  CONSTRAINT `ctdt_khungchuongtrinh_ibfk_1` FOREIGN KEY (`ctdt_id`) REFERENCES `ctdt_thongtinchung` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ctdt_khungchuongtrinh`
--

LOCK TABLES `ctdt_khungchuongtrinh` WRITE;
/*!40000 ALTER TABLE `ctdt_khungchuongtrinh` DISABLE KEYS */;
INSERT INTO `ctdt_khungchuongtrinh` VALUES (1,1,'GDDC','Khối kiến thức giáo dục đại cương',45),(2,1,'CSN','Khối kiến thức cơ sở ngành',30),(3,1,'CN','Khối kiến thức chuyên ngành',55),(4,1,'TN','Khối kiến thức tốt nghiệp',15),(5,2,'GDDC','Khối kiến thức giáo dục đại cương',45),(6,2,'CSN','Khối kiến thức cơ sở ngành',34),(7,2,'CN','Khối kiến thức chuyên ngành',50),(8,2,'TN','Khối kiến thức tốt nghiệp',16),(9,3,'GDDC','Khối kiến thức giáo dục đại cương',45),(10,3,'CSN','Khối kiến thức cơ sở ngành',32),(11,3,'CN','Khối kiến thức chuyên ngành',52),(12,3,'TN','Khối kiến thức tốt nghiệp',16);
/*!40000 ALTER TABLE `ctdt_khungchuongtrinh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ctdt_khungchuongtrinh_nhomkienthuc`
--

DROP TABLE IF EXISTS `ctdt_khungchuongtrinh_nhomkienthuc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ctdt_khungchuongtrinh_nhomkienthuc` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_khungchuongtrinh` int NOT NULL,
  `id_manhom` int NOT NULL,
  `sotinchibatbuoc` int DEFAULT NULL,
  `sotinchituchon` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_khungchuongtrinh` (`id_khungchuongtrinh`),
  KEY `id_manhom` (`id_manhom`),
  CONSTRAINT `ctdt_khungchuongtrinh_nhomkienthuc_ibfk_1` FOREIGN KEY (`id_khungchuongtrinh`) REFERENCES `ctdt_khungchuongtrinh` (`id`) ON DELETE CASCADE,
  CONSTRAINT `ctdt_khungchuongtrinh_nhomkienthuc_ibfk_2` FOREIGN KEY (`id_manhom`) REFERENCES `ctdt_nhomkienthuc` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ctdt_khungchuongtrinh_nhomkienthuc`
--

LOCK TABLES `ctdt_khungchuongtrinh_nhomkienthuc` WRITE;
/*!40000 ALTER TABLE `ctdt_khungchuongtrinh_nhomkienthuc` DISABLE KEYS */;
INSERT INTO `ctdt_khungchuongtrinh_nhomkienthuc` VALUES (1,1,1,40,5),(2,1,3,25,5),(3,1,4,45,10),(4,1,6,10,5),(5,2,1,40,5),(6,2,3,30,4),(7,2,4,40,10),(8,2,6,10,6),(9,3,1,40,5),(10,3,3,27,5),(11,3,4,42,10),(12,3,6,10,6);
/*!40000 ALTER TABLE `ctdt_khungchuongtrinh_nhomkienthuc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ctdt_nhomkienthuc`
--

DROP TABLE IF EXISTS `ctdt_nhomkienthuc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ctdt_nhomkienthuc` (
  `id` int NOT NULL AUTO_INCREMENT,
  `manhom` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ten_nhom` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `trangthai` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ctdt_nhomkienthuc`
--

LOCK TABLES `ctdt_nhomkienthuc` WRITE;
/*!40000 ALTER TABLE `ctdt_nhomkienthuc` DISABLE KEYS */;
INSERT INTO `ctdt_nhomkienthuc` VALUES (1,'GDDC','Giáo dục đại cương','active'),(2,'CSNN','Cơ sở nhóm ngành','active'),(3,'CSN','Cơ sở ngành','active'),(4,'CN','Chuyên ngành','active'),(5,'TC','Tự chọn','active'),(6,'TN','Tốt nghiệp','active');
/*!40000 ALTER TABLE `ctdt_nhomkienthuc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ctdt_phanconggiangday`
--

DROP TABLE IF EXISTS `ctdt_phanconggiangday`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ctdt_phanconggiangday` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nhom_id` int NOT NULL,
  `giang_vien_id` int NOT NULL,
  `vai_tro` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `so_tiet` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `nhom_id` (`nhom_id`),
  KEY `giang_vien_id` (`giang_vien_id`),
  CONSTRAINT `ctdt_phanconggiangday_ibfk_1` FOREIGN KEY (`nhom_id`) REFERENCES `ctdt_kehoachmonhom` (`id`) ON DELETE CASCADE,
  CONSTRAINT `ctdt_phanconggiangday_ibfk_2` FOREIGN KEY (`giang_vien_id`) REFERENCES `ctdt_giangvien` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ctdt_phanconggiangday`
--

LOCK TABLES `ctdt_phanconggiangday` WRITE;
/*!40000 ALTER TABLE `ctdt_phanconggiangday` DISABLE KEYS */;
/*!40000 ALTER TABLE `ctdt_phanconggiangday` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ctdt_thongtinchung`
--

DROP TABLE IF EXISTS `ctdt_thongtinchung`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ctdt_thongtinchung` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ma_ctdt` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ten_ctdt` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `nganh` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ma_nganh` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `khoa_quan_ly` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `he_dao_tao` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `trinh_do` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `tong_tin_chi` int DEFAULT NULL,
  `thoi_gian_dao_tao` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nam_ban_hanh` int DEFAULT NULL,
  `trang_thai` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ma_ctdt` (`ma_ctdt`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ctdt_thongtinchung`
--

LOCK TABLES `ctdt_thongtinchung` WRITE;
/*!40000 ALTER TABLE `ctdt_thongtinchung` DISABLE KEYS */;
INSERT INTO `ctdt_thongtinchung` VALUES (1,'CNTT2020','Chương trình đào tạo ngành Công nghệ thông tin','Công nghệ thông tin','7480201','Khoa Công nghệ thông tin','Chính quy','Đại học',145,'4 năm',2020,'Đang áp dụng'),(2,'KTPM2020','Chương trình đào tạo ngành Kỹ thuật phần mềm','Kỹ thuật phần mềm','7480103','Khoa Công nghệ thông tin','Chính quy','Đại học',145,'4 năm',2020,'Đang áp dụng'),(3,'HTTT2021','Chương trình đào tạo ngành Hệ thống thông tin','Hệ thống thông tin','7480104','Khoa Công nghệ thông tin','Chính quy','Đại học',145,'4 năm',2021,'Đang áp dụng'),(4,'KHMT2021','Chương trình đào tạo ngành Khoa học máy tính','Khoa học máy tính','7480101','Khoa Công nghệ thông tin','Chính quy','Đại học',145,'4 năm',2021,'Đang áp dụng'),(5,'DTVT2022','Chương trình đào tạo ngành Điện tử viễn thông','Điện tử viễn thông','7520207','Khoa Điện tử - Viễn thông','Chính quy','Đại học',150,'4 năm',2022,'Đang áp dụng');
/*!40000 ALTER TABLE `ctdt_thongtinchung` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ctdt_user`
--

DROP TABLE IF EXISTS `ctdt_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ctdt_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ho_ten` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `so_dien_thoai` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `vai_tro` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nam_sinh` int DEFAULT NULL,
  `trang_thai` tinyint DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ctdt_user`
--

LOCK TABLES `ctdt_user` WRITE;
/*!40000 ALTER TABLE `ctdt_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `ctdt_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-04-11  8:50:35
