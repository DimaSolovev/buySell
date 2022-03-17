package com.example.buysell.repositories;

import com.example.buysell.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.transform.sax.SAXTransformerFactory;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
