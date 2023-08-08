# kanban
칸반보드


## 3일차

* 컨트롤러 구성
    - 아이디 찾기 - /member/find_id
    - 비밀번호 찾기 - /member/find_pw
* 모델 구성
  - models/works/WorkSaveService.java : 작업등록, 수정
  - models/works/InfoService.java :  작업조회(개별 + 목록)
  - models/works/DeleteService.java : 작업 삭제
  - models/works/WorkDao.java : 작업 CRUD
  - models/works/Work : 작업 DTO
  - 
* 뷰 구성
 - 회원가입 양식 : /WEB-INF/view/member/join.jsp + _form.jsp(공통양식)
 - 정보 수정 양식 : /WEB-INF/view/member/info.jsp + _form.jsp(공통양식)
 - 로그인 양식 :  /WEB-INF/view/member/join.jsp
 - 아이디 찾기 : /WEB-INF/view/member/find_id.jsp
 - 비밀번호 찾기 : /WEB-INF/view/member/find_pw.jsp
 - 작업 목록 : /WEB-INF/works/list.jsp
 - 작업 조회 : /WEB-INF/works/view.jsp
 - 작업 등록 : /WEB-INF/works/add.jsp + _form.jsp(공통양식)
 - 작업 수정 : /WEB-INF/works/edit.jsp + _form.jsp(공통양식)
* 칸반 등록, 수정, 삭제, 조회

## 4일차
