package com.dc.tasksend.task;

import com.dc.tasksend.common.EmailCommon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * @author duanchao
 * @CreateDate: 2019/8/19 0019 16:12
 */
@Service
public class MailServiceImpl implements MailService {


    @Autowired
    private EmailCommon emailCommon;
    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendSimpleMail(String to, String subject, String content) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
        message.setFrom(emailCommon.getUsername());
        javaMailSender.send(message);
    }

    @Override
    public void sendHtmlMail(String[] to, String subject, String content) {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper ;

        try {
            helper = new MimeMessageHelper(message,true);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content,true);
            message.setFrom(emailCommon.getUsername());
            javaMailSender.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void sendAttachmentMail(String to, String subject, String content, String filePath) {

    }

    @Override
    public void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId) {

    }
}
