package com.nimbleads.model.users

import jakarta.persistence.*

import org.hibernate.annotations.NaturalId

@Entity
@Table(name = "role", schema = "auth_db", catalog = "auth_db")
class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null

    //@Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private var name: String? = null

    private val description: String? = null


    @ManyToMany
    @JoinTable(
        catalog = "auth_db",
        name = "rolespermissions",
        joinColumns = [JoinColumn(name = "role_id", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "permission_id", referencedColumnName = "id")]
    )
    private val privileges: Collection<Permissions>? = null


    constructor()

    constructor(name: String?) {
        this.name = name
    }
}
