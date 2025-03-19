package com.nimbleads.controller

import com.nimbleads.payload.connect.ConnectionPayload
import com.nimbleads.service.connect.ConnectionService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/connections")
class ConnectionController(
    private val connectionService: ConnectionService
) {

    @GetMapping()
    fun getConnections(@RequestParam platform: String?): List<ConnectionPayload?>? {
        return connectionService.getLoggedInUserConnections(platform)
    }

}