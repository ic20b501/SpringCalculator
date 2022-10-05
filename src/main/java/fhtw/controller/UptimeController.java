package fhtw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UptimeController {
    @GetMapping("/uptime/minutes")
    public double caluclateuptime(@RequestParam double relative)
    {
        double minutesofmonth = 60*24*30;
        double defineuptimepercent = relative / 100;
        return minutesofmonth * defineuptimepercent; //uptime in minutes
    }
    @GetMapping("/uptime/hours")
    public double calculateuptimehours(@RequestParam double relative)
    {
        double hoursofmonth = 24*30;
        double defineuptimepercent = relative / 100;
        return hoursofmonth * defineuptimepercent; //uptime in minutes
    }
}
