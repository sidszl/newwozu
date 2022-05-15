package com.zl.wozu_report.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PermissionEntry {

        private Integer id;

        private String code;

        private String description;

        private String url;


}
