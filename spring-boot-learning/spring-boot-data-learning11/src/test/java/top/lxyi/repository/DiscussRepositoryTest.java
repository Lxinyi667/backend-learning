package top.lxyi.repository;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import top.lxyi.domain.Discuss;

import java.util.List;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.startsWith;

@SpringBootTest
class DiscussRepositoryTest {
    @Resource
    private DiscussRepository discussRepository;

    @Test
    void findByAuthorNotNull() {
        List<Discuss> list = discussRepository.findByAuthorNotNull();
        list.forEach(System.out::println);
    }

    @Test
    void findByAuthorEquals() {
        List<Discuss> list = discussRepository.findByAuthorEquals("张三");
        list.forEach(System.out::println);
    }

    /**
     * 使用JpaRepository方法名关键字进行查询
     */
    @Test
    void findByAidEquals() {
        List<Discuss> list = discussRepository.findByAIdEquals(1);
        list.forEach(System.out::println);
    }

    @Test
    void getDiscussesByPage() {
        Pageable pageable = PageRequest.of(0, 2);
        List<Discuss> list = discussRepository.getDiscussesByPage(1, pageable);
        list.forEach(System.out::println);
    }

    @Test
    public void selectCommentByKeys() {
        List<Discuss> list = discussRepository.findByAIdEquals(1);
        list.forEach(System.out::println);
    }

    //3、使用@Query注解进行数据操作
    @Test
    public void selectCommentPaged() {
        Pageable pageable = PageRequest.of(0, 3);
        List<Discuss> allPaged = discussRepository.getDiscussPaged(1, pageable);
        System.out.println(allPaged);
    }

    //4、使用Example封装参数进行数据查询操作
    @Test
    public void selectCommentByExample() {
        Discuss discuss = new Discuss();
        discuss.setAuthor("张三");
        Example<Discuss> example = Example.of(discuss);
        List<Discuss> list = discussRepository.findAll(example);
        System.out.println(list);

    }

    @Test
    public void selectCommentByExampleMatcher() {
        Discuss discuss = new Discuss();
        discuss.setAuthor("张");
        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("author", startsWith());
        Example<Discuss> example = Example.of(discuss, matcher);
        List<Discuss> list = discussRepository.findAll(example);
        System.out.println(list);
    }


}
