/* Author:Omprakash
 */
package com.Omprakash
.bookHub2.dao;

import java.util.List;
import com.Omprakash
.bookHub2.entity.Book2;

public interface Book2DAO {
    void addBook(Book2 book);
    List<Book2> getAllBooks();
}
