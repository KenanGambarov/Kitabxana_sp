package com.kitabxana_sp.dao;

import com.kitabxana_sp.tables.Book;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public interface Main_Dao {

    List<Book> getbookList(HttpServletRequest paramHttpServletRequest);

    List<Book> getbookByAuthor();

    List<Book> getbookByTitle();
}
