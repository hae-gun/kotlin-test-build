package com.example.kotlintestbuild.concurrent

import kotlinx.coroutines.*
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
class UpdateServiceImplTest (
){
    @Autowired
    private lateinit var service: UpdateService

    @BeforeEach
    fun setDomain() {
        service.enrollDomains(1, "myname", "myemail")
    }
    @Test
    @Transactional
    fun getDomain() = runTest{
        val domainData = service.getDomainData(1)
        service.updateDomainEmail(1, "change1")
        val job1 = launch() {
            service.updateDomainEmail(1, "change1")
        }
        val job2 = launch() {
            service.updateDomainEmail(1, "change2")
        }
        // 모든 작업이 완료될 때까지 대기
        job2.join()
        job1.join()
        assertEquals(domainData.email, "change1")
    }

}