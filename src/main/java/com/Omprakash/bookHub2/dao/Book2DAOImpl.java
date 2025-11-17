/* Author: Omprakash */
package com.Omprakash.bookHub2.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Omprakash.bookHub2.entity.Book2;

@Repository
@Transactional
public class Book2DAOImpl implements Book2DAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addBook(Book2 book) {
        sessionFactory.getCurrentSession().save(book);
    }

    @Override
    public List<Book2> getAllBooks() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Book2", Book2.class)
                .getResultList();
    }
}
