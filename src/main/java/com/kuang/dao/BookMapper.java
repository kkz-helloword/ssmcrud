package com.kuang.dao;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;
import java.util.List;
public interface BookMapper {
    int addBook(Books books);//javabean实体类传参不用注解

    int deleteBookById(@Param("bookId") int id);

    int updateBook(Books books);

    Books queryBookById(@Param("bookId") int id);

    List<Books> queryAllBooks();

    Books queryBookByName(@Param("bookName") String bookName);
}
