package util;

/**
 * 生成测试签名工具类
 * @author 271755
 *
 */
public class TokenUtil {
	public static final String REQ_METHOD_GET = "GET";
	public static final String REQ_METHOD_POST = "POST";
	public static final String REQ_METHOD_PUT = "PUT";
	public static final String REQ_METHOD_DELETE = "DELETE";
	public static void main(String[] args) throws Exception {
		TokenUtil.RequestEntity req = new TokenUtil.RequestEntity();
		req.setReqMethod(REQ_METHOD_POST);
		req.setUri("/open-web/rs/order/v1/add");
		req.setReqTime("2016-01-25 16:34:42");
		req.setContent("{\"companyCode\":\"kd_niao\",\"customerOrderNo\":\"1234567\",\"senderName\":\"Taylor\",\"senderMobile\":\"15018442396\",\"senderProvince\":\"广东省\",\"senderCity\":\"深圳市\",\"senderCounty\":\"福田区\",\"senderAddress\":\"华强北\",\"receiverName\":\"Taylor\",\"receiverMobile\":\"15018442396\",\"receiverProvince\":\"广东省\",\"receiverCity\":\"广州市\",\"receiverCounty\":\"番禺区\",\"receiverAddress\":\"广州大学城\",\"cargoname\":\"鞋子\",\"transportType\":\"PTLD\",\"vistReceive\":\"YES\",\"deliveryType\":\"DOORSTEP\"}");
		req.setEncryptKey("SDO8PGOLWQMRU7KLXF");
		System.out.println(generateToken(req));
	}
	public static String generateToken(TokenUtil.RequestEntity req) throws Exception{
		/**
		 * 将请求方式+uri+请求时间+请求参数进行签名生成token 1.对请求方式+uri+请求时间+请求参数进行HMAC-SHA1加密
		 * 2.对加密后的byte数组进行Base64编码
		 */
		StringBuffer signatureStr = new StringBuffer();
		signatureStr.append(req.getReqMethod())
				.append("&");
		signatureStr.append(req.getUri()).append("&");
		signatureStr.append(req.getReqTime())
				.append("&");
		signatureStr.append(StringUtil.isEmpty(req.getContent()) ? "" : req.getContent());
		String signature = Base64Coder.encode(HMACSHA1Util.HmacSHA1Encrypt(
				signatureStr.toString(), req.getEncryptKey()));
		return signature;
	}
	public static class RequestEntity{
		/**
		 * 请求方式
		 */
		private String reqMethod;
		/**
		 * 请求uri
		 */
		private String uri;
		/**
		 * 请求时间
		 */
		private String reqTime;
		/**
		 * 请求参数
		 */
		private String content;
		/**
		 * 秘钥
		 */
		private String encryptKey;
		public String getReqMethod() {
			return reqMethod;
		}
		public void setReqMethod(String reqMethod) {
			this.reqMethod = reqMethod;
		}
		public String getUri() {
			return uri;
		}
		public void setUri(String uri) {
			this.uri = uri;
		}
		public String getReqTime() {
			return reqTime;
		}
		public void setReqTime(String reqTime) {
			this.reqTime = reqTime;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getEncryptKey() {
			return encryptKey;
		}
		public void setEncryptKey(String encryptKey) {
			this.encryptKey = encryptKey;
		}
		
	}

}
