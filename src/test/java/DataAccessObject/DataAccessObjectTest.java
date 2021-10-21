package DataAccessObject;

import org.junit.Test;

public class DataAccessObjectTest {
    @Test
    public void testDataAccessObject(){
        RecordDAO recordDAO = new RecordDAOImpl();
        System.out.println("输入进账记录:");
        Record record1 = new Record(2000,"2021-10-21",1);
        recordDAO.insertRecord(record1);
        Record record2 = new Record(2030,"2021-10-22",2);
        recordDAO.insertRecord(record2);
        Record record3 = new Record(2180,"2021-10-23",3);
        recordDAO.insertRecord(record3);

        System.out.println("\n输出所有进账记录:");
        for(Record record:recordDAO.getAllRecords()){
            System.out.println("Record output: date"+record.getDate()+" income:"+record.getIncome());
        }
        System.out.println("\n更新进账记录:");
        record1.setIncome(3000);
        recordDAO.updateRecord(record1);

        System.out.println("\n删除进账记录:");
        recordDAO.deleteRecord(record3);

    }
}
