package com.seojihoon.task.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class DeleteTaskResponseDto extends ResponseDto {

    public DeleteTaskResponseDto(String code, String message) {
        super(code, message);
    }

}
