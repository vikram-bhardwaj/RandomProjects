import java.io.File;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class MakingADir {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of the project folder : ");
        String proj_name = s.nextLine();
        System.out.println("Enter the sub-folder name : ");
        String subFolder = s.nextLine();
        String path = proj_name + File.separator + subFolder;
        File f = new File("c:\\"+path+"\\");
         if (!f.exists()) {
            if (f.mkdirs()) {
               System.out.println("Directory is created!");
            } else {
                System.out.println("Failed to create directory!");
            }
        }  
    }
}