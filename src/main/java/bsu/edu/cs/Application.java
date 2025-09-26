package bsu.edu.cs;

import java.io.IOException;
import java.util.Scanner;


public class TheApplication {
// The Actual Menu, Journalist Picks the Info from this


    static Scanner input = new Scanner(System.in);
    Wikipedia_Reader_For_Test reader = new Wikipedia_Reader_For_Test();
    String title = getTheTitle();

    public static void main(String[] args) throws IOException {
        String title = getTheTitle();
        if(title == null || title.isBlank()){
            System.err.println("Error: Page not Found");
            return;
        }
    }

        public static String getTheTitle(){
            System.out.println("Enter an Article from the list:\nVideo Game\n");
            String Wiki = input.nextLine();
            if(Wiki.equals("Video Game") || (Wiki.equals("video game"))){
                System.out.println();
                System.out.println("Recent User Changes" +
                        "\nUser:Chris the Speller - Timestamp:2025-09-19T04:30:52Z" +
                        "\nUser:GreenC bot - Timestamp:2025-09-16T18:45:35Z" +
                        "\nUser:Æ's old account wasn't working - TimeStamp:2025-09-07T07:16:17Z" +
                        "\nUser:Æ's old account wasn't working - TimeStamp:2025-08-15T04:35:35Z");
            }
            return Wiki;
        }
    
    public class getInfo {
        //Recieve Info Directly from JSON (Work in Progress)
    }
}

    //Go to Article, Basic Info about the Wiki, The Most Recent Wiki Changes

    //Display info from the Wiki_Reader




