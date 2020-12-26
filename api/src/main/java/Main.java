import com.example.demo.Product;
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
    /*
    @Test
public void givenSubclasses_whenQuerySuperclass_thenOk() {
    Book book = new Book(1, "1984", "George Orwell");
    session.save(book);
    Pen pen = new Pen(2, "my pen", "blue");
    session.save(pen);

    assertThat(session.createQuery("from MyProduct")
      .getResultList()).hasSize(2);
}*/


    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        Transaction t=session.beginTransaction();
        User e1=new User ();
        e1.set_firstname("First");
        e1.set_lastname("sonoo");
        e1.set_is_active(true);
        e1.set_email("sonoof@gmail.com");
        e1.set_username("sono");
        session.persist(e1);//persisting the object
        t.commit();//transaction is commited
        Transaction t1=session.beginTransaction();
        Product p1=new Product ();
        p1.set_description("First product");
        p1.set_name("Bag");
        p1.set_availability(false);
        session.persist(p1);
        t.commit();
        session.close();
        System.out.println("successfully saved");


    }
}