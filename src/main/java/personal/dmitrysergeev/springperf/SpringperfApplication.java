package personal.dmitrysergeev.springperf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.text.MessageFormat;

@SpringBootApplication
@RestController
public class SpringperfApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringperfApplication.class, args);
  }

  @GetMapping("/**")
  public String handleRequest(HttpServletRequest request) throws InterruptedException {
    Thread.sleep(200);
    return MessageFormat.format("'{' \"path\": \"{0}\" '}'", request.getRequestURI());
  }

}
