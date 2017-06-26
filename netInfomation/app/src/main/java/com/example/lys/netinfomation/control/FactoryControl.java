package com.example.lys.netinfomation.control;

/**
 * Created by Lys on 2017/5/22.
 */

import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;

/**
 * 关于控制的工厂类
 */
public class FactoryControl {

    /**
     * Post请求
     * @param tragetUrl 请求网址
     * @param key 请求参数
     * @return
     */
    public static Ret httpPostRequset(String tragetUrl,String key){
        String respond = null;//从服务器返回过来的字符串
        boolean state = false;
        BufferedReader bufferedReader = null; //只要关闭最外层的流，它会自动调用内层的close关闭内层的流
        try {
            URL url = new URL(tragetUrl);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setUseCaches(false);//不使用缓存
            conn.setRequestMethod("POST");//POST请求方式
            if(conn.getResponseCode() == HttpURLConnection.HTTP_OK){ //检测是否请求成功，如果失败则把正确的流切换为错误流
                bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                state = true;
            }
            else    {
                bufferedReader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
                state = false;
            }
            String Line = null;
            while((Line = bufferedReader.readLine()) != null){
                respond += Line;
            }
            bufferedReader.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(bufferedReader != null) bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return new Ret(state,respond);
    }
}
