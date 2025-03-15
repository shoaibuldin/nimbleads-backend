package com.nimbleads.model.users

import jakarta.persistence.*

import org.hibernate.annotations.NaturalId

@Entity
@Table(name = "role", schema = "auth_db", catalog = "auth_db")
class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    //@Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    var name: String? = null

    val description: String? = null


    @ManyToMany
    @JoinTable(
        catalog = "auth_db",
        name = "rolespermissions",
        joinColumns = [JoinColumn(name = "role_id", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "permission_id", referencedColumnName = "id")]
    )
    val privileges: Collection<Permissions>? = null


    constructor()

    constructor(name: String?) {
        this.name = name
    }
}
