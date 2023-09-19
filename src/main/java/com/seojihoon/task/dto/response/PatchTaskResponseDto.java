package com.seojihoon.task.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PatchTaskResponseDto extends ResponseDto {
    
    public PatchTaskResponseDto(String code, String message) {
        super(code, message);
    }
}
