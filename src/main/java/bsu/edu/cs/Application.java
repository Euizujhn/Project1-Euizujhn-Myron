package bsu.edu.cs;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Scanner;


public class Application {
// The Actual Menu, Journalist Picks the Info from this

//Go to Article, Basic Info about the Wiki, The Most Recent Wiki Changes

//Display info from the Wiki_Reader



    static Scanner input = new Scanner(System.in);
 Wikipedia_Reader reader = new Wikipedia_Reader();
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
            return Wiki;
        }
    }




