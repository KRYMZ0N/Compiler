import keyword.Keyman;
import keyword.Keyword;
import util.ArgumentUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {

    public static void ReadF() {
        Keyman keys = new Keyman();
        try {
            File file = new File(Main.FileName);

            if (!getFileExtension(file).equals("comp")) return;


            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                String[] args = ArgumentUtil.parseStringCom(data);

                for (Keyword k : keys.list)  {
                    if (k.getName().equals(args[0])) {
                        k.setValue(args[1]);
                        k.onEnable();
                        break;
                    }
                }
            }
            myReader.close();
        } catch (
                FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static String getFileExtension(File f) {

        String fileName = f.toString();
        int index = fileName.lastIndexOf('.');
        if(index > 0) {
            String extension = fileName.substring(index + 1);

            return extension;
        }

        return "a";
    }

}
