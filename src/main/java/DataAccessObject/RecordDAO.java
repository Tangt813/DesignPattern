package DataAccessObject;

import java.util.List;

public interface RecordDAO {
    List<Record> getAllRecords();
    Record getRecord(int recordNo);
    void updateRecord(Record record);
    void deleteRecord(Record record);
    void insertRecord(Record record);
}
