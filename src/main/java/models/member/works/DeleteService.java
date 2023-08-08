package models.member.works;

public class DeleteService {
    private WorkDao  workDao = new WorkDao();
    public void delete(long workNo){
        boolean result = workDao.delete(workNo);
    }
}
