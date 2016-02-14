package davidarques.ci.sample.app;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by darques on 14/02/16.
 */
@Component
public class Demo {

    @PostConstruct
    private void init(){
        System.out.println("*******************************************");

    }

}
