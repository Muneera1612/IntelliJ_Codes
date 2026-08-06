package Oops_Pillars;

public class Social_media {
    public static void main(String[]args){
        SocialMedia sm=new SocialMedia();
        sm.login();
        sm.logout();
        sm.internet();
        sm.post();
        sm.savepost();
        sm.following();
        sm.chat();
        sm.uploadvideo();
        sm.download();
        sm.sbscribe();
        sm.status();
        sm.linkeddevice();
        sm.connection();
        sm.applyjob();

    }
    public interface Instagram{
        void login();
        void logout();
        void internet();
        void post();
        void chat();
        void following();
        void savepost();
    }
    interface Youtube{
        void login();
        void logout();
        void uploadvideo();
        void download();
        void sbscribe();
    }
    interface WhatsApp {
        void login();
        void logout();
        void chat();
        void status();
        void linkeddevice();
    }
    interface LinkedIn{
        void login();
        void logout();
        void connection();
        void applyjob();
    }
    static class SocialMedia implements Instagram,Youtube,WhatsApp,LinkedIn{
        @Override
        public void login(){
            System.out.println("Login successful");
        }
        @Override
        public void logout(){
            System.out.println("Logout successful");
        }
        @Override
        public void uploadvideo() {
            System.out.println("Video uploaded");
        }
        @Override
        public void download() {
            System.out.println("Download video");
        }
        @Override
        public void internet() {
            System.out.println("Without internet not access");
        }
        @Override
        public void post() {
            System.out.println("Posted");
        }
        @Override
        public void chat() {
            System.out.println("Chat withpeople");
        }

        @Override
        public void status() {
            System.out.println("Status viewed");
        }
        @Override
        public void linkeddevice() {
            System.out.println("Link with other device");
        }
        @Override
        public void following() {
            System.out.println("Whom we follow");
        }
        @Override
        public void savepost() {
            System.out.println("Post saved");
        }
        @Override
        public void sbscribe() {
            System.out.println("Channel subscribed");
        }
        public void connection() {
            System.out.println("Connect with people");
        }
        public void applyjob() {
            System.out.println("Apply job for carrier");
        }

    }
}
