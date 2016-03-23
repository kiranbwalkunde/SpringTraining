package springsdemo;

import creators.ProductCreator;
import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.SpelEvaluationException;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import pojos.Battery;
import pojos.Disc;
import pojos.Product;
/**
 * Generator Sample Spring Test.
 *
 * @author kiran
 */
public class SpringsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    }
}
