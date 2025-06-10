package com.gevernova.bookapp.entity;

import com.gevernova.bookapp.dto.AddressBookDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class AddressBookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String address;

    public AddressBookEntity(AddressBookDTO dto) {
        this.name = dto.getName();
        this.address = dto.getAddress();
    }
}
