package com.seckill.dis.common.api.seckill.vo;

import java.awt.image.BufferedImage;
import java.io.Serializable;

/**
 * 验证码图片及计算结果
 *
 * @author noodle
 */
public class VerifyCodeVo implements Serializable {
    private static final long serialVersionUID = 2932583260654037317L;
    
    /**
     * 验证码图片
     */
    private BufferedImage image;

    /**
     * 验证码计算结果
     */
    private int expResult;


    public VerifyCodeVo() {
    }

    public VerifyCodeVo(BufferedImage image, int expResult) {
        this.image = image;
        this.expResult = expResult;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public int getExpResult() {
        return expResult;
    }

    public void setExpResult(int expResult) {
        this.expResult = expResult;
    }
}
