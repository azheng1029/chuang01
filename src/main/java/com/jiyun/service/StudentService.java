package com.jiyun.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiyun.mapper.StudentMapper;
import com.jiyun.pojo.StuVo;
import com.jiyun.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired(required = false)
    private StudentMapper studentMapper;
    public PageInfo<StuVo> showall(StuVo student, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<StuVo> showall = studentMapper.showall(student);
        PageInfo<StuVo> studentPageInfo = new PageInfo<StuVo>(showall);
        return studentPageInfo;
    }

    public Student showid(int sid) {
        Student student = new Student();
        student.setSid(sid);
        return  studentMapper.selectOne(student);
    }

    public void add(Student student) {
        studentMapper.insert(student);
    }

    public void update(Student student) {
        studentMapper.updateByPrimaryKeySelective(student);
    }

    public void delete(int sid) {
        studentMapper.deleteByPrimaryKey(sid);
    }
}
