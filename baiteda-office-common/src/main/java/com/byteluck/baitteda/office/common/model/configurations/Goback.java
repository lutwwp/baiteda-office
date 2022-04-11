package com.byteluck.baitteda.office.common.model.configurations;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author wwp
 * @date 2022年03月29日 17:15
 */
@Component
@Getter
@Setter
public class Goback {

    @Value("${url.index}")
    private String indexMapping;
    private String url;  // the absolute URL to the website address which will be opened when clicking the Open file location menu button

    @PostConstruct
    private void init() {
        this.url = indexMapping;
    }
}
