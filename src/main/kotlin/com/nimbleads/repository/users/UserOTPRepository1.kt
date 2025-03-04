package com.nimbleads.repository.users

import com.nimbleads.model.users.UserOTP
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.transaction.annotation.Transactional

interface UserOTPRepository : JpaRepository<UserOTP?, Long?> {
    @Transactional
    fun deleteByEmail(email: String?)

    fun findByEmailAndOtp(email: String?, otp: String?): UserOTP?
}
