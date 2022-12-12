/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii.co.id.serversideascent.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author lenovo
 */

@Entity
@Data
@NoArgsConstructor
@Table(name = "Aspirasi")
public class Aspirasi {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = false, name = "Subyek")
    private String subject;
    
    @Lob
    @Column(length = 1000, columnDefinition = "TEXT", name = "Deskripsi")
    private String description;
   
    @CreationTimestamp
    @Column(name = "date")
    private Date date;
    
}
//test commit coy