package org.zerhusen.model.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Message {
    @Id
    @Column
    @GeneratedValue
    private Long id;
    private String message;
}
