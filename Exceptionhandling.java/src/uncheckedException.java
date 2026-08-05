import java.io.BufferedReader;
import java.io.InputStreamReader;

//Unchecked and checked Exception

public class uncheckedException {
    public static void main(String[] args)
    {
        int result = 7 / 0;
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String str = Br.readLine();
        }
        catch (Exception e)
        {
            System.out.println("Error" + e);
        }
    }
}
