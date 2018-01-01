package di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-13
 * @see
 * @since
 */
public class Main {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService=
                context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("di"));
context.close();
    }

}
