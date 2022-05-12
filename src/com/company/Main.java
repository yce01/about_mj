package com.company;

import com.company.model.*;
import com.company.teams.*;

import java.util.*;

public class Main {
    Nas nas = new Nas();
    Envato envato = new Envato();
    List<Datas> datas = new ArrayList<>();
    List<VTemplates> templates = new ArrayList<>();
    List<Music> musics = new ArrayList<>();
    Video video = new Video();
    Camera camera = new Camera();
    Score score = new Score();

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("명작에 오신 것을 환영합니다.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("어느 파트를 보고 싶으신가요? (내부팀 / 외부팀) ");
        String inout = scanner.next();
        if(Objects.equals(inout, "내부팀")){
            String[] in = {"국장님", "제작1팀", "제작2팀", "제작3팀", "제작4팀", "음악팀", "경영지원팀", "팜키친", "3D팀", "개발팀"};
            ArrayList<String> teamIn = new ArrayList<>(Arrays.asList(in));
            System.out.println("내부팀에는..." + teamIn + "이 있습니다.");

            Scanner scanTeamIn = new Scanner(System.in);
            System.out.println("어느 팀의 업무를 알고 싶으신가요?");
            String printTeamIn = scanTeamIn.next();
            switch (printTeamIn) {
                case "국장님" -> main.whatDirectorDoes();
                case "제작1팀" -> main.whatProduction1Does();
                case "제작2팀" -> main.whatProduction2Does();
                case "제작3팀" -> main.whatProduction3Does();
                case "제작4팀" -> main.whatProduction4Does();
                case "음악팀" -> main.whatTeamMusicDoes();
                case "경영지원팀" -> main.whatManagementSupportDoes();
                case "팜키친" -> main.whatPalmKitchenDoes();
                case "3D팀" -> main.what3DDoes();
                case "개발팀" -> main.whatDevDoes();
            }
        } else if((Objects.equals(inout, "외부팀"))){
            String[] out = {"아나운서부", "성우부", "아웃소싱팀"};
            ArrayList<String> teamOut = new ArrayList<>(Arrays.asList(out));
            System.out.println("외부팀에는..." + teamOut + "이 있습니다.");

            Scanner scanTeamOut = new Scanner(System.in);
            System.out.println("어느 팀의 업무를 알고 싶으신가요?");
            String printTeamOut = scanTeamOut.next();
            switch (printTeamOut) {
                case "아나운서부" -> main.whatAnnouncerDoes();
                case "성우부" -> main.whatVoiceActorDoes();
                case "아웃소싱팀" -> main.whatOutsourcingDoes();
            }
        }
    }

    public void whatDirectorDoes(){
        Director director = new Director();
        director.morningAssembly();
        director.manage();
        director.pray();
    }
    public void whatProduction1Does(){
        Production1 one = new Production1();
        one.research(nas);
        one.searchTemplate(envato);
        one.findMusic(envato);
        one.editVideo(one.getDatas(), one.getTemplates(), one.getMusics());
        one.completeVideo(one.getVideo());
        one.pray();
        one.upload(one.getVideo());
        one.clean();
        one.playPingPong();
    }
    public void whatProduction2Does(){
        Production2 two = new Production2();
        two.research(nas);
        two.searchTemplate(envato);
        two.findMusic(envato);
        two.editVideo(two.getDatas(), two.getTemplates(), two.getMusics());
        two.completeVideo(two.getVideo());
        two.pray();
        two.upload(two.getVideo());
        two.filming(camera);
        two.clean();
        two.playFootVolleyball();
    }
    public void whatProduction3Does(){
        Production3 three = new Production3();
        three.research(nas);
        three.searchTemplate(envato);
        three.findMusic(envato);
        three.editVideo(three.getDatas(), three.getTemplates(), three.getMusics());
        three.completeVideo(three.getVideo());
        three.pray();
        three.upload(three.getVideo());
        three.filming(camera);
        three.clean();
        three.playPingPong();
    }
    public void whatProduction4Does(){
        Production4 four = new Production4();
        four.research(nas);
        four.searchTemplate(envato);
        four.findMusic(envato);
        four.editVideo(four.getDatas(), four.getTemplates(), four.getMusics());
        four.completeVideo(four.getVideo());
        four.pray();
        four.upload(four.getVideo());
        four.clean();
        four.playBadminton();
    }
    public void whatTeamMusicDoes(){
        TeamMusic teamMusic = new TeamMusic();
        teamMusic.compose();
        teamMusic.write();
        teamMusic.arrange();
        teamMusic.mixing();
        teamMusic.record(teamMusic.getVoice());
        teamMusic.record(teamMusic.getInst());
        teamMusic.upload(teamMusic.getMusic());
        teamMusic.upload(score);
        teamMusic.clean();
        teamMusic.playPingPong();
    }
    public void whatManagementSupportDoes(){
        ManagementSuppport teamMS = new ManagementSuppport();
        teamMS.manageMJ();
        teamMS.pay();
        teamMS.withdraw();
        teamMS.manageDisbursement();
        teamMS.handleInternet();
        teamMS.manageSponsor();
        teamMS.upload(video);
        teamMS.clean();
        teamMS.pray();
    }
    public void whatPalmKitchenDoes(){
        Kitchen kitchen = new Kitchen();
        kitchen.buyFoodIngredient();
        kitchen.cook(kitchen.getIngredients());
        kitchen.doTheDish();
        kitchen.clean();
        kitchen.pray();
    }
    public void what3DDoes(){
        Team3D team3D = new Team3D();
        team3D.make();
        team3D.clean();
        team3D.pray();
    }
    public void whatDevDoes(){
        TeamDev dev = new TeamDev();
        dev.app();
        dev.web();
        dev.server();
        dev.clean();
        dev.pray();
        dev.playFootVolleyball();
    }

    public void whatAnnouncerDoes(){
        Announcer announcer = new Announcer();
        announcer.record();
    }
    public void whatVoiceActorDoes(){
        VoiceActor actor = new VoiceActor();
        actor.record();
    }
    public void whatOutsourcingDoes(){
        Outsourcing out = new Outsourcing();
        out.research(nas);
        out.searchTemplate(envato);
        out.findMusic(envato);
        out.editVideo(out.getDatas(), out.getTemplates(), out.getMusics());
        out.completeVideo(out.getVideo());
    }
}
