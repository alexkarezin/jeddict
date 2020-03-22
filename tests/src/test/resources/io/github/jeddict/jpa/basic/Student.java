/**
 * 11.1.6 Basic Annotation
 * Example 2
 */
package io.github.jeddict.jpa.basic;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;

/**
 * @author jGauravGupta
 */
@Entity
public class Student {

    @Id
    private Long id;

    @Basic(fetch = FetchType.LAZY)
    private String name;

    @Basic
    @Enumerated(EnumType.STRING)
    private GenderType genderType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenderType getGenderType() {
        return genderType;
    }

    public void setGenderType(GenderType genderType) {
        this.genderType = genderType;
    }

}
