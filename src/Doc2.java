import java.io.*;
public class Doc2
{
    public static void main (String[] args) throws IOException {
        String file;
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для окончания записи введите 'Stop' ");
        try (FileWriter w= new FileWriter("doc22.txt"))
        {
           do {
               System.out.println("Вводите текст, который нужно записать: ");
               file=f.readLine();
               if (file.compareTo("Stop")==0) break;
               file=file+"\r\n";
               w.write(file);
           } while (file.compareTo("Stop") !=0);

        } catch (IOException exc ){
            System.out.println("Ошибка ввода-вывода данных " + exc);
        }


    }
}
