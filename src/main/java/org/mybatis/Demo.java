package org.mybatis;

import java.io.FileInputStream;
import java.io.InputStream;


/**
 * @author xujiabing
 * @email jiabing.xu@speediance.com
 * @date 2025/11/28 9:29
 * @Copyright Copyright (c)  Speediance Inc. All Rights Reserved.
 */
public class Demo {

  public static void main(String[] args) {
    m1();

    m2();
  }

  private static int m1() {

    int i = 3 / 0;

    return i;
  }

  private static void m2() {

    String A = "11111";

    InputStream inputStream = new FileInputStream("/aa/bb");

  }

}
