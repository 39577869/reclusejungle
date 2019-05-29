package com.elcusejungle.consumers;

import com.elcusejungle.entity.Reguser;
import com.elcusejungle.util.SerializationUtils;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Log4j2
@Component
public class EmailConsumers implements MessageListener{

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    private JavaMailSender mailSender;;

    @Override
    public void onMessage(Message message, byte[] bytes){
        RedisSerializer<String> valueSerializer = redisTemplate.getValueSerializer();
        String email = valueSerializer.deserialize(message.getBody());
        log.info("发送邮件:"+email);
        //邮件发送
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("15607050601@163.com");
        mailMessage.setTo(email);
        mailMessage.setSubject("验证码");
        Integer code=this.myRandom();
        String text = code.toString();
        mailMessage.setText(text);
        try {
            mailSender.send(mailMessage);
        }catch (Exception e){
            log.error("邮箱发送失败");
        }
    }

    public int myRandom(){
        int ran2 = (int)Math.floor(Math.random()*10000);
        System.out.println(ran2);
        return ran2;
    }
}
