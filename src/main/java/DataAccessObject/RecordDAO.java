package DataAccessObject;

import java.util.List;

//接口类
public interface RecordDAO {
    //获取所有记录
    List<Record> getAllRecords();

    //获取特定记录
    Record getRecord(int recordNo);

    //更新一条记录
    void updateRecord(Record record);

    //删除一条记录
    void deleteRecord(Record record);

    //插入一条记录
    void insertRecord(Record record);
}
