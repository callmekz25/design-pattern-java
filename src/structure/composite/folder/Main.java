package structure.composite.folder;

public class Main {
    public static void main(String[] args) {
        FolderOrFile folderA = new Folder("study");
        FolderOrFile fileA = new File("code.java");
        FolderOrFile fileB = new File("word.docx");
        FolderOrFile folderB = new Folder("java");
        FolderOrFile folderC = new Folder("flutter");
        FolderOrFile fileC = new File("test.py");
        FolderOrFile fileD = new File("abcd.pdf");
        folderA.addItem(fileA);
        folderA.addItem(fileB);
        folderB.addItem(fileB);
        folderB.addItem(folderC);
        folderB.addItem(fileC);
        folderC.addItem(fileD);
        System.out.println(folderA.getStringTreeFolder());
        System.out.println(folderB.getStringTreeFolder());

    }
}
