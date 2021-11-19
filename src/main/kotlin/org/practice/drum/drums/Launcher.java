package org.practice.drum.drums;

public class Launcher implements Runnable {
    private static String[] args;

    public static void main(String[] args) {
        Launcher.args = args;
        new Thread(new Launcher()).start();
    }

    @Override
    public void run() { DrumsMain.main(args); }
}
