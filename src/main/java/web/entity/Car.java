package web.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    @Column(name = "brand")
    private String brand;

    @NonNull
    @Column(name = "model")
    private String model;

    @NonNull
    @Column(name = "engine")
    private float engine;

    @NonNull
    @Column(name = "color")
    private String color;

}
