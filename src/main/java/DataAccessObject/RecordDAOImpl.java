package DataAccessObject;

import java.util.ArrayList;
import java.util.List;

public class RecordDAOImpl implements RecordDAO{
    List<Record> records;

    public RecordDAOImpl(){
        records = new ArrayList<Record>();
        Record record1 = new Record(3000,"2021-10-18",1);
        records.add(record1);
        Record record2 = new Record(2400,"2021-10-19",1);
        records.add(record2);
        Record record3 = new Record(1900,"2021-10-20",1);
        records.add(record3);

    }

    @Override
    public void deleteRecord(Record record){
        records.remove(record.getDate());
        System.out.println("Record delete: date"+record.getDate()+" income:"+record.getIncome()+" has been deleted");
    }

    @Override
    public List<Record> getAllRecords(){
        return records;
    }

    @Override
    public Record getRecord(int recordNo){
        return records.get(recordNo);
    }

    @Override
    public void updateRecord(Record record){
        records.get(record.getRecordNo()).setDate(record.getDate());
        records.get(record.getRecordNo()).setIncome(record.getIncome());
        System.out.println("Record update: date"+record.getDate()+" income:"+record.getIncome()+" has been updated");
    }

    @Override
    public void insertRecord(Record record){
        record.setRecordNo(records.size());
        records.add(record);
        System.out.println("Record insert: date"+record.getDate()+" income:"+record.getIncome()+" has been inserted");
    }
}
