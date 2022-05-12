package com.company.teams;

import com.company.model.Money;
import com.company.model.Music;
import com.company.model.Score;
import com.company.model.Video;
import com.company.things_they_do.IClean;
import com.company.things_they_do.IPray;
import com.company.things_they_do.IUpload;

public class ManagementSuppport implements IUpload, IPray, IClean {
    private Money money;
    @Override
    public void clean() {
        System.out.println("맡은 구역 청소하기");
    }

    @Override
    public void pray() {
        System.out.println("1시 기도");
    }

    @Override
    public void upload(Video video) {
        System.out.println("영상 업로드");
    }

    public void manageMJ(){
        System.out.println("명작 건물 관리하기");
    }
    public void pay(){
        System.out.println("결제하기");
    }
    public void withdraw(){
        System.out.println("출금하기");
    }
    public void manageDisbursement(){
        System.out.println("지출결의서 관리하기");
    }
    public void serviceCustomer(){
        System.out.println("CS");
    }
    public void handleInternet(){
        System.out.println("인터넷 관리");
    }
    public Money manageSponsor(){
        return money;
    }

    @Override
    public void upload(Music music) {
    }

    @Override
    public void upload(Score score) {
    }
}
