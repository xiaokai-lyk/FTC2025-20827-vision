package org.firstinspires.ftc.teamcode.testings;

import static org.opencv.imgcodecs.Imgcodecs.imread;
import static org.opencv.imgcodecs.Imgcodecs.imwrite;
import static org.opencv.imgproc.Imgproc.COLOR_RGB2GRAY;
import static org.opencv.imgproc.Imgproc.cvtColor;

import org.opencv.core.CvType;
import org.opencv.core.Mat;

import java.net.URL;

class openCVtest {

    public void testOpencv() throws Exception {

        // 解决awt报错问题
        System.setProperty("java.awt.headless", "false");
        System.out.println(System.getProperty("java.library.path"));
        // 加载动态库
        URL url = ClassLoader.getSystemResource("lib/opencv/opencv_java440.dll");
        System.load(url.getPath());
        // 读取图像
        Mat image = imread("E:\\000-tempFiles\\Quicker_20240926_202934.png");
        if (image.empty()) {
            throw new Exception("image is empty");
        }

        // 创建输出单通道图像
        Mat grayImage = new Mat(image.rows(), image.cols(), CvType.CV_8SC1);
        // 进行图像色彩空间转换
        cvtColor(image, grayImage, COLOR_RGB2GRAY);

        imwrite("D://hello.jpg", grayImage);

    }
}