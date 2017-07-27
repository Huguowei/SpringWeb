package org.clay.controller2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ClayHu on 2017-07-26.
 * FUCK OFF!
 */
// 注解标注此类为springmvc的controller，url映射为"/home"
@Controller
@RequestMapping("/home2")
public class HomeController2 {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(HomeController2.class);

    //映射一个action
    @RequestMapping(method = RequestMethod.GET, path = "/{page}")
    public String index(@PathVariable("page") String page) {
        //输出日志文件
        logger.info("the first jsp pages");
        //返回一个index.jsp这个视图
        return page;
    }
}
