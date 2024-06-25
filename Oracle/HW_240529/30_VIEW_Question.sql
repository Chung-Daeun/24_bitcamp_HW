--뷰 이름은 자유
--1) 학생의 평점 4.5 만점으로 환산된 정보를 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW NEW_RESULT(
	SNO,
	SNAME,
	AVR
) AS (
		SELECT SNO
			, SNAME
			, AVR / 4.0 * 4.5
			FROM STUDENT
	);
	
SELECT *
	FROM NEW_RESULT;

--2) 각 과목별 기말고사 평균 점수를 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW FIN_AVG(
	CNO,
	CNAME,
	AVG_RESULT
) AS (
		SELECT C.CNO
			, C.CNAME
			, AVG(RESULT)
			FROM SCORE SC
			JOIN COURSE C
			  ON SC.CNO = C.CNO
			GROUP BY C.CNO, C.CNAME
	);


--3) 각 사원과 관리자(MGR)의 이름을 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW EMPLOYEE(
	ENO,
	ENAME,
	MGR,
	MNAME
) AS (
		SELECT E.ENO
			, E.ENAME
			, E.MGR
			, M.ENAME
			FROM EMP E
			JOIN EMP M
			  ON E.MGR = M.ENO
	);

--4) 각 과목별 기말고사 평가 등급(A~F)까지와 해당 학생 정보를 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW FIN_GRADE (
	CNO,
	CNAME,
	GRADE,
	SNO,
	SNAME
) AS (
	SELECT C.CNO
		, C.CNAME
		, SCG.GRADE
		, ST.SNO
		, ST.SNAME
		FROM SCGRADE SCG
		JOIN SCORE SC
		  ON SC.RESULT BETWEEN SCG.LOSCORE AND SCG.HISCORE
		JOIN COURSE C
		  ON C.CNO = SC.CNO
		JOIN STUDENT ST
		  ON ST.SNO = SC.SNO
)

--5) 물리학과 교수의 과목을 수강하는 학생의 명단을 검색할 뷰를 생성하세요.
CREATE OR REPLACE VIEW STUDENT_LIST(
	SNO,
	SNAME
) AS (
		SELECT DISTINCT ST.SNO
			, ST.SNAME
			FROM SCORE SC
			JOIN COURSE C
			  ON C.CNO = SC.CNO
			JOIN STUDENT ST
			  ON ST.SNO = SC.SNO
			JOIN PROFESSOR P
			  ON P.PNO = C.PNO
			  AND P.SECTION = '물리'
	)