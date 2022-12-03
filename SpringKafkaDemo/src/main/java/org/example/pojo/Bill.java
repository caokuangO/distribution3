package org.example.pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Bill {
    private Double money;
    private String remark;
}
