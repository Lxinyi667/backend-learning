package top.lxyi.mapper;

import org.apache.ibatis.annotations.*;
import top.lxyi.domain.Student;

import java.util.List;

public interface StudentMapper {
    /**
     * 对单表进行增删改查
     */

    //根据主键查询学生信息
    @Select("SELECT * FROM t_student WHERE student_id=#{studentId}")
    Student findById(int studentId);
    //新增学生
    @Insert("INSERT INTO t_student(clazz_id,student_name,hometown,birthday) VALUES (#{clazzId},#{studentName},#{hometown},#{birthday}) " )
    int insert(Student student);
    //修改学生信息
    @Update("UPDATE t_student SET clazz_id=#{clazzId},student_name=#{studentName},hometown=#{hometown},birthday=#{birthday} WHERE student_id=#{studentId} ")
    int update(Student student);
    @Delete("DELETE  FROM t_student WHERE student_id=#{studentId}")
    int deleteById(int studentId);
    /**
     * 根据学生Id查询学生信息，多对一查询学生所属班级的信息
     * @param studentId
     * @return
     */
    Student getStudent(int studentId);

    /**
     * 批量新增学生
     * @param students
     * @return
     */
    int batchInert(@Param("students") List<Student> students);

    /**
     * 批量修改学生信息
     * @param students 学生集合
     * @return 受影响的记录行数
     */
    int batchUpdate(@Param("students")List<Student> students);

    /**
     * 批量删除学生
     * @param idList 待删除的学生的学生id结合
     * @return 受影响的记录行数
     */
    int batchDelete(@Param("idList") List<Integer> idList);

    /**
     * 动态SQL查询
     * @param student 查询对象
     * @return 查询到的学生集合
     */
    List<Student> dynamicSelect(Student student);
}
