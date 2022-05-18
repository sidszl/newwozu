package com.zl.wozu_report.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/month")
public class MonthOrderReportController {

    @PostMapping("/oderReport")
  //  @PreAuthorize("hasAuthority('teacher')")
    public boolean oderReport(@RequestParam String key){
        return   true;
    }

}
