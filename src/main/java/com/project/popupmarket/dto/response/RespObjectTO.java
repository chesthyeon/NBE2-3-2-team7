package com.project.popupmarket.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RespObjectTO<T> {
    private int status;
    private String message;
    private T data;
}
