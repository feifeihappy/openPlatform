package port;


import util.HttpUtil;

/**
 * 1、货物跟踪接口
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
        String keyString = "";
        /**
         * 客户id
         */
        String companyId = "";
        /**
         * 测试服务器:
         * 接口地址
         */
        String requestUrl = "http://10.39.251.213:8080/open-web/rs/waybill/v1/query/G4082357";



        String result = HttpUtil.httpGet(keyString, companyId, requestUrl);


    }


}
