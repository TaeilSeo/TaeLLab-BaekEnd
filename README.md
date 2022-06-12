# TaeLab-BaekEnd
TaeLab BackEnd - Spring Boot

## Stock
- 주식 뉴스(국내 + 해외)
- 관심 목록(국내 + 해외)

## Global
+ 글로벌 뉴스
  * 조회
  * 등록
  * 수정
  * 삭제

## Health
+ 비타민 정보 제공
  * 조회
  * 등록
  * 수정
  * 삭제

## Keyword
+ 각종 분야의 키워드 정보 제공
  * 조회
  * 등록
  * 수정
  * 삭제

- - -

# Dev Log
## 2022-06-09
- ***Lombok*** 적용
  + Lombok이란?
    + VO, DTO 등의 객체 생성시, 생성자, geter, setter 등을 annotation을 통해 간편하게 생성해주는 java library
  + 적용 이유
    + 객체 생성시마다 추가해줘야 했던 추가 코드들을 간편하게 생성/관리함으로서 생산성을 높일 수 있다!

## 2022-06-11
- RequestBody Error Fixed
  + 프론트단에서 axios를 통해 정상적으로 request가 이루어지고, 백엔드 단에서의 코드상 오류가 없음에도 불구하고 RequestBody를 통해 받은 dto객체의 값이 null인 상황이 지속되었다.
  + 프론트단에서 값이 잘못 넘어가나 싶어, Postman등을 이용하여 실험해 보았으나 여전히 값을 읽어들이지 못했다.
  + 관련 자료를 구글링하던 중, RequestBody의 import 가 잘못되었을 수 있다는 글을 보았고, 확인해 보니 정말 잘못돼 있었다.
  + https://github.com/TaeilSeo/TaeLab-BaekEnd/issues/1#issue-1268664820 다음 이슈에서처럼 정상적 경로로 import 했다.

## 2022-06-12
- MyBatis Inner Class "java.lang.ClassNotFoundException" Fixed https://github.com/TaeilSeo/TaeLab-BaekEnd/issues/2#issue-1268669374
