package top.lxyi.boot.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;
@Component
@ConfigurationProperties(prefix = "person")
@Data
@Validated
public class Person {
    private Integer id;
    private String name;
    private List<String> hobby;
    private String[] family;
    private Map map;
    private Pet pet;

    private String email;
}
