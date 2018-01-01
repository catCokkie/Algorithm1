package scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-13
 * @see
 * @since
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
