package in.deepak.Service.serviceImpl;

import in.deepak.Entity_Repository.Entity.StudentEntity;
import in.deepak.FormBinding.studentFilterEnquiryFormBinding;
import in.deepak.FormBinding.studentFormBinding;
import in.deepak.Service.serviceInterface.StudentInterface;

import java.util.List;

public class StudentService implements StudentInterface {

    @Override
    public List<String> getCourse() {
        return List.of();
    }

    @Override
    public List<String> getStatus() {
        return List.of();
    }

    @Override
    public Integer dashBoardData(Integer id) {
        return 0;
    }

    @Override
    public boolean saveEnquiry(studentFormBinding studentForm) {
        return false;
    }

    @Override
    public List<StudentEntity> viewEnquiry(studentFilterEnquiryFormBinding filterEnquiry) {
        return List.of();
    }
}
