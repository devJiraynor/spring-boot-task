package com.seojihoon.task.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seojihoon.task.dto.request.PatchTaskRequestDto;
import com.seojihoon.task.dto.request.PostTaskRequestDto;
import com.seojihoon.task.dto.response.DeleteTaskResponseDto;
import com.seojihoon.task.dto.response.GetTaskResonseDto;
import com.seojihoon.task.dto.response.PatchTaskResponseDto;
import com.seojihoon.task.dto.response.PostTaskResponseDto;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {

    // 일정 불러오기
    // 프로토콜://호스트:포트/api/v1/task/{taskNumber}
    @GetMapping("/{taskNumber}")
    public ResponseEntity<GetTaskResonseDto> getTask(
        @PathVariable("taskNumber") Integer taskNumber
    ) {
        return null;
    }

    // 일정 작성하기
    // 프로토콜://호스트:포트/api/v1/task
    @PostMapping("")
    public ResponseEntity<PostTaskResponseDto> postTask(
        @RequestBody PostTaskRequestDto requestBody
    ) {
        return null;
    }

    // 일정 수정하기
    // 프로토콜://호스트:포트/api/v1/task/{taskNumber}
    @PatchMapping("{taskNumber}")
    public ResponseEntity<PatchTaskResponseDto> patchTask(
        @PathVariable("taskNumber") Integer taskNumber,
        @RequestBody PatchTaskRequestDto requestBody
    ) {
        return null;
    }

    // 일정 삭제하기
    // 프로토콜://호스트:포트/api/v1/task/{taskNumber}
    @DeleteMapping("{taskNumber}")
    public ResponseEntity<DeleteTaskResponseDto> deleteTask(
        @PathVariable("taskNumber") Integer taskNumber
    ) {
        return null;
    }
    
}
