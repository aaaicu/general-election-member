package com.parsrich.generalelectionmember.entity

import jakarta.persistence.*

@Entity
class Member(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,
    @Column val token: String
) {

}