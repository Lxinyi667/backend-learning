package top.lxyi.mail.service;

import freemarker.template.Template;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;
import top.lxyi.mail.entity.Article;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@SpringBootTest
class MailServiceTest {
    @Resource
        private MailService mailService;
    @Resource
        private FreeMarkerConfig freeMarkerConfig;
    @Test
        void sendSimpleMail(){

        mailService.sendSimpleMail("1716186890@qq.com","简单尝试邮件标题","简单测试邮件内容");
    }
    @Test
        void sendMimeMail() throws Exception {
        mailService.sendMimeMail(
                "1716186890@qq.com","一封HTMl测试邮件",
                """
                        <body>
                              <div style="width:600px;height:400px;margin:auto:background:#9e98f9:color:#fff;text-align:center;">
                                                <h3>测试</h3>
                                                <img src="https://mail.qq.com/cgi-bin/getqqicon?sid=3tTlQq2BP3VLdhB0&uin=-846411439&mode=newaddr&mailaddr=1716186890%40qq.com">
                                                <p>
                                                <a style="text-decoration:none;color:#fff;" href="https://github.com/sslazy" target="_bank">
                                                <strong>我的主页</strong>
                                                </a>
                                                </p>
                                            </div>
                                        </body>
                        """
        );
    }
    @Test
    void sendFreemarketMail() throws Exception{
        List<Article> articles = List.of(
                new Article(1,"String",new Date()),
                new Article(2,"String MVC",new Date()),
                new Article(3,"Spring Boot",new Date())
        );
        Template template = freeMarkerConfig.getConfiguration().getTemplate("mail-temp.ftl");
        Map<String ,Object> map = new HashMap<>();
        map.put("articles",articles);
        String content = FreeMarkerTemplateUtils.processTemplateIntoString(template,map);
        mailService.sendMimeMail("1716186890@qq.com","这是一封Freemarker模板引擎邮件",content);
    }
}