package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author mt_king mail:hyssmt@vip.qq.com
 * @ClassName: HttpUtil
 * @Description: TODO
 * @date 2015年4月22日 下午3:26:21
 */
public class HttpUtil {
    public static String charset = "UTF-8";

    /**
     * 模拟表单提交application/x-www-form-urlencoded，
     * 请求地址为默认baseUrl。
     *
     * @param params 参数格式：name=fuyuling&password=123456
     */
    public static String postForm(String params, String url) {
        String resultStr = postForm(params, url, null);
        return resultStr.toString();
    }

    /**
     * 模拟表单提交application/x-www-form-urlencoded，
     * 请求地址为默认baseUrl。
     *
     * @param params 参数格式：name=fuyuling&password=123456
     */
    public static String postForm(String params, String url, Map<String, String> headers) {
        if (headers == null) {
            headers = new HashMap<String, String>();
        }
        headers.put("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        headers.put("accept", "*/*");
        String resultStr = post(params, url, headers, null);
        return resultStr.toString();
    }

    /**
     * JSON提交
     */
    public static String postJson(String json, String url) {
        String resultStr = postJson(json, url, null);
        return resultStr.toString();
    }

    /**
     * JSON提交
     */
    public static String postJson(String json, String url, Map<String, String> headers) {
        if (headers == null) {
            headers = new HashMap<String, String>();
        }
        headers.put("Content-Type", "application/json;charset=UTF-8");
        headers.put("accept", "*/*");
        String resultStr = post(json, url, headers, null);
        return resultStr.toString();
    }

    /**
     * @param @param  body 请求body
     * @param @param  url 请求地址
     * @param @param  headers 请求头
     * @param @param  config 请求配置
     * @param @return
     * @return String
     * @throws
     * @Description: POST请求
     * @author 286330付于令
     * @date 2016年1月8日
     */
    public static String post(String body, String url, Map<String, String> headers,
                              Map<String, Object> config) {
        HttpURLConnection conn = null;
        PrintWriter printWriter = null;
        BufferedReader bufferedReader = null;
        try {
            conn = getConn(url, config, headers);
            printWriter = new PrintWriter(conn.getOutputStream());
            printWriter.print(body);
            printWriter.flush();
            bufferedReader = new BufferedReader(new InputStreamReader(
                    conn.getInputStream(), charset));
            String line = null;
            StringBuilder resultStr = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                resultStr.append(line);
            }
            return resultStr.toString();
        } catch (Exception e) {
            throw new RuntimeException("请求异常", e);
        } finally {
            if (conn != null)
                conn.disconnect();
            closeStream(bufferedReader, printWriter);
        }
    }

    /**
     * @param @param  urlStr 请求地址
     * @param @param  config 请求配置
     * @param @param  headers 请求头信息
     * @param @return
     * @param @throws IOException
     * @return HttpURLConnection
     * @throws
     * @Description: 获取连接并配置
     * @author 286330付于令
     * @date 2016年1月8日
     */
    private static HttpURLConnection getConn(String urlStr, Map<String, Object> config,
                                             Map<String, String> headers) throws IOException {
        HttpURLConnection conn = null;
        URL url = new URL(urlStr);
        conn = (HttpURLConnection) url.openConnection();
        Object requestMethod = null;
        Object connectTimeout = null;
        Object readTimeout = null;
        if (config != null) {
            requestMethod = config.get("requestMethod");
            connectTimeout = config.get("connectTimeout");
            readTimeout = config.get("readTimeout");
        }
        conn.setRequestMethod(requestMethod == null ? "POST" : (String) requestMethod);// 提交模式
        conn.setConnectTimeout(connectTimeout == null ? 10000 : (Integer) connectTimeout);//连接超时 单位毫秒
        conn.setReadTimeout(readTimeout == null ? 30000 : (Integer) readTimeout);//读取超时 单位毫秒

        conn.setDoOutput(true);// 是否输入参数
        conn.setDoInput(true);

        Set<Entry<String, String>> entrySet = headers.entrySet();
        for (Entry<String, String> entry : entrySet) {
            conn.setRequestProperty(entry.getKey(), entry.getValue());
        }
        return conn;
    }

    /**
     * http请求对输入参数加密生成 token 的get请求
     * @param keyString  秘钥key
     * @param companyId  客户id
     * @param requestUrl 请求地址
     * @methodName
     * @ReturnType
     * @author zpf
     * @mail zhaopengfeihappy@gmail.com
     * @createtime 2017/8/8 10:46
     */
    public static String httpGet(String keyString, String companyId, String requestUrl) {
        HttpURLConnection httpURLConnection = null;
        BufferedReader bufferedReader = null;
        StringBuffer responseResult = new StringBuffer();
        //这里写全参数，地址写比较实际
        String reqTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        try {
            URL realUrl = new URL(requestUrl);
            TokenUtil.RequestEntity en = new TokenUtil.RequestEntity();
            en.setEncryptKey(keyString);//秘钥
            en.setReqMethod(TokenUtil.REQ_METHOD_GET);//请求方式  POST   GET
            en.setReqTime(reqTime);//请求时间
            en.setUri(realUrl.getPath());//请求uri
            String token = TokenUtil.generateToken(en);
            // 打开和URL之间的连接
            httpURLConnection = (HttpURLConnection) realUrl.openConnection();
            // 设置通用的请求属性
            httpURLConnection.setRequestProperty("accept", "*/*");
            httpURLConnection.setRequestMethod(TokenUtil.REQ_METHOD_GET);
            httpURLConnection.setRequestProperty("companyId", companyId);
            httpURLConnection.setRequestProperty("reqTime", reqTime);
            httpURLConnection.setRequestProperty("token", token);
            httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
//
            // 根据ResponseCode判断连接是否成功
            Long long1 = new Date().getTime();
            int responseCode = httpURLConnection.getResponseCode();
            Long long2 = new Date().getTime();
            if (responseCode != 200) {
                System.out.println(" Error===" + responseCode);
            } else {
                System.out.println("Post Success!");
                System.out.println();
            }
            System.out.println(long2 - long1);
            // 定义BufferedReader输入流来读取URL的ResponseData
            bufferedReader = new BufferedReader(new InputStreamReader(
                    httpURLConnection.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                responseResult.append(line);
            }
            System.out.println(responseResult.toString());
        } catch (Exception e) {
            System.out.println("send post request error!" + e);
        } finally {
            httpURLConnection.disconnect();
            PrintWriter printWriter = null;
            closeStream(bufferedReader, printWriter);

        }
        return responseResult.toString();


    }


    /**
     *  http请求对输入参数加密生成 token 的post请求
     * @param keyString
     * @param companyId
     * @param requestUrl
     * @param content
     * @throws Exception
     */
    public static String httpPost(String keyString, String companyId, String requestUrl, String content) throws Exception {
        URL realUrl = new URL(requestUrl);
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        /**
         * 生成token
         */
        TokenUtil.RequestEntity en = new TokenUtil.RequestEntity();
        en.setContent(content);//参数
        en.setEncryptKey(keyString);//秘钥
        en.setReqMethod(TokenUtil.REQ_METHOD_POST);//请求方式  POST   GET
        en.setReqTime(date);//请求时间
        en.setUri(realUrl.getPath());//请求uri
        String token = TokenUtil.generateToken(en);

        /**
         * 网络请求
         */
        Map<String, String> headers = new HashMap<String, String>();
        headers.put(HttpConstant.HEADER_TOKEN, token);
        headers.put(HttpConstant.HEADER_REQUEST_TIME, date);
        headers.put(HttpConstant.HEADER_COMPANYID, companyId);
        return postJson(content, requestUrl, headers);
    }

    private static void closeStream(BufferedReader bufferedReader, PrintWriter printWriter) {
        try {
            if (printWriter != null) {
                printWriter.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


}
