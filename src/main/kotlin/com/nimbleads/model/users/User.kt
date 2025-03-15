package com.nimbleads.model.users


import jakarta.persistence.*
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

@Entity
@Table(
    name = "users", schema = "auth_db", catalog = "auth_db", uniqueConstraints = [UniqueConstraint(
        columnNames = ["email"
        ]
    )]
)
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @Column(name = "first_name")
    var firstName: String? = null

    @Column(name = "middle_name")
    var middleName: String? = null

    @Column(name = "last_name")
    var lastName: String? = null

    var email: String? = null
    val enabled = false

    @Size(max = 100)
    var password: String? = null

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    val customPermissions: List<CustomPermissions>? = null


    @ManyToMany
    @JoinTable(
        name = "user_roles",
        catalog = "auth_db",
        joinColumns = [JoinColumn(name = "user_id")],
        inverseJoinColumns = [JoinColumn(name = "role_id")]
    )
    val roles: List<Role> = ArrayList()

    constructor()

    constructor(
        firstName: String?, middleName: String?, lastName: String?,
        @NotBlank @Email email: String?, @NotBlank @Size(max = 100) password: String?
    ) {
        this.firstName = firstName
        this.middleName = middleName
        this.lastName = lastName
        this.email = email
        this.password = password
    }
}
