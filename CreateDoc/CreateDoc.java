import java.io.*;
 
class CreateDoc {

     public static void main(String args[])
  {
//(c) fredghostkyle.
//
//Copyright info:
        System.out.println("© fredghostkyle 2013. ALL RIGHTS RESERVED\nDo not copy or remake. Made in Java.");
        System.out.println("http://Fredghostkyle.com/CP");
//*PROGRAM* 
        System.out.println("\n \n \n");
        System.out.println("Welcome. We are creating doing mkdir from .java Doc. Good luck");
//creation
final File parentDir = new File("crawl_html.TXT");
parentDir.mkdir();
final String hash = "txt";
final String fileName = hash + ".txt";
final File file = new File(parentDir, fileName);
//i file.createNewFile(); 
//created file "crawl_html/abc.txt"
        System.out.println("Done!");
  }
}

// if "//i"+shit is declared. It was there but is now removed from testing. 