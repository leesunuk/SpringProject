# Spring Study Project

👋 이 저장소는 Spring Boot 학습을 위한 개인 스터디 프로젝트입니다.  
Supabase(PostgreSQL)를 연동하여 실습 중심으로 개발 중입니다.

---

## 🛠 사용 기술 스택

- Java 17  
- Spring Boot 3.x  
- Gradle  
- JPA (Hibernate)  
- Lombok  
- Supabase (PostgreSQL)  
- IntelliJ IDEA  
- DBeaver / Supabase SQL Editor  

---

## 📌 구현 목표

- Spring Boot의 기본 구조 이해 및 실습  
- MVC 아키텍처 기반 REST API 개발  
- Supabase 클라우드 DB 연동  
- JPA를 통한 DB 자동 생성 및 테스트  
- Lombok을 활용한 코드 간결화  
- DB에 저장된 데이터를 웹 화면에 출력  
- Java 기본 문법 학습 (접근 제어자, static, 캡슐화 등)

---

## 📁 프로젝트 구조

```
SpringProject/
├── study/
│   ├── build.gradle
│   └── src/
│       ├── main/
│       │   ├── java/
│       │   │   └── com.study.study/
│       │   │       ├── announcement              # 공지 엔티티
│       │   │       ├── announcementRepository    # 공지 Repository
│       │   │       ├── bookController.java       # 공지 목록 출력용 컨트롤러
│       │   │       ├── BasicController.java      # 테스트용 컨트롤러
│       │   │       ├── Item.java                 # 상품 엔티티
│       │   │       ├── ItemController.java       # 상품 컨트롤러
│       │   │       ├── ItemRepository.java       # 상품 Repository
│       │   │       ├── StudyApplication.java     # 메인 클래스
│       │   │       └── Study.java                # 클래스 변수/메서드 학습용 클래스
│       │   └── resources/
│       │       ├── static/
│       │       │   └── index.html
│       │       ├── templates/
│       │       │   ├── list.html
│       │       │   └── book.html
│       │       └── application.properties
│       └── test/
│           └── java/com.study.study/
│               └── StudyApplicationTests.java
├── settings.gradle
├── build.gradle
└── .gitignore
```

---

## 🌐 Supabase 연동 설정

```properties
spring.datasource.url=jdbc:postgresql://aws-0-ap-northeast-2.pooler.supabase.com:5432/postgres
spring.datasource.username=postgres.xwftvntftyxrliosvirc
spring.datasource.password=1234
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.show_sql=true
spring.datasource.hikari.maximum-pool-size=3
```

---

## ✅ 개발 로그

| 날짜       | 작업 내용                                                   |
|------------|------------------------------------------------------------|
| 2025-04-19 | Spring Boot 프로젝트 생성, 기본 구조 구성                   |
| 2025-04-20 | Supabase DB 연동 완료                                      |
|            | Supabase 테이블 생성 및 데이터 입력                         |
|            | JPA Entity (`Item`, `Announcement`) 매핑 성공               |
| 2025-04-21 | Lombok 적용 (`@Getter`, `@RequiredArgsConstructor`) 도입    |
|            | 공지 데이터 `/book` 페이지에 출력 구현 (`book.html` 연결)   |
| 2025-04-22 | Java 클래스 기본 구조 학습:                                 |
|            | - 클래스 내 변수는 `private` 으로 설정해 외부 직접 접근 차단 |
|            | - `public` 메서드를 통해 값 변경 (캡슐화 개념 실습)         |
|            | - `static`은 객체 생성 없이 호출하는 유틸리티용 함수에 사용 |

---

## 🚀 실행 방법

1. 프로젝트 클론

```bash
git clone https://github.com/leesunuk/SpringProject.git
```

2. 디렉토리 이동 및 실행

```bash
cd SpringProject/study
./gradlew bootRun
```

또는 IntelliJ에서 `StudyApplication.java` 실행

---

## 📌 참고 자료

- [Spring Boot 공식 문서](https://spring.io/projects/spring-boot)
- [Supabase Docs](https://supabase.com/docs)
- [Baeldung - Spring Boot Guide](https://www.baeldung.com/)
- [코딩애플 - 쉽게 배우는 Spring Boot & JPA](https://codingapple.com/course/spring-boot-jpa/)
- [Lombok 공식 문서](https://projectlombok.org/)
