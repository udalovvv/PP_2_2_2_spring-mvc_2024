package web.entity;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private long id;

    private String brand;

    private String model;

    private float engine;

    private String color;

}
