package structure.composite.folder;

public class File extends FolderOrFile {

    public File(String name) {
        super(name);
    }



    @Override
    public String getStringTreeFolder() {
        return name;
    }

    @Override
    public FolderOrFile addItem(FolderOrFile fof) {
        return this;
    }

    @Override
    public FolderOrFile removeItem(FolderOrFile fof) {
        return this;
    }
}
