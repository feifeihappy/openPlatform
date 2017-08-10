package port;

import model.PriceInModel;
import util.HttpUtil;
import util.JsonUtils;

import java.net.MalformedURLException;

/**
 * 6.价格查询接口
 *
 * @author： 赵鹏飞
 * @create： 2017/8/10
 * @description： openPlatform
 */
public class PriceQuery {
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
        String requestUrl = "http://10.39.251.213:8080/open-web/rs/order/v1/queryStandardPrice";
//        String requestUrl ="http://localhost:8081/open-web/rs/order/v1/queryStandardPrice";
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
        PriceInModel priceInModel = new PriceInModel();
        priceInModel.setSendProvinceName("北京市");
        priceInModel.setSendCityName("北京市");
        priceInModel.setSendCountyName("东城区");
        priceInModel.setArrivalProvinceName("上海市");
        priceInModel.setArrivalCityName("上海市");
        priceInModel.setArrivalCountyName("闵行区");
        priceInModel.setWeightNo(43);
        priceInModel.setVolumNo(2.3);
        priceInModel.setTransportType("YAZ");
        return JsonUtils.toJson(priceInModel);
    }


}
