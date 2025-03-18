package structure.composite.folder;

public abstract class FolderOrFile {
    String name;
    String path;

    public FolderOrFile(String name) {
        this.name = name;
        this.path = name;
    }

    public String getPath() {
        return this.path;
    };
    public abstract String getStringTreeFolder();
    public abstract FolderOrFile addItem(FolderOrFile fof);
    public abstract FolderOrFile removeItem(FolderOrFile fof);

}
