--1) 학생의 평균 평점을 다음 형식에 따라 소수점 이하 2자리까지 검색하세요
--'OOO 학생의 평균 평점은 O.OO입니다.'
SELECT SNAME || '학생의 평균 평점은 ' || ROUND(AVR, 2) || '입니다.' 
	FROM STUDENT;

--2) 교수의 부임일을 다음 형식으로 표현하세요
--'OOO 교수의 부임일은 YYYY년 MM월 DD일입니다.'
--ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY년 MM월 DD일';
SELECT PF.PNAME || ' 교수의 부임일은 ' || EXTRACT(YEAR FROM PF.HIREDATE) || '년 ' || 
		EXTRACT(MONTH FROM PF.HIREDATE) || '월 ' || EXTRACT(DAY FROM PF.HIREDATE) || '일입니다.'
	FROM PROFESSOR PF;

--3) 교수중에 3월에 부임한 교수의 명단을 검색하세요
SELECT PNAME 
	FROM PROFESSOR
	WHERE EXTRACT(MONTH FROM HIREDATE) = '3';
