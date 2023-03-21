package com.ua.robot.homework20;

public class Translation {
    private String english;
    private String german;
    private String japan;

    public Translation(String english, String german, String japan) {
        this.english = english;
        this.german = german;
        this.japan = japan;
    }

    @Override
    public String toString() {
        return  "\nанглійською:'" + english + "', \n" +
                "німецькою:'" + german + "', \n" +
                "японською'" + japan + "' \n";
    }
}
