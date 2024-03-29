import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class DeleteBill {
    public static void Deletebill() {
        Gson gson =new Gson();
        try (Reader reader = new FileReader(HomeOwner.filepath)){
            Object billobj = gson.fromJson(reader,Object.class );
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
