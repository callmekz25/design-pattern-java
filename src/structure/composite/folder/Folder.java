package structure.composite.folder;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FolderOrFile {
    List<FolderOrFile> listFolderFiles;

    public Folder(String name) {
        super(name);
        this.listFolderFiles = new ArrayList<>();
    }
    @Override
    public FolderOrFile addItem(FolderOrFile fof) {
        if(!listFolderFiles.contains(fof)) {
            listFolderFiles.add(fof);
            fof.path = this.path + "\\" + fof.path;
            return  this;
        }
        return this;
    }
    @Override
    public FolderOrFile removeItem(FolderOrFile fof) {
        if(listFolderFiles.contains(fof)) {
            listFolderFiles.remove(fof);
            fof.path = this.path + "\\" + fof.path;
        }
        return null;
    }


    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.name);
        for (int i = 0; i < listFolderFiles.size(); i++) {
            builder.append("\n");
            builder.append("\t");
            if(listFolderFiles.get(i + 1).getClass().equals(Folder.class)){
                builder.append("\t");
            }
            builder.append(listFolderFiles.get(i).getStringTreeFolder());

        }
//        for (var item: listFolderFiles) {
//            builder.append("\n");
//            builder.append("\t");
//
//            builder.append(item.getStringTreeFolder());
//        }
        return builder.toString();
    }



}
