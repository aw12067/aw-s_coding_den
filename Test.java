import java.util.*;
import java.io.*;
public class Test
{
  public static void main(String[] args)throws Exception
  {
    File file = new File("C:/Users/ashwinwalunj/Desktop/demo.txt");

    BufferedReader br = new BufferedReader(new FileReader(file));
    HashMap<String,Integer> store = new HashMap<String,Integer>();
    String st;
    String max = "";
    int max_cnt = 0;
    while ((st = br.readLine()) != null)
    {
      String data[] = st.split(" ");
      for(String i:data)
      {
        int cnt = 1;
        if(store.containsKey(i))
        {
          cnt = store.get(i);
          cnt++;
          store.put(i,cnt);
        }
        else
        {
          store.put(i,cnt);
        }
        if(cnt>max_cnt)
        {
          max_cnt = cnt;
          max = i;
        }
      }
    }
    System.out.println(max_cnt);
    System.out.println(max);
  }
}
