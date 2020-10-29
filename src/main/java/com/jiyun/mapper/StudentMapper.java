package com.jiyun.mapper;

import com.jiyun.pojo.StuVo;
import com.jiyun.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
     public List<StuVo> showall(StuVo student);


 /*   @Insert("insert into(sxh,sname,ssex,sbir) student(#{sxh},#{sname},#{ssex},#{sbir})")
     public void add(Student student);*/
    /*
     @Update("update student set sxh=#{sxh},sname=#{sname},ssex=#{ssex},sbir=#{sbir} where sid=#{sid}")
     public void update(Student student);
     @Select("select * from student where sid=#{sid}")
     public void showid(int sid);
     @Delete("delete from student where sid=#{sid}")
     public void delete(int sid);*/
}
