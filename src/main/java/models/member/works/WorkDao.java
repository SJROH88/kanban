package models.member.works;

import configs.DBConnection;
import org.apache.ibatis.session.SqlSession;
import works.Work;
import works.WorksController;

import java.util.List;

public class WorkDao {
    public boolean save(Work work){
        SqlSession sqlSession = DBConnection.getSession();
        long workNo = work.getWorkNo();
        int affectedRows = 0;
        if(workNo > 0L){
            affectedRows = sqlSession.update("WorkListMapper.edit",work);
        }else{
            affectedRows = sqlSession.insert("WorkListMapper.add",work);
        }
        sqlSession.commit();
        return affectedRows > 0;
    }
    public boolean delete(long workNo){
        SqlSession sqlSession = DBConnection.getSession();
        Work params = new Work();
        params.setWorkNo(workNo);
        int affectedRows = sqlSession.delete("WorkListMapper.delete",params);
        return false;
    }
    public Work get(long workNo){
        Work params = new Work();
        params.setWorkNo(workNo);

        SqlSession sqlSession = DBConnection.getSession();
        Work work = sqlSession.selectOne("WorkListMapper.each",params);
        return work;
    }
    public List<Work> gets(Work work){
        SqlSession sqlSession = DBConnection.getSession();

        List<Work> items = sqlSession.selectList("WorkListMapper.list",work);
        return items;
    }
}
