#✈️ Way Into Travel (여행일정 구매/판매, 여행 후기 공유 사이트)

<img src="https://github.com/shahmaran0207/Member_project/blob/main/Readme_images/wit.png" alt="WIT Banner" width="100%"/>

---

## 🌐 **[🔗 서비스 바로가기](http://13.125.250.100:8084/)**

- **Test ID**: `test@naver.com`  
- **Test PW**: `testtest`

---

## 1️⃣ Project Overview (프로젝트 개요)

- **📝 프로젝트 이름**: **Way Into Travel (WIT)**  
- **📖 프로젝트 설명**:  
  여행일정을 구매 및 판매할 수 있는 플랫폼입니다.  
  - **여행 가이드가 되어 일정 판매**  
  - **다른 가이드 일정 구매**  
  - **여행 후기를 공유**할 수 있는 커뮤니티 기능 제공  

---

## 2️⃣ Team Members (팀원 및 팀 소개)

| 👩‍💻 이름   | 🎯 역할      | 🌍 GitHub 프로필                        |
| ---------- | --------- | -------------------------------------- |
| 박정은     | 기획 및 개발 |  [🔗 GitHub](https://github.com/shahmaran0207) |

---

## 3️⃣ Development Environment (개발 환경)

### 1. Front-End

| HTML | JavaScript | CSS |
|:----:|:----------:|:---:|
| <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/html5/html5-original.svg" alt="HTML5" width="60"/> | <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/javascript/javascript-original.svg" alt="JavaScript" width="60"/> | <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/css3/css3-original.svg" alt="CSS3" width="60"/> |

### 2. Back-End

| Spring Boot | Java | Firebase | Kakao Map API |
|:-----------:|:----:|:--------:|:-------------:|
| <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg" alt="Spring Boot" width="60"/> | <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="Java" width="60"/> | <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/firebase/firebase-plain.svg" alt="Firebase" width="60"/> | <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/google/google-original.svg" alt="Kakao Map API" width="60"/> |

### 3. Version Control

| GitHub |
|:------:|
| <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/github/github-original.svg" alt="GitHub" width="60"/> |

### 4. Deployment Environment

| RDS | EC2 | S3 |
|:---:|:---:|:--:|
| <img src="https://github.com/shahmaran0207/Member_project/blob/main/Readme_images/wit.png" alt="RDS" width="60"/> | <img src="https://github.com/shahmaran0207/Member_project/blob/main/Readme_images/wit.png" alt="EC2" width="60"/>| <img src="https://github.com/shahmaran0207/Member_project/blob/main/Readme_images/wit.png" alt="S3" width="60"/> |

<br>

## 4️⃣ Special Technology

### 1. Firebase
- 실제 사업을 컨셉으로 하였기에 보안을 위해 사용했습니다.
- Firebase의 Authentication를 통해 이메일 / 비밀번호로 회원가입 및 로그인을 하며 DB에 직접 비밀번호를 저장하지는 않습니다.
- 이메일 중복을 위해 가입한 이메일인지 체크하고 Firebase의 비밀번호 자릿수를 체크하는 로직을 회원가입 페이지에 추가하였습니다. 
<br>

### 2. S3
 - 사진 업로드 및 출력을 위해 사용하였습니다.
- 다운로드 시 업로드한 주소를 그래도 사용하니 접근이 되지 않아, 강제로 출력할 때 접근 주소를 변환하는 로직을 추가하였습니다. 

<br>

## 5️⃣Project Structure

```
📦project/
├── 📂 src/
│   └──  📂 main/
│       ├──  📂 java/
│       │   └──  📂 com/
│       │       └──  📂 JPA/
│       │           └── 📂 Member/
│       │               ├── MemberApplication.java                                           (프로젝트 메인 클래스, 실행 진입점)
│       │               ├──  📂 config/                                                      (설정 파일 모음)
│       │               │   └── 📜  FirebaseConfig.java                                      (FIrebase 초기화 파일)
│       │               │   └──  📜 QnA_WebConfig.java                                       (QnA 이미지 업로드 경로 설정 - 로컬 작업 시 사용)
│       │               │   └──  📜 S3Config.java                                            (AWS S3 관련 설정 - application.yml 에 있는 시크릿 키 밋 엑세스 키 적용)
│       │               │   └── 📜  WebConfig.java                                           (Board 게시판 사진 경로 설정 - 로컬 작업 시 사용, 로그인 인터셉터 적용 페이지 설정)
│       │               │
│       │               ├──  📂 Controller/                                                  ( 컨트롤러: 요청 처리 및 뷰 반환)
│       │               │   └──  📂 Board/   
│       │               │   │   └── 📜  BoardController.java                                 (게시판 컨트롤러 - CRUD 및 페이지 반환)
│       │               │   │   └──  📜 BoardHateController.java                             (게시판  싫어요 컨트롤러)
│       │               │   │   └──  📜 BoardLikeController.java                             (게시판  좋아요 컨트롤러)
│       │               │   │   └──  📜 CommentController.java                               (댓글 컨트롤러 = CRUD)
│       │               │   │
│       │               │   └──  📂 Guide/      
│       │               │   │   └──  📂 Guide/               
│       │               │   │   │   └──  📜 GuideController.java                             (가이드 컨트롤러 - 가이드 목록 및 상세정보 페이지 반환)
│       │               │   │   │   └── 📜  GuideHateController.java                         (가이드 싫어요 컨트롤러)
│       │               │   │   │   └── 📜  GuideLikeController.java                         (가이드 좋아요 컨트롤러)
│       │               │   │   │ 
│       │               │   │   └──  📂 TripList/             
│       │               │   │         └──  📜 SellController.java                            (판매 일정 컨트롤러 - CRUD)
│       │               │   │         └──  📜 TripListHateController.java                    (판매 일정 싫어요 컨트롤러)
│       │               │   │         └──  📜 TripListLikeController.java                    (판매 일정 좋아요컨트롤러)
│       │               │   │   
│       │               │   └──  📂  Member/         
│       │               │   │   └── 📜  MemberController.java                                (멤버 컨트롤러 - 가입 및 반환, 가이드 신청)
│       │               │   │
│       │               │   └──   📂 QnA/
│       │               │   │   └── 📂  Answer/       
│       │               │   │   │   └── 📜  AnswerController.java                            (답변 컨트롤러 - CRUD)
│       │               │   │   │        
│       │               │   │   └──  📂 Question/        
│       │               │   │         └── 📜 QuestionController.java                         (질문 컨트롤러 - CRUD) 
│       │               │   │
│       │               │   └──   📂 Travel_Review/            
│       │               │   │         └── 📜 Travel_Review_Controller.java                   (여행 후기 작성 컨트롤러 - CRUD) 
│       │               │   │         └── 📜 Travel_Review_HateController.java               (여행 후기 싫어요 컨트롤러) 
│       │               │   │         └── 📜 Travel_Review_LikeController.java               (여행 후기 좋아요 컨트롤러) 
│       │               │   │
│       │               │   └──  📜 HomeController.java                                      (메인 화면 구성을 위한 컨트롤러)
│       │               │
│       │               ├──  📂 DTO/                                                         (데이터 전송 객체)
│       │               │   └── 📂  Board/   
│       │               │   │   └──  📜 BoardDTO.java                                        (게시판 데이터 모델)
│       │               │   │   └──  📜 BoardHateDTO.java                                    (게시판 싫어요 데이터 모델)
│       │               │   │   └──  📜  BoardLikeDTO.java                                   (게시판 좋아요 데이터 모델)
│       │               │   │   └──  📜  CommentDTO.java                                     (댓글 데이터 모델)
│       │               │   │
│       │               │   └──  📂 Guide/
│       │               │   │   └── 📂  guide/
│       │               │   │   │    └──  📜 GuideDTO.java                                   (가이드 데이터 모델)
│       │               │   │   │    └──  📜 GuideHateDTO.java                               (가이드 싫어요 데이터 모델)
│       │               │   │   │    └──  📜 GuideLikeDTO.java                               (가이드 좋아요 데이터 모델)
│       │               │   │   │
│       │               │   │   └──  📂 TripList/              
│       │               │   │       └── 📜  TripListDTO.java                                 (판매 일정 데이터 모델)
│       │               │   │       └── 📜 TripListHateDTO.java                              (판매 일정 싫어요 데이터 모델)
│       │               │   │       └── 📜  TripListLikeDTO.java                             (판매 일정 좋아요 데이터 모델)
│       │               │   │
│       │               │   └──  📂 Member/   
│       │               │   │   └── 📜  MemberDTO.java                                       (멤버 데이터 모델)
│       │               │   │   └── 📜  MemberTripListDTOjava                                (구매한 일정 데이터 모델)
│       │               │   │
│       │               │   └──  📂 QnA/
│       │               │   │   └──  📂 Answer/       
│       │               │   │   │    └── 📜  AnswerDTO.java                                  (답변 데이터 모델)
│       │               │   │   │
│       │               │   │   └──  📂 Question/       
│       │               │   │         └── 📜  QuestionDTO.java                               (질문 데이터 모델)
│       │               │   │
│       │               │   └──  📂 Travel_Review/
│       │               │        └── 📜  ReviewDTO.java                                      (여행후기 데이터 모델)
│       │               │        └── 📜  TravelReviewHateDTO.java                            (여행후기 싫어요 데이터 모델)
│       │               │        └──  📜 TravelReviewLikeDTO.java                            (여행후기 좋아요 데이터 모델)
│       │               │
│       │               ├──  📂 Entity/                                                      (데이터베이스와 매핑되는 엔티티 클래스)
│       │               │   └──  📂 Board/   
│       │               │   │   └──  📜 BaseEntity.java                                      (게시판 기본 엔티티 - 생성, 수정 시간)
│       │               │   │   └──  📜 BoardEntity.java                                     (게시판 엔티티)
│       │               │   │   └──  📜  BaseFileEntity.java                                 (게시판 이미지 엔티티)
│       │               │   │   └──  📜  BoardHateEntity.java                                (게시판 싫어요 엔티티)
│       │               │   │   └──  📜 BoardLikeEntity.java                                 (게시판 좋아요 엔티티)
│       │               │   │   └──  📜 CommentEntity.java                                   (댓글 엔티티)
│       │               │   │
│       │               │   └──  📂 Guide/
│       │               │   │   └── 📂  Guide/
│       │               │   │   │    └──  📜 GuideEntity.java                                (가이드 엔티티)
│       │               │   │   │    └── 📜  GuideHateEntity.java                            (가이드 싫어요 엔티티)
│       │               │   │   │    └── 📜 GuideLikeEntity.java                             (가이드 좋아요 엔티티)
│       │               │   │   │
│       │               │   │   └── 📂  TripList/              
│       │               │   │       └──  📜 TripListEntity.java                              (판매일정 엔티티)
│       │               │   │       └──  📜 TripListHateEntity.java                          (판매일정 싫어요 엔티티)
│       │               │   │       └──  📜 TripListLikeEntity.java                          (판매일정 좋아요 엔티티)
│       │               │   │
│       │               │   └── 📂  Member/   
│       │               │   │   └── 📜  MemberEntity.java                                    (멤버 엔티티)
│       │               │   │   └── 📜  MemberProfileEntity.java                             (멤버 프로필 사진 엔티티)
│       │               │   │   └──  📜 MemberTripListEntity.java                            (구매일정 엔티티)
│       │               │   │
│       │               │   └── 📂  QnA/
│       │               │   │   └──  📂 Answer/       
│       │               │   │   │    └── 📜  AnswerEntity.java                               (답변 엔티티)
│       │               │   │   │
│       │               │   │   └── 📂  Question/       
│       │               │   │         └── 📜  QuestionEntity.java                           (질문 엔티티)
│       │               │   │         └──  📜 QuestionFileEntity.java                       (질문 이미지 엔티티)
│       │               │   │
│       │               │   └── 📂  Travel_Review/
│       │               │        └──  📜  ReviewBaseEntity.java                             (여행 후기 기본 엔티티 - 생성시간)
│       │               │        └──  📜  ReviewEntity.java                                 (여행후기 엔티티)
│       │               │        └──  📜  ReviewFileEntity.java                             (여행후기 이미지 파일 엔티티)
│       │               │        └──  📜 TravelReviewHateEntity.java                        (여행후기 싫어요 엔티티)
│       │               │        └──  📜 TravelReviewLikeEntity.java                        (여행후기 좋아요 엔티티)
│       │               │
│       │               ├── 📂  interceptor/
│       │               │   └──  📜 LoginInterceptor.java                                   (로그인 인터셉터)
│       │               │
│       │               ├── 📂  Repository /                                                (데이터베이스 접근 객체)
│       │               │   └── 📂  Board/   
│       │               │   │    └──  📜  BoardFileRepository.java                          (게시판 파일 레퍼지토리)
│       │               │   │    └──  📜  BoardHateRepository.java                          (게시판 싫어요 레퍼지토리)
│       │               │   │    └──  📜 BoardLikeRepository.java                           (게시판 좋아요 레퍼지토리)
│       │               │   │    └──  📜 BoardRepository.java                               (게시판  레퍼지토리)
│       │               │   │    └──  📜 CommentRepository.java                             (댓글 레퍼지토리)
│       │               │   │
│       │               │   └──  📂 Guide/
│       │               │   │   └── 📂  Guide/
│       │               │   │   │    └──  📜 GuideHateRepository.java                       (가이드 싫어요 레퍼지토리)
│       │               │   │   │    └──  📜 GuideLikeRepository.java                       (가이드 좋아요 레퍼지토리)
│       │               │   │   │    └──  📜 GuideRepository.java                           (가이드 레퍼지토리)
│       │               │   │   │
│       │               │   │   └── 📂  TripList/              
│       │               │   │         └──  📜 TripListHateRepository.java                   (여행일정 싫어요 레퍼지토리)
│       │               │   │         └──  📜 TripListLikeRepository.java                   (여행일정 좋아요 레퍼지토리)
│       │               │   │         └── 📜  TripListRepository.java                       (여행일정 레퍼지토리)
│       │               │   │
│       │               │   └── 📂  Member/   
│       │               │   │   └── 📜  MemberProfileRepository.java                        (멤버 프로필 이미지 레퍼지토리)
│       │               │   │   └── 📜  MemberRepository.java                               (멤버 레퍼지토리)
│       │               │   │   └── 📜  MemberTripListRepository.java                       (구매일정 레퍼지토리)
│       │               │   │
│       │               │   └──  📂 QnA/
│       │               │   │   └── 📂  Answer/       
│       │               │   │   │    └──  📜 AnswerRepository.java                          (답변 레퍼지토리)
│       │               │   │   │
│       │               │   │   └── 📂  Question/       
│       │               │   │         └──  📜 QuestionRepository.java                       (질문 레퍼지토리)
│       │               │   │
│       │               │   └── 📂  Travel_Review/
│       │               │              └──  📜 TravelReviewFileRepository.java              (여행후기 이미지 파일 레퍼지토리)
│       │               │              └──  📜 TravelReviewHateRepository.java              (여행후기 싫어요 레퍼지토리)
│       │               │              └──  📜 TravelReviewLikeRepository.java              (여행후기 좋아요 레퍼지토리)
│       │               │              └──  📜 TravelReviewRepository.java                  (여행후기 레퍼지토리)
│       │               │
│       │               └──  📂 Service/                                                    (비즈니스 로직)
│       │                   └── 📂  Board/   
│       │                   │     └── 📜  BoardHateService.java                             (게시판 싫어요 서비스)
│       │                   │     └──  📜 BoardLikeService.java                             (게시판 좋아요 서비스)
│       │                   │     └──  📜 BoardService.java                                 (게시판 서비스)
│       │                   │     └──  📜 CommentService.java                               (댓글 서비스)
│       │                   │
│       │                   └──  📂 Guide/
│       │                   │  └── 📂  Guide/
│       │                   │  │    └──  📜 GuideHateService.java                           (가이드 싫어요 서비스)   
│       │                   │  │    └── 📜  GuideLikeService.java                           (가이드 좋아요 서비스)   
│       │                   │  │    └── 📜  GuideService.java                               (가이드 서비스)   
│       │                   │  │
│       │                   │  └──  📂 TripList/              
│       │                   │        └──  📜 TripListHateService.java                       (판매일정 싫어요 서비스)   
│       │                   │        └──  📜 TripListLikeService.java                       (판매일정 좋아요 서비스)   
│       │                   │        └──  📜 TripListService.java                           (판매일정 서비스)   
│       │                   │    
│       │                   └──  📂 Member/   
│       │                   │  └── 📜  MemberService.java                                   (멤버 서비스)   
│       │                   │  └── 📜  MemberTripListService.java                           (구매일정 서비스)   
│       │                   │  └──  📜 ProfileService.java                                  (이미지 업로드 서비스)   
│       │                   │
│       │                   └── 📂  QnA/
│       │                   │ └── 📂  Answer/       
│       │                   │  │    └──  📜 AnswerService.java                              (답변서비스)   
│       │                   │  │ 
│       │                   │  └──  📂 Question/       
│       │                   │        └── 📜  QuestionService.java                           (질문서비스)   
│       │                   │
│       │                   └──  📂 Travel_Review/
│       │                   │        └──  📜 TravelReviewHateService.java                   (여행후기 싫어요 서비스)   
│       │                   │        └──  📜 TravelReviewLikeService.java                   (여행후기 좋아요서비스)   
│       │                   │        └── 📜  TravelReviewService.java                       (여행후기 서비스)   
│       │                   │
│       │                   └──  📜 S3Service.java                                          (S3 서비스)   
│       │               
│       │               
│       └──  📂 resources/
│           ├── 📂  static/
│           │   ├── 📂  assets/
│           │   │   ├──  📂 css/
│           │   │   └── 📂  js/     
│           │   └── 📂  images/           
│           │   
│           └──  📂 templates/
│           │   └──  📂 board/
│           │   │    └── 📜 detail.html                                                      (게시판 상세조회 페이지)   
│           │   │    └── 📜 paging.html                                                      (게시판 목록 페이지)   
│           │   │    └── 📜 save.html                                                        (게시판 작성 페이지)   
│           │   │    └── 📜 update.html                                                      (게시판 수정 페이지)   
│           │   │
│           │   └── 📂  guide/
│           │   │    └── 📜  detail.html                                                     (가이드 상세조회 페이지)   
│           │   │    └──  📜 list.html                                                       (가이드 목록 페이지)   
│           │   │
│           │   └── 📂  member/
│           │   │    └── 📜  buydetail.html                                                  (구매일정 상세조회 페이지)   
│           │   │    └──  📜 buylist.html                                                    (구매일정 목록 페이지)   
│           │   │    └── 📜  detail.html                                                     (멤버 상세조회 페이지)   
│           │   │    └──  📜 list.html                                                       (멤버 목록 페이지 - 배포에서는 사용 X)   
│           │   │    └── 📜  login.html                                                      (로그인 페이지)   
│           │   │    └── 📜  myPage.html                                                     (멤버 마이 페이지)   
│           │   │    └── 📜  save.html                                                       (회원가입 페이지)   
│           │   │    └──  📜 update.html                                                     (개인정보 수정 페이지)   
│           │   │
│           │   └──  📂 QnA/
│           │   │    └── 📂  Question/
│           │   │         └── 📜  detail.html                                                (문의사항 상세조회 페이지)  
│           │   │         └── 📜  list.html                                                  (문의사항 목록 페이지)  
│           │   │         └──  📜 write.html                                                 (문의사항 작성 페이지)  
│           │   │
│           │   └──  📂 Travel_Review/
│           │   │    └──  📜 detail.html                                                     (여행후기 상세조회 페이지)  
│           │   │    └── 📜  paging.html                                                     (여행후기 목록 페이지)  
│           │   │    └── 📜  save.html                                                       (여행후기 작성 페이지)  
│           │   │
│           │   └── 📂  TravelList/
│           │   │    └──  📜 detail.html                                                     (판매일정 상세조회 페이지)  
│           │   │    └──  📜 paging.html                                                     (판매일정 목록 페이지)  
│           │   │    └── 📜  save.html                                                       (판매일정 작성 페이지)  
│           │   │
│           │   └── 📜  home.html                                                            (메인 페이지) 
│           │   └── 📜 header.html                                                           (헤더 파일) 
│           │   
│           └── 🍃 application.yml                                                           
│           └── 🟣 service.json                                                              (Firebase SDK 파일 - 보안을 위해 업로드 하지 않음) 
│
├── 🐋 Dockerfile                                                                            (배포 위한 도커파일) 
```

<br>

## 6️⃣ 신경 쓴 부분
### 1. Firebase
<br>

### 2. S3

<br>

## 7️⃣ 페이지별 기능

### [초기화면]
- 

| 초기화면 |
|----------|
|![splash](https://github.com/shahmaran0207/Member_project/blob/main/Readme_images/wit.png)|

<br>
