package com.byteluck.baitteda.office.common.model.configurations;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author wwp
 * @date 2022年03月29日 17:03
 */
@Component
@Getter
@Setter
public class Logo {
    @Value("${logo.image}")
    private String image;  // the path to the image file used to show in common work mode
    @Value("${logo.imageEmbedded}")
    private String imageEmbedded;  // the path to the image file used to show in the embedded mode
    @Value("${logo.url}")
    private String url;  // the absolute URL which will be used when someone clicks the logo image
}
