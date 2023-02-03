
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class Main {
    public Main() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
    /*    File f1=new File("text.text");
        System.out.println(
                f1.exists()
        );
        File f2=new File(".files");
       // File f2=new File("./out/files");
     boolean res=  f2.mkdir();
      //  System.out.println(res);
        System.out.println(f1.length());
        System.out.println(f2.length());
        File f3=new File("./files/tt1");
        boolean res1=  f3.createNewFile();
   //    System.out.println(res1);
        System.out.println(
            Arrays.toString((new File("./")).list()));
        System.out.println(
                f3.isFile()
        );
        System.out.println(
                f3.isDirectory()
        );*/
        //Создайте файл используя new File() в каталоге Desctop, убедитесь, что файл существует, удалите файл.
        //   File newf=new File("./files/ttnew");
        //  File newf=new File("C:\Users\annao\Desctop\new.txt");
        //  File newf=new File("C:/Users/annao/Desctop/new.txt");

        //     boolean resnew=  newf.createNewFile();
        //   System.out.println(resnew);
        //     System.out.println(
        //             newf.isFile()
        //     );
        //   newf.delete();
        //     System.out.println(
        //            newf.isFile()
        //      );
        // Создайте метод для удаления директории и суб-директорий
        //  listFiles
        //         Delete
        //  isDirector
 /*       FileReader fr = null;
        try {
            fr = new FileReader("text.t");
            BufferedReader bf = new BufferedReader(fr);
        } catch (FileNotFoundException e) {
            System.out.println("file not found" + e.getMessage());
        } finally {
            try {
                if (fr != null)
                    fr.close();
                System.out.println("file wath close");
            } catch (IOException io) {
                System.out.println(io.getMessage());
            }
        }*/
      /*  try(BufferedReader bf=new BufferedReader(
                new FileReader("text.t"))) {

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }*/

   /*     try (FileInputStream fileInputStream = new FileInputStream("text.text")) {
            System.out.println(fileInputStream.available());
            fileInputStream.read();
            System.out.println(fileInputStream.available());
            fileInputStream.skip(3);
            System.out.println(fileInputStream.available());
            int i = fileInputStream.read();
            System.out.println(i);
            FileChannel fk = fileInputStream.getChannel();
            FileDescriptor ds = fileInputStream.getFD();

        } catch (IOException e) {
            System.out.println();
        }

          // home
        //  1. Создайте файл, используя FileOutputStream, с текстом: "This is my first //experience when I myself work with IO API. I can do everything!"*/
        StringBuilder sb = new StringBuilder();
        sb.append("This is my first experience when I myself work with IO API. I can do everything!");
        FileOutputStream fileOutputStream = new FileOutputStream("./files/fileHome.txt");
        fileOutputStream.write(sb.toString().getBytes());
        fileOutputStream.close();

    }

    public static void delDir(File file) throws IOException {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                delDir(f);
            }
            boolean res = f.delete();
        }
        boolean res = file.delete();

 /*   Arrays.stream( dir.listFiles()).forEach(
            f -> {if (f.isDirectory())  deleteDir( f); else f.delete();}
        );
        dir.delete();*/
        // home
// Создайте файл, используя FileOutputStream, с текстом: "This is my first experience when I myself work with IO API. I can do everything!"
    }
}
