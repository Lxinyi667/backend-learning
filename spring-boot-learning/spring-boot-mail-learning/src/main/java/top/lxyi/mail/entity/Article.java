package top.lxyi.mail.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {
    private Integer id;
    private String title;

    @JsonFormat(pattern = "yyyy-HH-dd HH:mm:ss", timezone = "GMT-8")
    private Date createTime;
}
