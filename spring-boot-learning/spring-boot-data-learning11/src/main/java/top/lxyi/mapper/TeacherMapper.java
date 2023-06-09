package top.lxyi.mapper;

import top.lxyi.domain.Teacher;

public interface TeacherMapper {
/**
 * 一对一查询
 * 根据老师ID查询老师
  */

    Teacher selectOneByOne(int teacherId);

}
