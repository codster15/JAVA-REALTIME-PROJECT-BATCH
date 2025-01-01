package in.deepak.Service.serviceInterface;

import in.deepak.Entity_Repository.Entity.StudentEntity;
import in.deepak.FormBinding.studentFilterEnquiryFormBinding;
import in.deepak.FormBinding.studentFormBinding;

import java.util.List;

public interface StudentInterface {

    public List<String> getCourse();

    public List<String> getStatus();

    // passed user id bcoz dashboard will be different person to person
    public Integer dashBoardData(Integer id);

    public boolean saveUpdateEnquiry(studentFormBinding studentForm);

    public List<StudentEntity> viewEnquires( Integer id, studentFilterEnquiryFormBinding filterEnquiry);


    //this method will perform the edit functionality
    public  studentFormBinding viewEnquiryEditable(Integer id);


}
