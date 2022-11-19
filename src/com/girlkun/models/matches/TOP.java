package com.girlkun.models.matches;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TOP {

    private String name;
    private byte gender;
    private long power;
    private long ki;
    private long hp;
    private long sd;
    private byte nv;
    private int sk;
}
