package com.seojihoon.task.dto.request;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatchTaskRequestDto {
    // 일정 번호
    private Integer taskNumber;
    // 일정이름
    @NotEmpty
    private String taskName;
    // 카테고리
    @NotEmpty
    private String category;
    // 설명
    @NotEmpty
    private String description;
    // 날짜
    @NotEmpty
    private String date;
    // 시간
    @NotEmpty
    private String time;
}

