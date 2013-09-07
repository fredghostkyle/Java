//Copyright @Fredghostkyle
//2013 All Rights Reserved. 
import java.io.*;
class CreateDoc {
    public static void main(String args[])
  {
        System.out.println("© fredghostkyle 2013. ALL RIGHTS RESERVED\nDo not copy or remake. Made in Java.");
        System.out.println("http://Fredghostkyle.com/CP"); //Copyright
        System.out.println("\n \n");
        System.out.println("Welcome. We are creating a folder called CreateDoc in / (where the java was decompiled)."); //Said what we are going to do
        final File parentDir = new File("CreateDoc"); //Creation....
        parentDir.mkdir();
        final String hash = "txt";
        final String fileName = hash + ".txt";
        final File file = new File(parentDir, fileName);
        //i file.createNewFile(); 
        System.out.println("Done!"); //done!
  }
}
//NOTE:
// if you see a "/i" comment infrunt of a string it was me messing with it to fix something. 