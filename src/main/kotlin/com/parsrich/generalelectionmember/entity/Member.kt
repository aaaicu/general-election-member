package com.parsrich.generalelectionmember.entity

import jakarta.persistence.*

@Entity
class Member(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,
    @Column val email: String,
    @Column val accessToken: String,
    @Column val refreshToken: String,
    @Column val introduceContent: String,
    @Column val personalUrl: String,
    @Column val socialType: String,
    @Column val backingParty: String,
    @Column val politicalOrientation: String,
    @Column val politicalColor: String,
    @Column val conservativePercentage: String,
) {
}