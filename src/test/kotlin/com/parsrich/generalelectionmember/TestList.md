# 회원 서버 기능

## 암복호화
 - [ ] 암호화된 토큰을 복호화한다.
 - [ ] 복호화 실패하면 공백을 반환한다.
 - [ ] 복호화된 정보를 객체로 생성한다.

## 인증
 - [ ] access token 과 refresh 토큰을 갖는다.
 - [ ] access token은 회원 정보를 갖고 있다.
 - [ ] refresh token 을 통해서 access token 을 재생성한다.
 - [ ] access token 의 유효성을 검증한다.
 - [ ] refresh token 의 유효성을 검증한다.
 - [ ] access token 이 탈취되어도 활용할 수 없어야 한다.
 - [ ] 유효기간이 지나면 refresh 토큰으로 토큰을 재생성한다.
 - [ ] refresh token 과 가장최근의 access token 을 모두 저장한다.
 - [ ] access token 만료되었으면 저장된 access token과 값은 같은지 확인과정을 거친후 refresh 토큰으로 access token 재생성
 - [ ] 저장된 access token이 아직 만료되지 않았는데 새로운 access token을 전송받았다면 refresh token 탈취된것 ->  access token / refresh token 파기 

## 회원
 - [ ] 회원정보는 id, 소셜 로그인 고유값, 이메일, 닉네임, 성별(Optional), 연령대(Optional), 지역(Optional)
 - [ ] 회원은 정치성향을 갖고 정치성향은 보수와 진보를 %로 표기한다. 
 - [ ] 각 진영을 대표하는 색 사이에 회원의 색을 지정하여 저장 (색상표)
 - [ ] 회원정보를 조회한다.
 - [ ] 회원정보를 갱신한다.
 - [ ] 회원정보를 삭제한다.
 - [ ] 회원은 여러개의 배찌를 가질 수있다
 - [ ] 대표 배찌를 지정할 수 있다.
 - [ ] 대표 배찌는 하나만 지정될 수 있고 배찌가 하나이상일 경우 반드시 한개는 대표배찌가 된다.
 - [ ] 회원의 신고 수를 저장한다.