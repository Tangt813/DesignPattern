package AdministratorSubsystem;

import DataAccessObject.Record;
import DataAccessObject.RecordDAOImpl;
import DataAccessObject.RecordDAO;
import org.junit.Test;

import java.util.Scanner;

public class HandleDatabase {
    @Test
    public void searchInfo() {
        RecordDAO recordDAO = new RecordDAOImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.查看所有进账记录\n2.将今日进账记录存储至数据库中\n3.按Q/q退出");
        while (true) {
//            String command = scanner.nextLine();
            String command = "1";
            if(command.equals("1")){
                System.out.println("———————————————————————");
                System.out.println("|    Date    | Income |");
                System.out.println("———————————————————————");
                for(Record record:recordDAO.getAllRecords()){
                    System.out.println("| "+record.getDate()+" |  "+record.getIncome()+"  |");
                }
                System.out.println("———————————————————————");
            }
            command = "2";
            if(command.equals("2")){
                Record record = new Record(3050,"2021-10-21",1);
                System.out.println("今日营业信息:date:"+record.getDate()+",income:"+record.getIncome());
                System.out.println("所有历史记录:\n———————————————————————");
                System.out.println("|    Date    | Income |");
                System.out.println("———————————————————————");
                for(Record r:recordDAO.getAllRecords()){
                    System.out.println("| "+r.getDate()+" |  "+r.getIncome()+"  |");
                }
                System.out.println("———————————————————————");
            }
            command = "q";
            if(command.equals("q")|| command.equals("Q")) {
                break;
            }
        }
    }

}
