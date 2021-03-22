package com.example.apphttp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final HttpURLConnection[] connection = {null};
        InputStream in = null;
//        String Url = "http://192.168.1.231:8020/api/Values/";
        String Url = "https://www.baidu.com/";

        List<NameValuePair> list = new ArrayList<NameValuePair>();
        list.add(new BasicNameValuePair("123", "123"));

        HttpClient.doHttpGet(Url, list);
        HttpClient.doPost(Url, list);

        //       byte[] data = getRequestData(params, encode).toString().getBytes();
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    URL url = new URL(Url);
                    connection[0] = (HttpURLConnection) url.openConnection();
                    connection[0].setRequestMethod("GET");
                    connection[0].connect();//连接服务器
                    if (connection[0].getResponseCode() == 200) {
                        //使用字符流形式进行回复
                        InputStream is = connection[0].getInputStream();
                        //读取信息BufferReader
                        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                        StringBuffer buffer = new StringBuffer();
                        String readLine = "";
                        while ((readLine = reader.readLine()) != null) {
                            buffer.append(readLine);
                        }
                        is.close();
                        reader.close();
                        connection[0].disconnect();
                    }

//            connection.setConnectTimeout(3000);
//            connection.setDoInput(true);//设置开启输入
//            connection.setDoOutput(true);//设置开启输出
//            connection.setRequestMethod("POST");
//            connection.setUseCaches(false); //使用post不能使用缓存
//            connection.setRequestProperty("Content-Type", "application/json");//api要求
                    //数据长度
                    //      connection.setRequestProperty("Content-Length", String.valueOf(data.length));
//            OutputStream outputStream = connection.getOutputStream();
//      //      outputStream.write(data);//输出流发送到服务器
//
//            InputStreamReader inputStream = new InputStreamReader(connection.getInputStream());
//            BufferedReader bufferedReader = new BufferedReader(inputStream);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

//        private static StringBuffer getRequestData (Map < String, String > params, String
//        encode)//数据解析
//        {
//            //按照格式要求进行分解
//            StringBuffer stringBuffer = new StringBuffer("{");
//            try {
//                for (Map.Entry<String, String> entry : params.entrySet()) {
//                    stringBuffer.append("\"")
//                            .append("\"")
//                            .append(" : ")
//                            .append("\"")
//                            .append("\"");
//                }
//                stringBuffer.append("}");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            return stringBuffer;
//        }


    }
}