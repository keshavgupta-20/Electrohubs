package com.lcwd.electronic.store.Electronic.store.Entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cart")
public class Cart {
    @Id
    private String cartId;

    private Date createdAt;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<CartItem> items = new ArrayList<>();

}
