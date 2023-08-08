package models.member.works;

import works.Work;

public class InfoService {
    private WorkDao workDao = new WorkDao();
    public Work get(long workNo){
        Work work = workDao.get(workNo);
        return work;
    }
}
