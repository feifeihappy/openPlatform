package port;

import util.HttpUtil;

/**
 *
 *4、根据客户订单号查询信息接口
 * @author： 赵鹏飞
 * @create： 2017/8/9
 * @description： openPlatform
 */
public class CustomerOrderQueryMessage {

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
//        String requestUrl = "http://10.39.251.213:8080/open-web/rs/order/v1/query/NO1001779980229";
        String requestUrl = "http://localhost:8081/open-web/rs/order/v1/query/NO1001779980229";


        String result = HttpUtil.httpGet(keyString, companyId, requestUrl);
    }

}
