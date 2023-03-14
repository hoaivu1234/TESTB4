package com.vti.entity.inheritance.QS1_2;

import com.vti.entity.inheritance.QS1_2.CanBo;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private byte bac;

    public byte getBac() {
        return bac;
    }

    @Override
    public void input() {
        super.input();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập bậc của công nhân: ");
        bac = scanner.nextByte();
    }

    @Override
    public void getInfor() {
        super.getInfor();
        System.out.println("Bậc  : " + bac);
    }
}
