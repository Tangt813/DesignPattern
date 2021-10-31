package DataAccessObject;

import org.junit.Test;

public class DataAccessObjectTest {
    @Test
    public void testDataAccessObject(){
        System.out.println("# 数据访问对象模式(Data Access Object Patten)用于把低级的数据访问API或操作从高级的业务服务中分离出来.以下是数据访问对象模式的构成:");
        System.out.println("# 1.数据访问对象接口:该接口定义了在一个模型对象上要执行的标准操作.");
        System.out.println("# 2.数据访问对象实体类:该类实现了上述的接口:该类负责从数据源获取数据,数据源可以任意存储机制.");
        System.out.println("# 3.模型对象/数值对象:该对象是简单的java对象,包含了get/set方法来存储通过使用DAO类检索到的数据.");
        System.out.println("# 在海底世界狂欢节中,我们需要存储每日日期与营业额状态，下面通过展示对该数据库的增删改查来应用DAO模式\n");
        RecordDAO recordDAO = new RecordDAOImpl();
        System.out.println("下面储存进账记录:");
        Record record1 = new Record(2000,"2021-10-21",1);
        recordDAO.insertRecord(record1);
        Record record2 = new Record(2030,"2021-10-22",2);
        recordDAO.insertRecord(record2);
        Record record3 = new Record(2180,"2021-10-23",3);
        recordDAO.insertRecord(record3);

        System.out.println("\n下面输出所有进账记录:");
        for(Record record:recordDAO.getAllRecords()){
            System.out.println("Record output: date:"+record.getDate()+" income:"+record.getIncome());
        }
        System.out.println("\n下面更新进账记录:");
        record1.setIncome(3000);
        recordDAO.updateRecord(record1);

        System.out.println("\n下面删除进账记录:");
        recordDAO.deleteRecord(record3);

    }
}
