
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileHandler {

    public FileHandler(){}

    public String fileToString(String path){
        StringBuilder sb = new StringBuilder();
        try(Stream<String> fileStream = Files.lines(Paths.get(path))){
            fileStream.forEach(s -> sb.append(s).append("\n"));
        } catch (IOException e){
            e.printStackTrace();
        }

        return sb.toString();
    }

    public boolean stringToFile(String str, String path){
        try(PrintWriter save = new PrintWriter(path)){
            save.print(str);
            return true;
        } catch (FileNotFoundException e){
            e.printStackTrace();
            return false;
        }

    }
}
