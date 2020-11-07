package com.yaf.mademegood.model;

import lombok.*;

import javax.persistence.*;

/**
 * @author arda.fakili
 * @date 4.11.2020 15:22
 */

@Entity
@Table(name = "disease")
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
public class Disease {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    @NonNull
    private String name;

    @Getter
    @Setter
    @NonNull
    private String declaration;

    @Getter
    @Setter
    @NonNull
    private String category;

    @Getter
    @Setter
    private String explanation;


}
