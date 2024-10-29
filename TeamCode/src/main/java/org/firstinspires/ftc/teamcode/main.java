package org.firstinspires.ftc.teamcode;

import static org.opencv.imgproc.Imgproc.COLOR_RGB2GRAY;
import static org.opencv.imgproc.Imgproc.cvtColor;

import org.opencv.core.CvType;
import org.opencv.core.Rect;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;

public class main {
    private Mat grayscaleImage(Mat originalImage){
        Mat grayImage = new Mat(originalImage.rows(), originalImage.cols(), CvType.CV_8SC1);
        cvtColor(originalImage, grayImage, COLOR_RGB2GRAY);
        return grayImage;
    }
    private double getAvgSaturation(Mat input, Rect rect) {
        Mat submat;
        submat = input.submat(rect);
        Scalar color = Core.mean(submat);
        return color.val[1];
    }

    public Rect getSamplePos(Mat input){
        Rect res=new Rect();
        return res;
    }
}
