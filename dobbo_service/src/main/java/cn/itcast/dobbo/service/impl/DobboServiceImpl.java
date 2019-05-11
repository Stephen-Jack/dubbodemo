package cn.itcast.dobbo.service.impl;

import cn.itcast.dobbo.service.DobboService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class DobboServiceImpl implements DobboService {

    @Override
    public String getName() {
        return "chen";
    }
}
