--1) 과목번호, 과목이름, 과목별 평균 기말고사 성적을 갖는 레코드의 배열을 만들고
--   기본 LOOP문을 이용해서 모든 과목의 과목번호, 과목이름, 과목별 평균 기말고사 성적을 출력하세요.
DECLARE
    TYPE COURSE_REC IS RECORD(
        CNO COURSE.CNO%TYPE,
        CNAME COURSE.CNAME%TYPE,
        AVG_RESULT SCORE.RESULT%TYPE
        );
    TYPE C_REC_ARR IS TABLE OF COURSE_REC
    INDEX BY PLS_INTEGER;
    IDX NUMBER := 0;
    
    CSRECARR C_REC_ARR;

    CURSOR CUR_SC IS
        SELECT C.CNO
            , C.CNAME
            , ROUND(AVG(SC.RESULT), 2) AS RES
            FROM COURSE C
            JOIN SCORE SC
              ON C.CNO = SC.CNO
            GROUP BY c.cno, c.cname;
BEGIN
    FOR REC IN CUR_SC LOOP
        CSRECARR(IDX) := REC;
        DBMS_OUTPUT.PUT_LINE(CSRECARR(IDX).CNO);
        DBMS_OUTPUT.PUT_LINE(CSRECARR(IDX).CNAME);
        DBMS_OUTPUT.PUT_LINE(CSRECARR(IDX).AVG_RESULT);
        DBMS_OUTPUT.PUT_LINE('-----------------------------');
        IDX := IDX + 1;
    END LOOP;
END;
/
--2) 학생번호, 학생이름과 학생별 평균 기말고사 성적을 갖는 테이블 T_STAVGSC를 만들고
--   커서를 이용하여 학생번호, 학생이름, 학생별 평균 기말고사 성적을 조회하고 
--   조회된 데이터를 생성한 테이블인 T_STAVGSC에 저장하세요.
CREATE TABLE T_STAVGSC(
    SNO VARCHAR2(8),
    SNAME VARCHAR2(20),
    AVG_RES NUMBER
    );
         
DECLARE
    CURSOR CUR_ST IS
        SELECT ST.SNO
             , ST.SNAME
             , ROUND(AVG(SC.RESULT), 2) AS AVG_RES
               FROM STUDENT ST
               JOIN SCORE SC
                 ON ST.SNO = SC.SNO
                 GROUP BY ST.SNO, ST.SNAME;
BEGIN
    FOR TEMP IN CUR_ST LOOP
        INSERT INTO T_STAVGSC
        VALUES TEMP;
    END LOOP;
END;
/
SELECT *
    FROM T_STAVGSC;
