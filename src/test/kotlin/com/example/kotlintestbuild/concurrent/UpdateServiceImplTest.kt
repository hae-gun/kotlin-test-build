package com.example.kotlintestbuild.concurrent

import kotlinx.coroutines.*
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
@Transactional
class UpdateServiceImplTest (
){
    @Autowired
    private lateinit var service: UpdateService

    @BeforeEach
    fun setDomain() {

    }
    @RepeatedTest(3)
    fun getDomain() = runTest{
        service.enrollDomains(1, "myname", "myemail")

        service.updateDomainEmail(1, "change1")
        val job1 = async() {
            service.updateDomainEmail(1, "change2")
        }
        val job2 = async() {
            service.updateDomainEmail(1, "change1")
        }

        // 모든 작업이 완료될 때까지 대기
        job1.await()
        job2.await()
        val domainData = service.getDomainData(1)
        assertEquals(domainData.email, "change1")
    }

}