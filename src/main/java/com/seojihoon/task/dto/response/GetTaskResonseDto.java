package com.seojihoon.task.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetTaskResonseDto extends ResponseDto {

    private Integer taskNumber;
    private String taskName;
    private String category;
    private String description;
    private String date;
    private String time;
    
}
