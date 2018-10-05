package numPractice;
import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.*;

/**
 * Created by ashah on 8/26/18.
 */
public class Stringsomething {

    public static long[] solution(String url) {
        String fileName = "~/sampleLog.txt";
        long[] output=new long[]{0,0};
        try{
            downloadUsingStream(url,fileName);
            output = getNumberOfEvents(fileName);
        }
        catch(IOException e){
            e.printStackTrace();
        }



        return new long[] {output[0],output[1],0,0};
    }

    private static long[] getNumberOfEvents(String fileName) throws IOException,FileNotFoundException{
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int numberOfEvents=0;
        int numberOfErrorLine=0;
        int numberOfActions=0;
        String line;
        List<String> postEvents = new ArrayList<String>();
        while((line = reader.readLine()) != null){
            numberOfEvents++;
            if(line.startsWith("[E")){
                numberOfErrorLine++;
            }else if(line.startsWith("[I") && line.contains("POST")){
                postEvents.add(line);
            }
        }
        reader.close();
        Set<String> uniqueAddresses = new HashSet<String>();
        for(String postEvent : postEvents){
            String[] splitStrings = postEvent.split(" ");
            List<String> stringsList = new ArrayList<String>(Arrays.asList(splitStrings));
            for(String st: stringsList){
                if(st.startsWith("a:")){
                    int action = new Integer(st.split(":")[1]);
                    numberOfActions+=action;
                }
            }

            uniqueAddresses.add(splitStrings[7]);
        }
        return new long[] {numberOfEvents,numberOfErrorLine,numberOfActions,uniqueAddresses.size()};
    }
    private static void downloadUsingStream(String urlStr, String file) throws IOException{
        File file1 = new File(file);
        file1.getParentFile().mkdirs();
        file1.createNewFile();
        URL url = new URL(urlStr);
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        FileOutputStream fis = new FileOutputStream(file);
        byte[] buffer = new byte[1024];
        int count=0;
        while((count = bis.read(buffer,0,1024)) != -1)
        {
            fis.write(buffer, 0, count);
        }
        fis.close();
        bis.close();
    }
    public static void main(String[] args){

        String fileName = "~/sampleLog.txt";
        long[] output= new long[]{0,0,0,0};
        try{
            downloadUsingStream("https://gist.githubusercontent.com/antonio-osorio/9b492017b672e8e354d9187ac1f6d487/raw/23fb1b9dc234c6cd73ff16888c440fd36e316a8f/TestCase1.txt",fileName);
            output = getNumberOfEvents(fileName);
            System.out.print (output[0]+" "+ output[1] +" "+ output[2] +" "+ output[3]);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
