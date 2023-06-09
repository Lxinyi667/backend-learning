package top.lxyi.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import top.lxyi.domain.Discuss;

import java.util.List;

//编写仓库接口
public interface DiscussRepository extends JpaRepository<Discuss,Integer> {
    List<Discuss> findByAuthorNotNull();
    List<Discuss> findByAuthorEquals(String author);
    //1.查询author非空的Discuss评论集合
    List<Discuss> findByAIdEquals(Integer aId);
    //2.根据文章id分页查询Discuss 评论集合
    @Query("SELECT c FROM  t_comment c WHERE c.AId=?1")
    List<Discuss> getDiscussesByPage(Integer aId, Pageable pageable);
    //3.使用原生SQL语句，根据文章id分页查询 Discuss 评论集合
    @Query(value = "SELECT * FROM  t_comment WHERE a_id=?1" ,nativeQuery = true)
    List<Discuss> getDiscussPaged(Integer aId,Pageable pageable);
    //4、根据评论id修改评论作者author
    @Transactional
    @Modifying
    @Query("UPDATE t_comment c SET c.author = ?1 WHERE c.id= ?2 ")
    int updateDiscuss(String author,Integer id);
    //5、根据评论id 删除评论
    @Transactional
    @Modifying
    @Query("DELETE t_comment c  WHERE c.id= ?1 ")
    int deleteDiscuss(Integer id);
}
