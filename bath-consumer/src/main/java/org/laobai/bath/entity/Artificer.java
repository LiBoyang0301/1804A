package org.laobai.bath.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jiusan
 * @since 2020-11-06
 */

public class Artificer implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 技师
     */
    private String name;

    /**
     * 等级
     */
    private Long level;

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
    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Artificer{" +
            "id=" + id +
            ", name=" + name +
            ", level=" + level +
        "}";
    }
}
