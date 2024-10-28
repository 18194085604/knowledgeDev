package com.gjy.model.request;

import lombok.Data;

@Data
public class PageRequest {

    private Integer pageNum = 1;

    private Integer pageSize = 10;
}
