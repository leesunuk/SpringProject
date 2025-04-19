# Spring Study Project

이 저장소는 Spring Framework를 학습하기 위한 개인 스터디용 프로젝트입니다. 실습을 통해 스프링의 핵심 개념과 기능들을 익히고자 합니다.

## 🛠️ 사용 기술 스택

- Java 17  
- Spring Boot 3.x  
- Gradle  
- JPA (Hibernate)  
- H2 Database (개발 및 테스트용)  
- IntelliJ IDEA  

## 📁 프로젝트 구조

```
study/
├── build.gradle
├── settings.gradle
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/study/
│   │   │       ├── controller/
│   │   │       ├── domain/
│   │   │       ├── repository/
│   │   │       ├── service/
│   │   │       └── StudyApplication.java
│   │   └── resources/
│   │       ├── application.yml
│   │       └── static/
│   └── test/
│       └── java/
│           └── com/example/study/
```

## 🎯 학습 목표

- Spring Boot 프로젝트 구조 이해  
- MVC 아키텍처 적용  
- RESTful API 설계 및 구현  
- JPA를 통한 데이터베이스 연동  
- 테스트 코드 작성 및 실행  

## 🚀 실행 방법

1. 이 저장소를 클론합니다:

   ```bash
   git clone https://github.com/leesunuk/SpringProject.git
   ```

2. 프로젝트 디렉토리로 이동합니다:

   ```bash
   cd SpringProject/study
   ```

3. 애플리케이션을 실행합니다:

   ```bash
   ./gradlew bootRun
   ```

   또는 IntelliJ IDEA에서 `StudyApplication` 클래스를 실행합니다.

## 📝 개발 로그

| 날짜       | 내용                     |
|------------|--------------------------|
| 2025-04-19 | 프로젝트 초기 설정 완료 |

## 📌 참고 자료

- [Spring 공식 문서](https://spring.io/projects/spring-boot)  
- [Baeldung - Spring Tutorials](https://www.baeldung.com/)  
- [코딩 애플 - 쉽게 배우는 Spring Boot & JPA]([https://www.inflearn.com/course/스프링-입문-스프링부트](https://codingapple.com/course/spring-boot-jpa/)
