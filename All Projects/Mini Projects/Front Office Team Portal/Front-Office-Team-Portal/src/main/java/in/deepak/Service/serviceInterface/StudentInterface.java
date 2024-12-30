package in.deepak.Service.serviceInterface;

import in.deepak.Entity_Repository.Entity.StudentEntity;
import in.deepak.FormBinding.studentFilterEnquiryFormBinding;
import in.deepak.FormBinding.studentFormBinding;

import java.util.List;

public interface StudentInterface {

    public List<String> getCourse();

    public List<String> getStatus();

    public Integer dashBoardData(Integer id);

    public boolean saveEnquiry(studentFormBinding studentForm);

    public List<StudentEntity> viewEnquiry(studentFilterEnquiryFormBinding filterEnquiry);


 }
