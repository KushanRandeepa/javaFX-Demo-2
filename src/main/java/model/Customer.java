package model;

import lombok.*;


@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor


public class Customer {
    private String id;
    private String name;
    private String email;
    private double salary;

}
