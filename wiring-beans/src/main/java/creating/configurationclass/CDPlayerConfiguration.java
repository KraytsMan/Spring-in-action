package creating.configurationclass;


import creating.discoverable.beans.CompactDisc;
import creating.discoverable.beans.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfiguration {

    @Bean
    public CompactDisc sgtPeppers()
    {
        return new SgtPeppers();
    }
}
