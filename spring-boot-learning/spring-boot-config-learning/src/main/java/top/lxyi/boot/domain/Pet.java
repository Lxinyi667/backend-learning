package top.lxyi.boot.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "person.pet")
@Data
public class Pet {
    private String type;
    private String name;
}
