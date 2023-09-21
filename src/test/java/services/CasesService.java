package services;

import dao.CasesDao;
import models.Cases;

import java.util.List;

public class CasesService {

    private CasesDao caseDao = new CasesDao();

    public CasesService() {
    }

    public Cases findCase(int id) {
        return caseDao.findById(id);
    }

    public void saveCase(Cases case1) {
        caseDao.save(case1);
    }

    public void deleteCase(Cases case1) {
        caseDao.delete(case1);
    }

    public void updateCase(Cases case1) {
        caseDao.update(case1);
    }

    public List<Cases> findAllCases() {
        return caseDao.findAll();
    }
}
