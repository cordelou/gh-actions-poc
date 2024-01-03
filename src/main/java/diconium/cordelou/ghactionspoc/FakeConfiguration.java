package diconium.cordelou.ghactionspoc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FakeConfiguration {

  @Value("${foo.bar.prop}")
  private String fakeProperty;

  @Value("${foo.bar.other.prop}")
  private String otherFakeProperty;

  @Bean
  public String fakeBean() {
    System.out.println(fakeProperty);
    return fakeProperty;
  }

  @Bean
  public String otherFakeBean() {
    System.out.println(otherFakeProperty);
    return otherFakeProperty;
  }

}
