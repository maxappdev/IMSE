import com.example.demo.User;
import org.hibernate.*;
import org.hibernate.query.Query;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

public class Main {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        Transaction t=session.beginTransaction();
        User e1=new User ();
        e1.setUser_firstname("First");
        e1.setUser_lastname("sonoo");
        e1.setIs_active(true);
        e1.setUser_email("sonoof@gmail.com");
        e1.setUsername("sono");
        session.persist(e1);//persisting the object
        t.commit();//transaction is commited
        session.close();
        System.out.println("successfully saved");


    }
}