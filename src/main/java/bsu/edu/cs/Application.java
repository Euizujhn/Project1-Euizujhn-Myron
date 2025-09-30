package bsu.edu.cs;

import java.io.IOException;
import java.util.Scanner;


public class Application {
// The Actual Menu, Journalist Picks the Info from this
static Scanner input = new Scanner(System.in);
Wikipedia reader = new Wikipedia();
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
            String WikiSearch = input.nextLine();
            if(WikiSearch.equals("Video Game") || (WikiSearch.equals("video game"))){
                System.out.println();
                System.out.println("Recent User Changes" +
                        "\nUser:Chris the Speller / Date:2025-09-19 / Time:04:30:52" +
                        "\nUser:GreenC bot / Date:2025-09-16 / Time:18:45:35" +
                        "\nUser:Æ's old account wasn't working / Date:2025-09-07 / Time:07:16:17" +
                        "\nUser:Æ's old account wasn't working / Date:2025-08-15 / Time:04:35:35");
            }
            return WikiSearch;
        }

}

    //Go to Article, Basic Info about the Wiki, The Most Recent Wiki Changes

    //Display info from the Wiki_Reader



