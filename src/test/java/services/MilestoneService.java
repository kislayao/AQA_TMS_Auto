package services;

import dao.MilestoneDao;
import models.Milestone;

import java.util.List;

public class MilestoneService {
    private MilestoneDao milestoneDao = new MilestoneDao();

    public MilestoneService() {
    }

    public Milestone findMilestone(int id) {
        return milestoneDao.findById(id);
    }

    public void saveMilestone(Milestone milestone) {
        milestoneDao.save(milestone);
    }

    public void deleteMilestone(Milestone milestone) {
        milestoneDao.delete(milestone);
    }

    public void updateMilestone(Milestone milestone) {
        milestoneDao.update(milestone);
    }

    public List<Milestone> findAllMilestones() {
        return milestoneDao.findAll();
    }
}
