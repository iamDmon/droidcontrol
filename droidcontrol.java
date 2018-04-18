import java.io.*;
public class droidcontrol {
    
    String text;
    
    public static void main (String[] args)throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    for (String s: args) {
            if(s.equals("power")){
                new ProcessBuilder("cmd", "/c", "adb shell input keyevent KEYCODE_POWER").inheritIO().start().waitFor();
            }
            if(s.equals("vlmup")){
                new ProcessBuilder("cmd", "/c", "adb shell input keyevent KEYCODE_VOLUME_UP").inheritIO().start().waitFor();
            }
        if(s.equals("vlmdown")){
                new ProcessBuilder("cmd", "/c", "adb shell input keyevent KEYCODE_VOLUME_DOWN").inheritIO().start().waitFor();
        }
        if(s.equals("record")){
                new ProcessBuilder("cmd", "/c", "adb shell screenrecord --time-limit 20 sdcard/new.mp4").inheritIO().start().waitFor();
                new ProcessBuilder("cmd", "/c", "adb pull sdcard/new.mp4").inheritIO().start().waitFor();
        }
        if(s.equals("brtup")){
            new ProcessBuilder("cmd", "/c", "adb shell input keyevent KEYCODE_BRIGHTNESS_UP").inheritIO().start().waitFor();
        }
        if(s.equals("brtdown")){
            new ProcessBuilder("cmd", "/c", "adb shell input keyevent KEYCODE_BRIGHTNESS_DOWN").inheritIO().start().waitFor();
        }
        if(s.equals("hs")){
            new ProcessBuilder("cmd", "/c", "adb shell am start -n com.android.settings/.TetherSettings").inheritIO().start().waitFor();
            new ProcessBuilder("cmd", "/c", "adb shell input keyevent 20").inheritIO().start().waitFor();
            new ProcessBuilder("cmd", "/c", "adb shell input keyevent 20").inheritIO().start().waitFor();
            new ProcessBuilder("cmd", "/c", "adb shell input keyevent 66").inheritIO().start().waitFor();
        }
        if(s.equals("meminfo")){
            new ProcessBuilder("cmd", "/c", "adb shell dumpsys meminfo > sdcard/dump.txt").inheritIO().start().waitFor();
            new ProcessBuilder("cmd", "/c", "adb pull sdcard/dump.txt").inheritIO().start().waitFor();
        }
        if(s.equals("battery")){
            new ProcessBuilder("cmd", "/c", "adb shell dumpsys battery > sdcard/battery.txt").inheritIO().start().waitFor();
            new ProcessBuilder("cmd", "/c", "adb pull sdcard/battery.txt").inheritIO().start().waitFor();
        }
        if(s.equals("wifi")){
            new ProcessBuilder("cmd", "/c", "adb shell dumpsys wifi > sdcard/wifi.txt").inheritIO().start().waitFor();
            new ProcessBuilder("cmd", "/c", "adb pull sdcard/wifi.txt").inheritIO().start().waitFor();
        }
        if(s.equals("srv")){
            new ProcessBuilder("cmd", "/c", "adb shell service list").inheritIO().start().waitFor();
        }

        if(s.equals("swlft1")){
            new ProcessBuilder("cmd", "/c", "adb shell input swipe 100 960 980 960 250").inheritIO().start().waitFor();
        }
        if(s.equals("swlft2")){
            new ProcessBuilder("cmd", "/c", "adb shell input swipe 100 960 980 960 150").inheritIO().start().waitFor();
        }
        
        if(s.equals("swlft3")){
            new ProcessBuilder("cmd", "/c", "adb shell input swipe 100 960 980 960 50").inheritIO().start().waitFor();
        }
        
        
        if(s.equals("swrt1")){
            new ProcessBuilder("cmd", "/c", "adb shell input swipe 980 960 100 960 250").inheritIO().start().waitFor();
        }
        if(s.equals("swrt2")){
            new ProcessBuilder("cmd", "/c", "adb shell input swipe 980 960 100 960 150").inheritIO().start().waitFor();
        }
        
        if(s.equals("swrt3")){
            new ProcessBuilder("cmd", "/c", "adb shell input swipe 980 960 100 960 50").inheritIO().start().waitFor();
        }
        
        if(s.equals("swup1")){
            new ProcessBuilder("cmd", "/c", "adb shell input swipe 540 590 540 390 150").inheritIO().start().waitFor();
        }
        if(s.equals("swup2")){
            new ProcessBuilder("cmd", "/c", "adb shell input swipe 540 690 540 290 150").inheritIO().start().waitFor();
        }
        if(s.equals("swup3")){
            new ProcessBuilder("cmd", "/c", "adb shell input swipe 540 1780 540 100 150").inheritIO().start().waitFor();
        }
        
        if(s.equals("swdn1")){
            new ProcessBuilder("cmd", "/c", "adb shell input swipe 540 390 540 590 150").inheritIO().start().waitFor();
        }
        if(s.equals("swdn2")){
            new ProcessBuilder("cmd", "/c", "adb shell input swipe 540 290 540 690 150").inheritIO().start().waitFor();
        }
        if(s.equals("swdn3")){
            new ProcessBuilder("cmd", "/c", "adb shell input swipe 540 100 540 1780 150").inheritIO().start().waitFor();
        }
        
            
        if(s.equals("shell")){
            new ProcessBuilder("cmd", "/c", "adb shell ").inheritIO().start().waitFor();
        }
        
        
        
    }
    
}
    
}