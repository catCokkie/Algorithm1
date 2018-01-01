package di;

import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author Administrator
 * @date 2018-1-1
 */
@Service //1
public class FunctionService {
    public String sayHello(String word){
        return "Hello"+word+"!";
    }
}
