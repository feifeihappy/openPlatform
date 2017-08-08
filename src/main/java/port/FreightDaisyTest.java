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
 * 货物跟踪记录查询
 *
 * @author zpf
 * @mail zhaopengfeihappy@gmail.com
 * @createtime 2017/8/3 16:24
 */
public class FreightDaisyTest {

    public static void main(String[] args) {
        /**
         * 秘钥key
         */
        String keyString = "ORL4eGeihgrLGGElgfe54";
        /**
         * 客户id
         */
        String companyId = "ORL";
        /**
         * 测试服务器:
         * 接口地址
         */
        String requestUrl = "http://10.39.251.213:8080/open-web/rs/waybill/v1/query/G4082357";
        /**
         * 运单号
         */
        String waybillNo = "G4082357";


        String result = HttpUtil.httpGet(keyString, companyId, requestUrl);


    }


}
