/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi9_btvn;

import java.io.File;

public class FolderActions {

    public static void createFolder(String folderpath) {
        File folder = new File(folderpath);
        if(!folder.exists()){
            folder.mkdir();
            System.out.println("Folder created: "+folderpath);
        }
    }
        public static void renameFolder(String oldPath,String newPath){
        File oldFolder = new File(oldPath);
        File newFolder = new File(newPath);
        if(oldFolder.exists()){
            oldFolder.renameTo(newFolder);
            System.out.println("Folder rename complete to: "+ newPath);
        }
    }
    public static boolean checkFolderExists(String folderpath){
        File folder = new File(folderpath);
        return folder.exists();
    }
    public static void deleteFolder(String folderPath){
        File folder = new File(folderPath);
        if(folder.exists()){
            for(File file: folder.listFiles()){
                file.delete();
            }
            
            folder.delete();
            System.out.println("Folder deleted: "+folderPath);
        }
    }
    public static void main(String[] args) {
        String folderpath = "myfiles";
        createFolder(folderpath);
        System.out.println("folder exists = "+checkFolderExists(folderpath));
        String newFolderpath = "myfiles.txt";
        renameFolder(folderpath,newFolderpath);
        deleteFolder(newFolderpath);
    }

}
