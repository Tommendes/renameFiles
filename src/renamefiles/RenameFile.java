/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renamefiles;

import java.io.File;

/**
 *
 * @author TomMe
 */
public class RenameFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File folder = new File("C:\\Windows\\MGFolha\\imagens");
        File[] listOfFiles = folder.listFiles();
        for (File listOfFile : listOfFiles) {
//            String name = listOfFile.getName().substring(0,8) + '.' + listOfFile.getName().substring(21);
//            System.out.println(name);;
            if (listOfFile.isFile()) {
                if (listOfFile.getName().length() >= 20) {
                    File f = new File("C:\\Windows\\MGFolha\\imagens\\" + listOfFile.getName());
                    f.renameTo(new File("C:\\Windows\\MGFolha\\imagens\\" + listOfFile.getName().substring(0, 8) + listOfFile.getName().substring(21)));
                }
            }
        }
        System.out.println("conversion is done");
    }

}
