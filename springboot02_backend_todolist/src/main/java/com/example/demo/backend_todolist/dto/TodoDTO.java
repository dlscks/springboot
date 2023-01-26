package com.example.demo.backend_todolist.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
CREATE TABLE todolist(
id number PRIMARY KEY,
completed number(1) DEFAULT 0,
todoname VARCHAR2(100) NOT NULL);

CREATE SEQUENCE todo_id_seq
 START WITH 1
 INCREMENT By 1
 NOCACHE
 NOCYCLE;

INSERT INTO todolist 
VALUES(todo_id_seq.nextval, '0', '여행');

COMMIT;

SELECT * FROM todolist;
*/







/*
 *  @Data : @Getter, @Setter, @ToString, @EqualAndHashCode, @RequestedArgusConstructor을 합쳐 놓은 어노테이션이다.
 *  
 */

@Component //특정한 의미가 없는 클래스들은 알아서 빈으로 생성됨
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//@Data
public class TodoDTO {
	private int id;
	private int completed;
	private String todoname;

}
