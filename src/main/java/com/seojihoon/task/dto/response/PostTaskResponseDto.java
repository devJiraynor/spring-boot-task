package com.seojihoon.task.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostTaskResponseDto extends ResponseDto {

    public PostTaskResponseDto(String code, String message) {
        super(code, message);
    }

}
