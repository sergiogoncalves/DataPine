package com.datapine.domainobject;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
public class RoleDO {
    private Long id;
    private String name;
    private Set<UserDO> users;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @ManyToMany(mappedBy = "roles")
    public Set<UserDO> getUsers() {
        return users;
    }

    public void setUsers(Set<UserDO> users) {
        this.users = users;
    }
}
