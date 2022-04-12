/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacban.thaotactaptin.donglenh;

import java.io.File;
import javacban.thaotactaptin.logic.FileAndDirectoryOperations;

/**
 *
 * @author 7480
 */
public class testFileAndDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileAndDirectoryOperations fo = new FileAndDirectoryOperations();
//        File[] content = fo.getDirectoryContent("D:\\Class-Academic");
        //System.out.println(fo.displayContent(content));
//        File[] thumuc = fo.getSubDirectories(content);
//        System.out.println("Danh sach cac thu muc con: ");
//        System.out.println(fo.displayContent(thumuc));
//        
//        File[] taptin = fo.getFile(content);
//        System.out.println("Danh sach cac tap tin: ");
//        System.out.println(fo.displayContent(taptin));
        fo.getContentRecursively("D:\\Class-Academic");
        
    }
    
}
