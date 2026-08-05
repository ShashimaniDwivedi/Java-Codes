import java.io.File;

public class Launch1 {                      //ducking
    public static void main(String[] args) /*throws IOException*/ {
        File file1 = new File("pw.txt");//if file exist then it refer to that file (It NOT make NEW File) otherwise it  object refer to java file object
        System.out.println(file1.exists());
        // handling Exception
        try {
            file1.createNewFile();
        } catch (Exception e) {
            System.out.println("Some error");
        }
        //to create file
        System.out.println(file1.exists());
        //to check directory exist or not
        File dir = new File("Pw");
        System.out.println(dir.isDirectory());//also you can use isdirectory
        //creating directory
        dir.mkdir();
        System.out.println(dir.isDirectory());
        //it only check file inside directory
        File file = new File(dir, "writting.java");
        //creating file inside directory
        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("Some error");
        }
        //file.createNewFile();
        System.out.println(file.exists());
        //practice making directory
        File file2 = new File("pw1");
        file2.mkdir();
        File file3 = new File(file2, "pw3");
        try {
            file3.createNewFile();
        } catch (Exception e) {
            System.out.println("Some error" + e);
        }
        File file4 = new File(file2, "pw4");
        try {
            file4.createNewFile();
        } catch (Exception e) {
            System.out.println("Some error" + e);
        }
        //to print no of file in directory
        int count =0;
        File f=new File("C:\\Users\\Manas\\IdeaProjects\\FileHandling.java\\src");
        String []str=f.list();
        for (String name:str)
        {
        count++;
        System.out.println(name);
        }
        //to count no of file in directory
        System.out.println(count);
    }
}
