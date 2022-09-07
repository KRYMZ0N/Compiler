import util.ArgumentUtil;

import java.util.Scanner;

public class ComLoop {

    public static void loop() {
        boolean loop = true;

        while (loop) {
            Scanner scan = new Scanner(System.in);
            String text = scan.nextLine();
            String[] args = ArgumentUtil.parseStringCom(text);

            if (args.length < 2) return;

            if (args[0].equals("compile")) { //Taking the second argument and setting it as the filename
                System.out.println("Sset file");
                Main.FileName = args[1];

                Read.ReadF();

            }
        }
    }
}
