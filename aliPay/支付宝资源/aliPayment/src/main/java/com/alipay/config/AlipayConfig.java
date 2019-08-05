package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016100200644099";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCX2nXBfn9Wv/LeHYNqKVnxYLeCFjI1ZsYp+J6EaLrCVbJT5e8PHdwbbWzv52pY3NLNVEeak4MdQp8ierjT6u0sQbvtZ1z6hEsoZybTMtYLZskx2pGtJsjzltVnR85eiyR9lG28W31Ty8n4QMSls0juga70FAs7+/AAevhcY83AnMj7jtyfbZwIgyrZTCZkw3GER468omLGWN+MnsF7L4XQoHj7YIMH7qIdDRsD4NTkOhrBIc5MuzSkQQmtVhilg1VzTYfywO+/DOxsjDq45fHWCrlcGAS+e7xiHbYgzPF2VwfDpWF6v83DzBEbS+HVU9AxoUQrx6nk4PuwzwLlyeybAgMBAAECggEBAJW8Tec5g/kXlzVcJsxU8CKquujkWCf+KqMSS8TGvHmKJSjDj0H5sKO+9+9r4pqzTI45b83FbUE6A07tcjlM6wd73gJPrQg90RqK9GbHNvbRKM0m+ASkPPytG8sWrDDfxWCrLrXQBTnOtl48B2xY6C5+4/Q7m4RPfi4LE8GOjEFDEWbzMs6i9GdawvK/X+oJ1UxvII1zJDS+j4huCNF4dPlLCu3/cZMCWLnkKojAYe1iqMzcvgjg2kGMqsCPvEnqnJZ01cF4beQryKqAYhpHA+WDhEWd39wnCCLnYDlTPPqkoLUfxYh78EqnukapnHrmyEsOF3ONtO5wBm/LJXLAY5ECgYEA2+ptN6ym/tF5TXrjfmy+4hbtQWKHVKkdajrspujNjyibYqt++bjNFr0iS63mTDt9zI5fuGUL382H5CIKqWxTRmdh51sbXpRZE2TRN3ZDeZB3e4Oe/EOUQHYHIUnaw7sBY7Y7C8Yt/EfRBHLGZTNbP1+JRvc8pqn+GDIDSIZ8kXkCgYEAsMURxpjyfKSQT44ii0I2a+pv+qyqzyTEkQaEa2UgSPna7bwgNT/jQoHNxVhuXROImp/NcIAqQBVMZGEpsASerg/3ozawmCHx8KOlBDVa/i6f+nwadbd1jlHDsBRk3XIe7I9A6VDAWqyppmyFnfRL6N1BaW3eTMgOZs5IoZYBnbMCgYBchGQMPwtGOnPwv5lDT5aCYSjREBVk7Xyde0qh8WDBMFEmkoVpo3BMd6cc9XzkZ0bGLsNgPMphDgN0W0nm+taR0N5kSXTbNke/G/PUhGFgnAFYKghRklClScI4I+zv2RV9kGWIz4f7EW+CkpKacp+ZqqSDAXI3n15xaWDuOv3e6QKBgQCnkckuCGMmQSIEKGsatCO+3ThV20T4pJQqHpF89RpL0370CnhFwlB/BWm5AAFu/ktquL4ZPYXPxeDq7yiDkX2S59QKxpdVQCiHw7l0adfeSPiijO7QVJ990Ii+7DZJrhseiRYxlrkhu7f+6bUobSNglg2iEeK/yo3MaxRzCS5y/QKBgB9mYpNcdmAiaxzwiLXrThhW7Q1bP0nr7MGXW3RQHWUaqgRzW1p8jm/MM/QYyTDD8U52/8bxPu+ma3ewrGfQckopRTgG4AXxPfwum5fNUKNibhDFwQKhMNgE2dKuJQZNw6FBbMR4oxmwYu2fVcxk+JwqLN94PZ2mnEbllnY4HHIA";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAv4vrIfxRBTaB0WRBkIT6mnrxSCjUrKl5+/8DapD6r2/CNXjPlomfz4gLq/wgzQO8H7UDkN9Of0rRQbVya4f3w5LUbr8hCVyo4s3p3+TPw8LigMD8JdeH9q6th2UfyPWoNLBW7X8itWr8eQ7upJG3796FDrB+b08fW6AfeX1Zig7G6M24pPcA9LXLSvM3HuRv7qyEWsDkkx1b7BlntzG/cwoNBsiLg+/X8He4UDarPN7r3fO4yzgBTDADvmtZAGc9g4TkdFSemgv3DTQERXj61Ga7YtLZEiANhVynWc8o58zmuah0n0rsuYmvhrMxCo9m7Dwnvk3YxzOUSVwjEbeZ0wIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/index.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

