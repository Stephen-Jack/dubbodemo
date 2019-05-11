package cn.itcast.dobbo.controller;

import cn.itcast.dobbo.service.DobboService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dobbo")
public class DobboController {
    @Reference
    private DobboService dobboService;
    @RequestMapping("/demo")
    @ResponseBody
    public String dobboDobbo(){
        return dobboService.getName();
    }
}
