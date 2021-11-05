package AdministratorSubsystem;

import DataAccessObject.Record;
import DataAccessObject.RecordDAOImpl;
import DataAccessObject.RecordDAO;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HandleDatabase {

    public List<Turnover> getDataRequest(){
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = "http://localhost:8080/api/Turnover";
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求数据出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        List<Turnover> list = JSONObject.parseArray(result,Turnover.class);
        return list;
    }

    public void insertData(String date,Double data){
        try {
            String urlNameString = "http://localhost:8080/api/Turnover/insert/"+date+"/"+data;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            connection.getInputStream();
            System.out.println(urlNameString);
        } catch (Exception e) {
            System.out.println("发送GET请求插入数据出现异常！" + e);
            e.printStackTrace();
        }
    }

    public void searchInfo() {
        System.out.println("yes");
        RecordDAO recordDAO = new RecordDAOImpl();
        Scanner scanner = new Scanner(System.in);
        List<Turnover> list=getDataRequest();
        System.out.println("1.查看所有进账记录\n2.将今日进账记录存储至数据库中\n3.按Q/q退出");
        while (true) {
            String command = scanner.nextLine();
            if(command.equals("1")) {
                System.out.println("———————————————————————");
                System.out.println("|    Date    | Income |");
                System.out.println("———————————————————————");
//                for(Record record:recordDAO.getAllRecords()){
//                    System.out.println("| "+record.getDate()+" |  "+record.getIncome()+"  |");
//                }
                for(int i=0;i<list.size();i++){
                    String date= list.get(i).getDate();
                    double income=list.get(i).getData();
                    System.out.println("  "+date+"| "+" "+income+"|\n");
                }

                System.out.println("———————————————————————");
            }
            if(command.equals("2")){
                Record record = new Record(3050,"2021-11-6",1);
                System.out.println("今日营业信息:date:"+record.getDate()+",income:"+record.getIncome());
                System.out.println("插入数据库中...");
                list.add(new Turnover("2021-11-06",3050));
                System.out.println("所有历史记录:\n———————————————————————");
                System.out.println("|    Date    | Income |");
                System.out.println("———————————————————————");
//                for(Record r:recordDAO.getAllRecords()){
//                    System.out.println("| "+r.getDate()+" |  "+r.getIncome()+"  |");
//                }
                for(int i=0;i<list.size();i++){
                    String date= list.get(i).getDate();
                    double income=list.get(i).getData();
                    System.out.println("  "+date+"| "+" "+income+"|\n");
                }
                System.out.println("———————————————————————");
            }
            if(command.equals("q")|| command.equals("Q")) {
                break;
            }
        }
    }

}
