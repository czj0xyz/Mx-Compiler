import utility.Error;
import utility.MxErrorListener;
import java.io.IOException;
import java.io.InputStream;

public class Compiler
{
    public static int main(String[] args) throws IOException
    {
        InputStream input_stream = System.in;
        CharStream charstream = CharStreams.fromStream(input_stream);
        throw new RuntimeException();
        return 0;
    }
}