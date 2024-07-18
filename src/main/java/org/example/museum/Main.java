package org.example.museum;

import org.example.museum.panels.AdminPanel;
import org.example.museum.panels.UserPanel;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();

        UserPanel.userInterface(museum);

        System.out.println(museum);

        AdminPanel.adminInterface(museum);
    }
}
