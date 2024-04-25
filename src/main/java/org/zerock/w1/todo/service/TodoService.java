package org.zerock.w1.todo.service;

import org.zerock.w1.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TodoService { //enum(열거형)은 명시적으로 인스턴스가 하나만 존재하는 것을 보장(INSTANCE).
    INSTANCE;

    //register() : 새 TodoDTO 객체를 등록
    public void register(TodoDTO todoDTO) {
        System.out.println("DEBUG.........." + todoDTO);
    }

    //getList() : TodoDTO 객체 리스트를 반환.
    // 리스트는 0부터 9까지의 숫자를 이용해 10개의 TodoDTO 객체를 생성하며, 각각의 객체는 유일한 tno (todo number), title (제목), 그리고 dueDate (마감일)을 가짐.
    public List<TodoDTO> getList() {
        List<TodoDTO> todoDTOS = IntStream.range(0,10).mapToObj(i->{
            TodoDTO dto = new TodoDTO();
            dto.setTno((long) i);
            dto.setTitle("Todo.." + i);
            dto.setDueDate(LocalDate.now());

            return dto; //0부터 9까지의 정수 스트림을 생성하고, 각 정수에 대해 TodoDTO 객체를 생성하는 람다 함수를 매핑
        }).collect(Collectors.toList()); //스트림에서 생성된 객체들을 리스트로 수집
        return todoDTOS;
    }

    public TodoDTO get(Long tno) {
        TodoDTO dto = new TodoDTO();
        dto.setTno(tno);
        dto.setTitle("Sample Todo");
        dto.setDueDate(LocalDate.now());
        dto.setFinished(true);

        return dto;
    }
}
