package com.example.kotlintestbuild.concurrent

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UpdateServiceImpl(
    val updateRepository : UpdateRepository
):UpdateService {
    @Transactional
    override fun updateDomainName(id: Long, name: String): UpdateClass {
        val domain = updateRepository.getReferenceById(id)
        domain.name = name
        return domain
    }
    @Transactional
    override fun updateDomainEmail(id: Long, email: String): UpdateClass {
        val domain = updateRepository.getReferenceById(id)
        domain.email = email
        return domain
    }

    override fun getDomainData(id: Long): UpdateClass {
        return updateRepository.getReferenceById(id)
    }
    @Transactional
    override fun enrollDomains(id: Long, name: String, email: String): UpdateClass {
        return updateRepository.save(UpdateClass(id, name, email))
    }
}