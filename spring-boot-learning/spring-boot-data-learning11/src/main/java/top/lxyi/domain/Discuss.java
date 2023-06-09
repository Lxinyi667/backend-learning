package top.lxyi.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
//告诉JPA这是一个实体类（和数据表映射的类）
@Entity(name="t_comment")
public class Discuss {
    //这是一个主键
    @Id
    //自增主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String author;
    private String content;
    //这是和数据表对应的一个列
    @Column(name = "a_id")
    private Integer AId;
}
