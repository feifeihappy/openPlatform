package port;

import model.PriceQueryVo;
import util.HttpUtil;
import util.JsonUtils;

import java.net.MalformedURLException;

/**
 *6/时效接口
 * @author： 赵鹏飞
 * @create： 2017/8/10
 * @description： openPlatform
 */
public class AgingQuery {

    public static void main(String[] args) {


        /**
         * 秘钥key
         */
        String keyString = "";
        /**
         *  客户id
         */
        String companyId = "";
        /**
         * 测试服务器:
         * 接口地址
         */
//        String requestUrl = "http://10.39.251.213:8080/open-web/rs/order/v1/queryPriceTimeItf";
//        String requestUrl ="http://localhost:8081/open-web/rs/order/v1/queryPriceTimeItf";
        String requestUrl ="http://10.39.59.193:8080/open-web/rs/order/v1/queryPriceTimeItf";

        /**
         * 订单对象转json
         */
        String content = changeObject();
        /**
         * post网络请求
         */
        //noinspection Duplicates
        try {
            String result = HttpUtil.httpPost(keyString, companyId, requestUrl, content);
            System.out.println(result);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String changeObject() {
        PriceQueryVo priceQueryVo = new PriceQueryVo();
        priceQueryVo.setEndCity("上海市");
        priceQueryVo.setEndCounty("闵行区");
        priceQueryVo.setShipperCity("洛阳市");
        priceQueryVo.setShipperCounty("洛龙区");
        priceQueryVo.setProductTypeId("100002");

        return JsonUtils.toJson(priceQueryVo);
    }




}
