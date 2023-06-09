package top.lxyi.springboottasklearning.util;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;

public class MyQrCodeUtil {
    /**
     * 生成普通类型的二维码
     */
//    public static void createQrCode(String content, String output) {
//        if (FileUtil.exist(output)) {
//            FileUtil.del(output);
//        }
//        QrCodeUtil.generate(content, 300, 300, FileUtil.file(output));
//    }
    public static void generateGeneralQrCode() {
        // 三个参数分别是 扫码内容 宽高
        QrCodeUtil.generate("http://www.baidu.com/",
                500, 500,
                // 生成路径 切记换成自己的
                FileUtil.file("F:\\qrcode1.jpg"));
    }
    public static void main(String[] args) {
        generateGeneralQrCode();

    }
}
