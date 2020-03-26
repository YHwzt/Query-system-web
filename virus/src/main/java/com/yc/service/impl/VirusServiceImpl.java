package com.yc.service.impl;

import com.yc.beans.User;
import com.yc.beans.Virus;
import com.yc.mapper.VirusMapper;
import com.yc.service.UserService;
import com.yc.service.VirusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import java.util.Iterator;
import java.util.List;

@Service
public class VirusServiceImpl implements VirusService {
    @Autowired
    private VirusMapper virusMapper;
    @Autowired
    private JavaMailSenderImpl mailSender;
    @Value("${spring.mail.username}")
    String from;
    @Autowired
    private UserService userService;

    public List<Virus> findAll() {
        return virusMapper.selectByExample(null);
    }

    public Virus findById(Integer id) {
        return virusMapper.selectByPrimaryKey(id);
    }

    public int updateById(Virus virus) {
        return virusMapper.updateByPrimaryKey(virus);
    }

    public int insertById(Virus virus) {
        return virusMapper.insert(virus);
    }

    public int deleteById(Integer id) {
        return virusMapper.deleteByPrimaryKey(id);
    }

    public RequestAttributes getRequestAttributesSafely(){
        RequestAttributes requestAttributes = null;
        try{
            requestAttributes = RequestContextHolder.currentRequestAttributes();
        }catch (IllegalStateException e){
            requestAttributes = new NonWebRequestAttributes();
        }
        return requestAttributes;
    }

    @Scheduled(cron = "0 0 0 * * *")
    public void sendMail(){
           /* JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
            mailSender.setHost("smtp.qq.com");
            mailSender.setUsername("2104173571@qq.com");
            mailSender.setPassword("dwpyrrjrzylpbacf");

            SimpleMailMessage smm = new SimpleMailMessage();
            smm.setFrom(mailSender.getUsername());
            smm.setTo("1009036135@qq.com");
            smm.setSubject("Hello world");
            smm.setText("Hello world via spring mail sender");
            // 发送邮件
            mailSender.send(smm);*/


        try {
            System.out.println("发送成功"+from);
            SimpleMailMessage message = new SimpleMailMessage();
            message.setSubject("疫情填报通知");
            message.setText("请在十点前填写个人疫情信息");
            System.out.println(getUser1());
            message.setTo(getUser1());
            message.setFrom(from);
            mailSender.send(message);
        } catch (MailException e) {
            e.printStackTrace();
        }
    }


    public String[] getUser1(){
        List<User> all = userService.findAll();
        Iterator<User> iterator = all.iterator();
        while (iterator.hasNext()){
            User user = iterator.next();
            if (!user.getType().startsWith("1")){
                iterator.remove();
            }
        }
        System.out.println(all.size());
        String[] ss=new String[all.size()];
        for (int i = 0; i < all.size(); i++) {
            ss[i]=all.get(i).getUsername();
        }
        return ss;
    }

}
