# comento

Maven : version 4.0.0 : packaging war 
JDK 11

Spring: version 5.3.18
   - spring mvc 
   - lombok 1.18.12


Maria DB : version 2.0.3

Mybatis : version 3.4.4


#레거시 스프링 설정 너무 오래 걸렸네요 상당히 번거롭습니다 제가 이클립스는 잘 사용을 못해서 인텔리제이 환경에서 실시하였습니다

\n

#2차 과제
1) HTTP 통신에 관하여

HTTP 
HyperText Transfer Protocol
텍스트 기반의 통신 규약으로 **인터넷에서 데이터를 주고받을 수 있는 프로토콜이다.**


HTTP 특징

• 클라이언트 서버 구조

• 무상태 프로토콜(스테이스리스), 비연결성

• HTTP 메시지

• 단순함, 확장 가능


HTTP 메서드 종류

•GET: 리소스 조회

•POST: 요청 데이터 처리, 주로 등록에 사용

•PUT: 리소스를 대체, 해당 리소스가 없으면 생성

•PATCH: 리소스 부분 변경

•DELETE: 리소스 삭제


2) 브라우저에URL을 입력 후 요청하여 서버에서 응답하는 과정까지에 대해 
학습 한 내용을 작성

URL주소 입력->통신사 DNS서버에서 ip주소를 획득-> ip주소를 통해 TCP로 해당 웹서버에 접속 ->Http 메서드를 통해 요청을보냄 -> 웹서버에서 헤더와 메세지를 해석해 데이터처리후 응답을 보냄
