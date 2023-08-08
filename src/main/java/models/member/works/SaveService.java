package models.member.works;

import works.Work;

public class SaveService {
    private WorkDao workDao = new WorkDao();
    public SaveService(WorkDao workDao){
        this.workDao = workDao;
    }

    public void save(Work work){
        // work 데이터 검증(유효성 검사)
        workDao.save(work); // 의존
    }
}