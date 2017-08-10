package port;


import util.HttpUtil;
import util.TokenUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *1、获取运单号接口
 *@author zpf
 *@mail   zhaopengfeihappy@gmail.com
 *@createtime 2017/8/8 10:22
 */
public class GetWaybillTest {

    public static void main(String[] args) {
        /**
         * 秘钥key
         */
        String keyString = "";
        /**
         * 客户id
         */
        String companyId = "";
        /**
         * 接口地址
         */
        String requestUrl = "http://10.39.251.213:8080/open-web/rs/order/v1/getWaybill";


        String result = HttpUtil.httpGet(keyString, companyId, requestUrl);

    }

}
