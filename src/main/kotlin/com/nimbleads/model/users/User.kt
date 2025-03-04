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
    private val id: Long? = null

    @Column(name = "first_name")
    private var firstName: String? = null

    @Column(name = "middle_name")
    private var middleName: String? = null

    @Column(name = "last_name")
    private var lastName: String? = null

    private var email: String? = null
    private val enabled = false

    @Size(max = 100)
    private var password: String? = null

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private val customPermissions: List<CustomPermissions>? = null


    @ManyToMany
    @JoinTable(
        name = "user_roles",
        catalog = "auth_db",
        joinColumns = [JoinColumn(name = "user_id")],
        inverseJoinColumns = [JoinColumn(name = "role_id")]
    )
    private val roles: List<Role> = ArrayList()

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
