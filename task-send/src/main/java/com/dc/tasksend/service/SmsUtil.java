package com.dc.tasksend.service;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

import java.io.IOException;

/**
 * @author duanchao
 * @CreateDate: 2019/8/21 0021 11:27
 */

public class SmsUtil {

    public static  void main(String[] args) throws IOException {
        send("18310735805","验证码：123456");
    }
    public static   void   send(String mobile, String content) throws IOException {
        HttpClient client = new HttpClient();
        PostMethod post = new PostMethod("http://utf8.api.smschinese.cn/");
        post.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=utf8");
        NameValuePair[] data ={ new NameValuePair("Uid", "duanchao0320"),
                new NameValuePair("Key", "d41d8cd98f00b204e980"),
                new NameValuePair("smsMob",mobile),new NameValuePair("smsText",content)};
        post.setRequestBody(data);

        client.executeMethod(post);
        Header[] headers = post.getResponseHeaders();
        int statusCode = post.getStatusCode();
        System.out.println("statusCode:"+statusCode);
        for(Header h : headers)
        {
            System.out.println(h.toString());
        }
        String result = new String(post.getResponseBodyAsString().getBytes("utf8"));
        System.out.println(result);


        post.releaseConnection();

    }


}
