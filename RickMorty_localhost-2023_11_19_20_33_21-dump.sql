-- MySQL dump 10.13  Distrib 8.0.33, for macos13 (arm64)
--
-- Host: 127.0.0.1    Database: RickMorty
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `answers`
--

DROP TABLE IF EXISTS `answers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `answers` (
  `answer_id` int NOT NULL AUTO_INCREMENT,
  `answer_text` varchar(255) DEFAULT NULL,
  `is_correct` bit(1) DEFAULT NULL,
  `question_id` int DEFAULT NULL,
  PRIMARY KEY (`answer_id`),
  KEY `FK3erw1a3t0r78st8ty27x6v3g1` (`question_id`),
  CONSTRAINT `FK3erw1a3t0r78st8ty27x6v3g1` FOREIGN KEY (`question_id`) REFERENCES `questions` (`question_id`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `answers`
--

LOCK TABLES `answers` WRITE;
/*!40000 ALTER TABLE `answers` DISABLE KEYS */;
INSERT INTO `answers` (`answer_id`, `answer_text`, `is_correct`, `question_id`) VALUES (1,'2014',_binary '\0',1),(2,'2013',_binary '',1),(3,'2015',_binary '\0',1),(4,'2012',_binary '\0',1),(5,'12',_binary '\0',2),(6,'15',_binary '\0',2),(7,'8',_binary '\0',2),(8,'11',_binary '',2),(9,'Ultimate Death',_binary '\0',3),(10,'Flesh Curtains',_binary '',3),(11,'Hollow Eyes',_binary '\0',3),(12,'Sinister Slayer',_binary '\0',3),(13,'Ricklatica',_binary '\0',4),(14,'Snake Planet',_binary '\0',4),(15,'Gazorpazorp',_binary '\0',4),(16,'Froopyland',_binary '',4),(17,'Pokemon cards',_binary '',5),(18,'Baseeball cards',_binary '\0',5),(19,'Jewels',_binary '\0',5),(20,'Dragon Scales',_binary '\0',5),(21,'C-129',_binary '\0',6),(22,'D-183',_binary '\0',6),(23,'C-137',_binary '',6),(24,'D-138',_binary '\0',6),(25,'Tacoma, Washington',_binary '\0',7),(26,'Spookane, Washington',_binary '\0',7),(27,'Seattle, Washington',_binary '',7),(28,'Believue, Washington',_binary '\0',7),(29,'Adventure Time',_binary '\0',8),(30,'Steven Universe',_binary '\0',8),(31,'Over the Garden Wall',_binary '\0',8),(32,'Gravity Falls',_binary '',8),(33,'Meeseeks and Destroy',_binary '',9),(34,'Anatomy Park',_binary '\0',9),(35,'Ricksy Business',_binary '\0',9),(36,'Rixty Minutes',_binary '\0',9),(37,'Mittens',_binary '\0',10),(38,'Snuffles',_binary '',10),(39,'Snowball',_binary '\0',10),(40,'Jellybean',_binary '\0',10),(41,'Harmony',_binary '\0',11),(42,'Solace',_binary '\0',11),(43,'Unity',_binary '',11),(44,'Grace',_binary '\0',11),(45,'I am in great pain, please help me.',_binary '',12),(46,'This place is real.',_binary '\0',12),(47,'I\'m sorry, but your opinion means very litle to me.',_binary '\0',12),(48,'Welcome to the club, pal.',_binary '\0',12),(49,'30',_binary '\0',13),(50,'20',_binary '',13),(51,'50',_binary '\0',13),(52,'10',_binary '\0',13),(53,'Chip-Chop',_binary '\0',14),(54,'Hip-Hop',_binary '\0',14),(55,'Glip-Glop',_binary '',14),(56,'Flip-Flop',_binary '\0',14),(57,'A Thrimolin',_binary '\0',15),(58,'A Ventolin',_binary '\0',15),(59,'A Fremulon',_binary '\0',15),(60,'A Cromulon',_binary '',15),(61,'June 21, 2024',_binary '\0',16),(62,'June 21, 2026',_binary '',16),(63,'June 22, 2026',_binary '\0',16),(64,'June 22, 2027',_binary '\0',16),(65,'Cupidr',_binary '\0',17),(66,'Ooh-La-Love',_binary '\0',17),(67,'Whotgotsdalov',_binary '\0',17),(68,'Lovefinderrz',_binary '',17),(69,'Taika Waititi',_binary '',18),(70,'Elon Musk',_binary '\0',18),(71,'Christopher Walken',_binary '\0',18),(72,'Pedro Pascal',_binary '\0',18),(73,'\"Hurt\" by NIN',_binary '',19),(74,'\"Everybody Hurts\" by R.E.M.',_binary '\0',19),(75,'\"Fix You\" by Coldplay',_binary '\0',19),(76,'\"I Will Remember You\" by Sarah McLachlan',_binary '\0',19),(77,'Puzzle Box',_binary '\0',20),(78,'Electric Screwdriver',_binary '\0',20),(79,'Portal gun',_binary '',20),(80,'Laser goggles',_binary '\0',20);
/*!40000 ALTER TABLE `answers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Questions`
--

DROP TABLE IF EXISTS `Questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Questions` (
  `question_id` int NOT NULL AUTO_INCREMENT,
  `question_text` text NOT NULL,
  PRIMARY KEY (`question_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Questions`
--

LOCK TABLES `Questions` WRITE;
/*!40000 ALTER TABLE `Questions` DISABLE KEYS */;
INSERT INTO `Questions` (`question_id`, `question_text`) VALUES (1,'What year was the first episode of Rick and Morty premiere?'),(2,'How many episodes are in the first series?'),(3,'What was the name of Rick’s Band?'),(4,'What is the name of the colorful land that Rick takes Beth to in “The ABCs of Beth”?'),(5,'What collection was Rick disappointed in not finding in the dragon’s lair?'),(6,'What is the number of Rick’s home dimension?'),(7,'Where does the family reside in the story?'),(8,'Which Disney channel show did Rick and Morty share easter eggs with?'),(9,'In which episode did Morty lead Rick on an adventure to the Giants dimension?'),(10,'What was the name of the Smith family’s pet dog?'),(11,'What was Rick’s ex-lover in the third episode of the second season?'),(12,'What does “Wubba Lubba Dub Dub” mean?'),(13,'For how many years was Rick missing?'),(14,'Which word can’t ever be said in front of a Traflorkian?'),(15,'What type of alien shows up on Earth and threatens global destruction if he doesn’t get a live\nperformance of a catchy new song?'),(16,'When exactly did Snake Armageddon happen?'),(17,'What’s the name of the dating app Jerry and Glottie developed?'),(18,'Who voiced Rick’s alien intern Glootie?'),(19,'What famously depressing song plays at the end of “Wedding Squanchers” with sad Rick in the\nintergalactic prison?'),(20,'How does Rick hop across universes and dimensions?');
/*!40000 ALTER TABLE `Questions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_ofx66keruapi6vyqpv6f2or37` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` (`id`, `name`) VALUES (1,'ROLE_ADMIN');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scoreboard`
--

DROP TABLE IF EXISTS `scoreboard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `scoreboard` (
  `id` int NOT NULL AUTO_INCREMENT,
  `score` int DEFAULT NULL,
  `timestamp` datetime(6) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scoreboard`
--

LOCK TABLES `scoreboard` WRITE;
/*!40000 ALTER TABLE `scoreboard` DISABLE KEYS */;
/*!40000 ALTER TABLE `scoreboard` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_6dotkott2kjsp8vw4d0m25fb7` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`, `email`, `name`, `password`, `username`) VALUES (1,'jordan@gmail.com','jordan','jordan','jordan'),(2,'Adam@gmail.com','Adam','$2a$12$zD9wdNeAf.tPw4iAHuUMXuZpa8NG2gm4PU0M60qrwY9T6bT7d5kRS','Adam'),(3,'jordan4@gmail.com','jordan','$2a$12$YhzaMj/ykae4UkJ2XRJL6eAa6AsvAtuxl1kHFEGTTBgdKdvE4wk5O','jordan'),(4,'greg@gmail.com','greg','$2a$12$vpXF7VCrYMJV6dg/hXgKh.cvr.sM.5RDv8HwojAcICrMr1ie5KKTW','greg'),(5,'jordann@gmail.com','jordann','$2a$12$mGhrOPzX6UIfQwzCo43FHuvlBn7TrSA8Hkjh/B4hmNR1Tgk4tFNoq','jordann');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-19 20:33:21
